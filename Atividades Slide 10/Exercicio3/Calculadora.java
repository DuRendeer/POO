public class Calculadora {
    public int dividir(int a, int b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Não é possível dividir por zero né piazin");
        }
        return a / b;
    }
}
