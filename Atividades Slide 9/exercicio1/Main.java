public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(5.0);
        FormaGeometrica retangulo = new Retangulo(4.0, 6.0);

        System.out.println("Area do circulo: " + circulo.calcularArea());
        System.out.println("Area do retângulo: " + retangulo.calcularArea());
    }
}