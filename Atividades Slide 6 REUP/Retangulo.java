public class Retangulo extends Forma{
    public Double largura;
    public Double altura;

    public void setR(Double largura, Double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public void calcularArea(){
        Double area = largura * altura;
        System.out.println("A altura é " + altura + "A largura é " + largura);
        System.out.println("A area do retangulo é" + area);
    }
}
