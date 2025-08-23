public class Main {
        public static void main(String[] args) {
        Gerente G = new Gerente();
        G.setF("Adalberto",23.0);
        G.setG("Administração");

        G.mostraF();
        G.mostraG();

        Circulo C = new Circulo();
        C.setForm("Circulo", true);
        C.setC(10.0);
        C.calcularArea();

        Retangulo R = new Retangulo();
        R.setForm("Amarelo",false);
        R.setR(5.0,10.0);
        R.calcularArea();  
        
        Aluno A = new Aluno("Bernardo", 1897);
        A.exibirDados();
        
    
}
}
