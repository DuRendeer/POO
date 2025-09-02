import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    abstract void emitirSom();
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Miau");
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new Gato());
        
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}