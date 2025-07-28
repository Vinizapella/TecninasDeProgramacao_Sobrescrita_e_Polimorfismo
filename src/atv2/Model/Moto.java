package atv2.Model;
import atv2.Model.Veiculo;

public class Moto extends Veiculo {
    private boolean temCarenagem;


    public Moto(String marca, boolean temCarenagem) {
        super(marca);
        this.temCarenagem = temCarenagem;
    }

    @Override
    public String toString() {
        String carenagem = temCarenagem ? "Com carenagem" : "Sem carenagem";
        return "Moto: " + marca + " - " + carenagem;
    }


}