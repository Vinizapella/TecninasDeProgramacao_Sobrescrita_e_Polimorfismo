package atv3.Main;
import atv3.Model.Conta;
import atv3.Model.ContaCorrente;
import atv3.Model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta("00001"));
        contas.add(new ContaCorrente("12345", 1000.00));
        contas.add(new ContaCorrente("67890", 2500.00));
        contas.add(new ContaPoupanca("11111", 0.5));
        contas.add(new ContaPoupanca("22222", 0.75));

        System.out.println("=== Atividade 3 - Contas Bancárias ===");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }


}
