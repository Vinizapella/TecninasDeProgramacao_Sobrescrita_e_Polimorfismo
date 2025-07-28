package atv4.Main;
import atv4.Model.Dispositivo;
import atv4.Model.Smartphone;
import atv4.Model.Notebook;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Dispositivo("Dispositivo Genérico"));
        dispositivos.add(new Smartphone("iPhone 15", "iOS"));
        dispositivos.add(new Smartphone("Galaxy S24", "Android"));
        dispositivos.add(new Notebook("MacBook Pro", 14.0));
        dispositivos.add(new Notebook("Dell XPS", 15.6));

        System.out.println("=== Atividade 4 - Dispositivos Eletrônicos ===");
        for (Dispositivo dispositivo : dispositivos) {
            System.out.println(dispositivo);
        }
    }


}