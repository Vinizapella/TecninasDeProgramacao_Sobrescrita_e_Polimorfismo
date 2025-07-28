package atv2.Model;
import atv2.Model.Veiculo;
public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, int numeroDePortas) {
        super(marca);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return "Carro: " + marca + " - " + numeroDePortas + " portas";
    }


}