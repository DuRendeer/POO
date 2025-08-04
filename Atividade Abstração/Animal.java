public class Animal {
    String nome;
    String especie;
    int idade;
    
    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
    
    public void fazerBarulho() {
        System.out.println(nome + " o " + especie + " ta fazendo barulho");
    }
    
    public void exibirDados() {
        System.out.println("Animal " + nome);
        System.out.println("Especie " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Animal cachorro = new Animal("Tsatsa", "Cachorro", 11);
        Animal gato = new Animal("Bloco de Neve", "Gato", 3);
        
        cachorro.exibirDados();
        gato.exibirDados();
        
        cachorro.fazerBarulho();
        gato.fazerBarulho();


    }
}