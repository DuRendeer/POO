class Recibo implements Imprimivel {
    private String empresa;
    private String cliente;
    private double valor;
    private String descricao;
    private static int contador = 0;
    private int numero;

    public Recibo(String empresa, String cliente, double valor, String descricao) {
        this.empresa = empresa;
        this.cliente = cliente;
        this.valor = valor;
        this.descricao = descricao;
        this.numero = ++contador;
    }

    @Override
    public void imprimir() {
        System.out.println("=== RECIBO Nº " + numero + " ===");
        System.out.println("Empresa: " + empresa);
        System.out.println("Cliente: " + cliente);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("=========================");
    }
}