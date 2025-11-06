package repositorio;

import java.util.List;

public interface Repositorio<T> {
    void adicionar(T item);
    T buscarPorId(int id);
    List<T> listarTodos();
    int gerarProximoId();
}
