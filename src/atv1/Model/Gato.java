package atv1.Model;
import atv1.Model.Animal;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }


    @Override
    public String toString() {
        return "Gato: " + nome + " - Miau!";
    }



}