import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstadosCidades {

    public static void adicionarCidade(Map<String, List<String>> mapa, String estado, String cidade) {
        if (!mapa.containsKey(estado)) {
            mapa.put(estado, new ArrayList<>());
        }
        mapa.get(estado).add(cidade);
    }

    public static List<String> cidadesDoEstado(Map<String, List<String>> mapa, String estado) {
        return mapa.getOrDefault(estado, new ArrayList<>());
    }

    

    public static void main(String[] args) {
        Map<String, List<String>> estadosCidades = new HashMap<>();

        adicionarCidade(estadosCidades, "SP", "Sao Paulo");
        adicionarCidade(estadosCidades, "SP", "Ribeirao Preto");

        adicionarCidade(estadosCidades, "RJ", "Niteroi");
        adicionarCidade(estadosCidades, "RJ", "Petropolis");
        adicionarCidade(estadosCidades, "MG", "Uberlandia");
        adicionarCidade(estadosCidades, "MG", "Ouro Preto");

        adicionarCidade(estadosCidades, "BA", "Salvador");
        adicionarCidade(estadosCidades, "BA", "Feira de Santana");

        System.out.println("Todas as cidades por estado:\n");
        for (String estado : estadosCidades.keySet()) {
            System.out.println(estado + ":");
            for (String cidade : cidadesDoEstado(estadosCidades, estado)) {
                System.out.println("  - " + cidade);
            }
            System.out.println();
        }

        System.out.println("Cidades de SP:");
        for (String cidade : cidadesDoEstado(estadosCidades, "SP")) {
            System.out.println("  - " + cidade);
        }
    }
}
