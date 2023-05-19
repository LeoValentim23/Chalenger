package Classes;

public class Funcionarioo {
    private String Nome;
    private String GuinchoUtili;
    private int numero;



    public Funcionarioo(String Nome, int numero, String endereço) {

        this.Nome = Nome;

        this.GuinchoUtili = GuinchoUtili;
        this.numero = numero;

    }

    public String getNome() {
        return Nome;

    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }


    public String getGuinchoUtili() {
        return GuinchoUtili;

    }

    public void GuinchoUtili(String GuinchoUtili) {
        this.GuinchoUtili = GuinchoUtili;
    }

    public int getnumero() {
        return numero;

    }

    public void numero(int numero) {
        this.numero = numero;
    }
}
