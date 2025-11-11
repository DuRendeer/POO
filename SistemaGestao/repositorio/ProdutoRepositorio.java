package repositorio;

import modelo.Produto;

public class ProdutoRepositorio extends RepositorioBase<Produto> {

    public ProdutoRepositorio() {
        super();
    }

    @Override
    public Produto buscarPorId(int id) {
        for (Produto p : itens) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    protected String getFileName() {
        return "Produto.json"; 
    }
}
