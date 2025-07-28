package atv3.Model;
import atv3.Model.Conta;

public class Conta {
    protected String numero;


    public Conta(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta número: " + numero;
    }



}