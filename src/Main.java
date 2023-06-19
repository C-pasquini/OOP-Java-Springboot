import models.Persona;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("TF2 classic funny moments");

        Persona antonio = new Persona("Antonio", "Carosella");

        System.out.println(antonio.getNome());
        System.out.println(antonio.getCognome());
    }
}
