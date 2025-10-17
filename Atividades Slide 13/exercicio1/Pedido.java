public class Pedido {
    private StatusPedido status;
    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
        this.status = StatusPedido.NOVO;
    }

    public void avancarStatus() {
        if (status == StatusPedido.NOVO) status = StatusPedido.PROCESSANDO;
        else if (status == StatusPedido.PROCESSANDO) status = StatusPedido.ENVIADO;
        else if (status == StatusPedido.ENVIADO) status = StatusPedido.ENTREGUE;
    }
}
