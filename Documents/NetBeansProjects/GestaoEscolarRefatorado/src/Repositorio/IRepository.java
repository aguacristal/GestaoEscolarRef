
package Repositorio;
import java.util.List;

public interface IRepository<T, K> {
    void salvar(T entity);
    T buscarPorId(K id);
    List<T> buscarTodos();
    void remover(K id);
}