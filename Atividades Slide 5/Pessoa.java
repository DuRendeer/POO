import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        Pessoa pessoa = new Pessoa(nome, idade);
        
        System.out.println("Nome " + pessoa.nome + ", Idade eh " + pessoa.idade);
    }
}