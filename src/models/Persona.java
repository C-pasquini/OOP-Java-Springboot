package models;

public class Persona {
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    String nome;
    String cognome;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
}
