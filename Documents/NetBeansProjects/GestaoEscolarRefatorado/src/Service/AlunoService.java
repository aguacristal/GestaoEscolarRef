
package Service;

import Model.Aluno;
import Repositorio.AlunoRepository;
import Repositorio.NotaRepository;

public class AlunoService {
    private final AlunoRepository alunoRepo;
    private final NotaRepository notaRepo;

    public AlunoService(AlunoRepository alunoRepo, NotaRepository notaRepo) {
        this.alunoRepo = alunoRepo;
        this.notaRepo = notaRepo;
    }

    // Regra: aluno passa se média >= 5.0 (exemplo)
    public double calcularMedia(int alunoId) {
        return notaRepo.calcularMedia(alunoId);
    }

    public boolean estaEmRecuperacao(int alunoId) {
        return calcularMedia(alunoId) <= 4.0;
    }

    public void cadastrarAluno(Aluno aluno) {
        // validação simples
        if (aluno.getNome() == null || aluno.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome do aluno é obrigatório");
        }
        alunoRepo.salvar(aluno);
    }
}
