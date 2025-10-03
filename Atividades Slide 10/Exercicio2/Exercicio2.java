public class Exercicio2 {
    public static void main(String[] args) {
        // Teste valido
        try {
            Usuario usuario1 = new Usuario("Moaca", 25);
            System.out.println("Usuario cadastrado: " + usuario1.getNome() + ", " + usuario1.getIdade() + " anos");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro " + e.getMessage());
        }

        // Teste invalido
        try {
            Usuario usuario2 = new Usuario("Bernardo", 16);
            System.out.println("Usuario cadastrado: " + usuario2.getNome() + ", " + usuario2.getIdade() + " anos");
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
