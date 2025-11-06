package repositorio;

import modelo.Produto;

public class ProdutoRepositorio extends RepositorioBase<Produto> {

    @Override
    public Produto buscarPorId(int id) {
        for (Produto produto : itens) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}
