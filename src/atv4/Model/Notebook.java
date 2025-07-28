package atv4.Model;
import atv4.Model.Dispositivo;

public class Notebook extends Dispositivo {
    private double tamanhoTela;

    public Notebook(String nome, double tamanhoTela) {
        super(nome);
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String toString() {
        return "Notebook: " + nome + " - Tela: " + tamanhoTela + " polegadas";
    }


}