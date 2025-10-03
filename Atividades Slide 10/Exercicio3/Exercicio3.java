public class Exercicio3 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Teste da divisão valida
        try {
            int resultado = calc.dividir(10, 2);
            System.out.println("Resultado: 10 / 2 = " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Teste de divisão por zero
        try {
            int resultado = calc.dividir(10, 0);
            System.out.println("Resultado: 10 / 0 = " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro " + e.getMessage());
        }

        // Teste a+
        try {
            int resultado = calc.dividir(100, 5);
            System.out.println("Resultado: 100 / 5 = " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
