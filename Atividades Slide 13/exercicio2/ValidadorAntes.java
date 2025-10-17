public class ValidadorAntes {

    public String validarCompra(Cliente cliente, double valor) {
        if (cliente != null) {
            if (cliente.estaAtivo()) {
                if (cliente.temCredito()) {
                    if (valor > 0) {
                        if (valor <= cliente.obterLimite()) {
                            return "APROVADO";
                        } else {
                            return "NEGADO: limite excedido";
                        }
                    } else {
                        return "NEGADO: valor invalido";
                    }
                } else {
                    return "NEGADO: sem credito";
                }
            } else {
                return "NEGADO: cliente inativo";
            }
        } else {
            return "NEGADO: cliente nulo";
        }
    }
}
