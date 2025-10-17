public class ValidadorDepois {

    public String validarCompra(Cliente cliente, double valor) {
        if (cliente == null) return "NEGADO: cliente nulo";
        if (!cliente.estaAtivo()) return "NEGADO: cliente inativo";
        if (!cliente.temCredito()) return "NEGADO: sem credito";
        if (valor <= 0) return "NEGADO: valor invalido";
        if (valor > cliente.obterLimite()) return "NEGADO: limite excedido";

        return "APROVADO";
    }
}
