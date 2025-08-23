public class Circulo  extends Forma{
    public Double raio;


    public void setC(Double raio){
        this.raio = raio;
    }

    public void calcularArea(){
        Double area = raio * raio * 3.14;
        System.out.println("O raio é " + raio);
        System.out.println("A area do circulo é" + area);
    }
}
