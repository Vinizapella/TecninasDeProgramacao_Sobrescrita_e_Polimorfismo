package atv4.Model;

public class Dispositivo {
    protected String nome;

    public Dispositivo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Dispositivo: " + nome;
    }


}