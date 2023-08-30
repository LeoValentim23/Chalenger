package Classe;

public class Funcionarioo {
    private String Nome;
    private String GuinchoUtili;
    private int numero;
    private String stats;
    private Endereço endereço;

    public Funcionarioo(String Nome, int numero, String GuinchoUtili, String stats, Endereço endereço) {
        this.Nome = Nome;
        this.stats = stats;
        this.GuinchoUtili = GuinchoUtili;
        this.numero = numero;
        this.endereço = endereço;
    }

    public String getNome() {
        return Nome;
    }


    public String getGuinchoUtili() {
        return GuinchoUtili;
    }



    public int getnumero() {
        return numero;
    }



    public String getStats() {
        return stats;
    }



    public Endereço getEndereço() {
        return endereço;
    }


}
