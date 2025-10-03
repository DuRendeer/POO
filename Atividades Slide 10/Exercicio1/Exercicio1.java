public class Exercicio1 {
    public static void main(String[] args) {
        try {
            int[] numeros = {10, 20, 30, 40, 50};
            System.out.println("Acessando indice 2: " + numeros[2]);
            System.out.println("Acessando indice 10: " + numeros[10]); // Gera ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro indice invalido");
            System.out.println("Mensagem: " + e.getMessage());
        } finally {
            System.out.println("Fim Piazao");
        }
    }
}
