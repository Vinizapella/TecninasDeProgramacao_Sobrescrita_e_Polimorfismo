package atv2.Model;

public class Veiculo {
    protected String marca;


    public Veiculo(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veículo: " + marca;
    }


}