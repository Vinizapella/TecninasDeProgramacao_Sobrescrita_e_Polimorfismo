package atv2.Main;
import atv2.Model.Veiculo;
import atv2.Model.Moto;
import atv2.Model.Carro;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Veiculo("Genérico"));
        veiculos.add(new Carro("Toyota", 4));
        veiculos.add(new Carro("Honda", 2));
        veiculos.add(new Moto("Yamaha", true));
        veiculos.add(new Moto("Harley-Davidson", false));


        System.out.println("=== Atividade 2 - Veículos ===");
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }


}