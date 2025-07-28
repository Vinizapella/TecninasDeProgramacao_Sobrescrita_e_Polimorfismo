package atv3.Model;
import atv3.Model.Conta;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double limiteChequeEspecial) {
        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return "Conta Corrente número: " + numero + " - Limite: R$ " + limiteChequeEspecial;
    }


}