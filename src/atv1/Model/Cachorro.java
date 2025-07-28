package atv1.Model;
import atv1.Model.Animal;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Cachorro: " + nome + " - Au Au!";
    }


}