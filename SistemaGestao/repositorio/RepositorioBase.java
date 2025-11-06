package repositorio;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioBase<T> implements Repositorio<T> {
    protected List<T> itens;
    protected int proximoId;

    public RepositorioBase() {
        this.itens = new ArrayList<>();
        this.proximoId = 1;
    }

    @Override
    public void adicionar(T item) {
        itens.add(item);
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(itens);
    }

    @Override
    public int gerarProximoId() {
        return proximoId++;
    }

    @Override
    public abstract T buscarPorId(int id);
}
