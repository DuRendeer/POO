import java.util.ArrayList;
import java.util.Random;

public class ListaRandom {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("Bernardo Senior");
        nomes.add("Bernardo");
        nomes.add("Bernardo Junior");
        nomes.add("Jorlan");
        nomes.add("Pedro");
        
        Random gerador = new Random();
        int indice = gerador.nextInt(nomes.size());
        
        String nomeSorteado = nomes.get(indice);
        System.out.println("Nome sorteado: " + nomeSorteado);
    }
}