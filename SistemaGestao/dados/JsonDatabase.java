package dados;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonDatabase {
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public <T> void salvar(String nomeArquivo, List<T> dados) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            gson.toJson(dados, writer);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    public <T> List<T> carregar(String nomeArquivo, Class<T[]> tipoArray) {
        try (FileReader reader = new FileReader(nomeArquivo)) {
            T[] array = gson.fromJson(reader, tipoArray);
            return Arrays.asList(array);
        } catch (IOException e) {
            return new java.util.ArrayList<>();
        }
    }
}
