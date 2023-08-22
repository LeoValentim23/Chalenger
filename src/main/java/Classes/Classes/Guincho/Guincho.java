package Classes.Classes.Guincho;

public abstract class Guincho {

    private String nome;

    public Guincho(String nome) {
        this.nome = nome;
    }

    public abstract boolean pesoAdequada(int peso);


}


