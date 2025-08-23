import java.util.ArrayList;

class Produto {
    private String nome_bernardo;
    private double preco_bernardo;
    private int quantidade_bernardo;
    
    Produto(String nome_bernardo, double preco_bernardo, int quantidade_bernardo) {
        this.nome_bernardo = nome_bernardo;
        this.preco_bernardo = preco_bernardo;
        this.quantidade_bernardo = quantidade_bernardo;
    }
    
    @Override
    public String toString() {
        return "Produto : " + nome_bernardo + " (" + quantidade_bernardo + ") - " + preco_bernardo;
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<Produto> produtos_bernardo = new ArrayList<>();
        
        produtos_bernardo.add(new Produto("Notebook", 2500.50, 10));
        produtos_bernardo.add(new Produto("Mouse", 45.90, 25));
        produtos_bernardo.add(new Produto("Teclado", 120.75, 15));
        produtos_bernardo.add(new Produto("Monitor", 850.00, 8));
        
        System.out.println("Lista de produtos:");
        for (Produto produto_local : produtos_bernardo) {
            System.out.println(produto_local);
        }
    }
}