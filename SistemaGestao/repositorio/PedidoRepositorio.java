package repositorio;

import modelo.Pedido;

public class PedidoRepositorio extends RepositorioBase<Pedido> {

    @Override
    public Pedido buscarPorId(int id) {
        for (Pedido pedido : itens) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }
        return null;
    }
}
