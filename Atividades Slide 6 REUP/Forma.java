public class Forma {
    public String cor;
    public Boolean preenchida;

    public void setForm(String cor, Boolean preenchida){
        this.cor = cor;
        this.preenchida = preenchida;

    }
    
    public void mostraForma(){
        System.out.println("Cor" + cor);
        System.out.println("Ta preenchida? " + preenchida);
    }
}
