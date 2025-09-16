
package Repositorio;

import Model.Aluno;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AlunoRepository implements IRepository<Aluno, Integer> {
    private final Map<Integer, Aluno> db = new HashMap<>();
    private final AtomicInteger seq = new AtomicInteger(0);

    @Override
    public void salvar(Aluno aluno) {
        if (aluno.getId() == 0) {
            int id = seq.incrementAndGet();
            aluno.setId(id);
        }
        db.put(aluno.getId(), aluno);
    }

    @Override
    public Aluno buscarPorId(Integer id) {
        return db.get(id);
    }

    @Override
    public List<Aluno> buscarTodos() {
        return new ArrayList<>(db.values());
    }

    @Override
    public void remover(Integer id) {
        db.remove(id);
    }

   
}