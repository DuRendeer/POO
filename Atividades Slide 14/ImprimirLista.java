import java.util.List;
import java.util.ArrayList;

public class ImprimirLista {

    public static void imprimirLista(List<?> lista) {
        for (Object item : lista) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Bernardo");
        nomes.add("Moaca");
        nomes.add("Barbosa");

        System.out.println("Lista de nomes:");
        imprimirLista(nomes);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(42);
        numeros.add(87);
        numeros.add(15);

        System.out.println("\nLista de numeros:");
        imprimirLista(numeros);

        List<Double> precos = new ArrayList<>();
        precos.add(19.90);
        precos.add(45.50);
        precos.add(123.75);

        System.out.println("\nLista de precos:");
        imprimirLista(precos);
    }
}
