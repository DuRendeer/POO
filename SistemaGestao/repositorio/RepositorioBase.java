package repositorio;

import java.util.ArrayList;
import java.util.List;
import dados.JsonDatabase;

public abstract class RepositorioBase<T> implements Repositorio<T> {
    protected List<T> itens;
    protected int proximoId;
    private JsonDatabase jsonDb = new JsonDatabase();

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

    // --- NOVOS MÉTODOS PARA PERSISTÊNCIA ---

    /**
     * Salva a lista atual em arquivo JSON dentro da pasta "dados/".
     * Cada repositório concreto deve informar o nome do arquivo via getFileName().
     */
    public void salvar() {
        String caminho = "dados/" + getFileName();
        jsonDb.salvar(caminho, listarTodos());
    }

    /**
     * Preenche a lista interna com os dados carregados do JSON.
     */
    public void carregarLista(List<T> dados) {
        if (dados == null) {
            this.itens = new ArrayList<>();
        } else {
            this.itens = new ArrayList<>(dados);
        }
        this.proximoId = itens.isEmpty() ? 1 : itens.size() + 1;
    }

    /**
     * Cada repositório deve retornar o nome do arquivo JSON (ex: "Cliente.json")
     */
    protected abstract String getFileName();
}
