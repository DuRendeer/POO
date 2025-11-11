package repositorio;

import modelo.Cliente;

public class ClienteRepositorio extends RepositorioBase<Cliente> {

    @Override
    public Cliente buscarPorId(int id) {
        for (Cliente cliente : itens) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    protected String getFileName() {
        return "Cliente.json";
    }
}
