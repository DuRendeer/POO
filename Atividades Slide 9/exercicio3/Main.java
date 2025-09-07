public class Main {
    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio("Relatório Mensal", 
            "Vendas aumentaram eu acho");
        
        Imprimivel recibo1 = new Recibo("Codduo", "Moaca Psor", 
            250.00, "Um Site Top");
        
        Imprimivel recibo2 = new Recibo("Macarao", "Bernardo", 
            450.50, "Desenvolvimento de website");

        relatorio.imprimir();
        System.out.println();
        
        recibo1.imprimir();
        System.out.println();
        
        recibo2.imprimir();
    }
}