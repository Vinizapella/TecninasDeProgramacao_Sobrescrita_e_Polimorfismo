package atv3.Model;
import atv3.Model.Conta;
public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String numero, double taxaJuros) {
        super(numero);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString() {
        return "Conta Poupança número: " + numero + " - Juros: " + taxaJuros + "%";
    }


}
