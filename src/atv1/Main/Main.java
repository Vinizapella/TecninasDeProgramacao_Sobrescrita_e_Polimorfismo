package atv1.Main;
import atv1.Model.Animal;
import atv1.Model.Cachorro;
import atv1.Model.Gato;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("Rex"));
        animais.add(new Cachorro("Buddy"));
        animais.add(new Gato("Whiskers"));
        animais.add(new Cachorro("Max"));
        animais.add(new Gato("Mittens"));


        System.out.println("=== Atividade 1 - Animais de Estimação ===");
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }


}