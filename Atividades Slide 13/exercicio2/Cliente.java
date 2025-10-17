public class Cliente {
    private String nome;
    private boolean ativo;
    private boolean temCredito;
    private double limite;

    public Cliente(String nome, double limite) {
        this.nome = nome;
        this.limite = limite;
        this.ativo = true;
        this.temCredito = true;
    }

    public boolean estaAtivo() {
        return ativo;
    }

    public boolean temCredito() {
        return temCredito;
    }

    public double obterLimite() {
        return limite;
    }

    public void desativar() {
        ativo = false;
    }

    public void bloquearCredito() {
        temCredito = false;
    }
}
