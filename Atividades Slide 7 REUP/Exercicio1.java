import java.util.ArrayList;

class Forma {
    double area() {
        return 0.0;
    }
}

class Retangulo extends Forma {
    private double largura_bernardo;
    private double altura_bernardo;
    
    Retangulo(double largura_bernardo, double altura_bernardo) {
        this.largura_bernardo = largura_bernardo;
        this.altura_bernardo = altura_bernardo;
    }
    
    @Override
    double area() {
        return largura_bernardo * altura_bernardo;
    }
}

class Circulo extends Forma {
    private double raio_bernardo;
    
    Circulo(double raio_bernardo) {
        this.raio_bernardo = raio_bernardo;
    }
    
    @Override
    double area() {
        return Math.PI * raio_bernardo * raio_bernardo;
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<Forma> formas_bernardo = new ArrayList<>();
        
        formas_bernardo.add(new Retangulo(5.0, 3.0));
        formas_bernardo.add(new Circulo(2.0));
        formas_bernardo.add(new Retangulo(4.0, 6.0));
        formas_bernardo.add(new Circulo(1.5));
        
        double soma_areas = 0.0;
        
        for (Forma forma_local : formas_bernardo) {
            double area_atual = forma_local.area();
            System.out.println("Area : " + area_atual);
            soma_areas += area_atual;
        }
        
        System.out.println("Soma total das areas : " + soma_areas);
    }
}