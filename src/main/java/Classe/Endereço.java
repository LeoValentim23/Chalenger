package Classe;

public class Endereço {

    private String cidade;
    private String estado;
    private int numero;
    private String logradouro;
    private String cep;

    public Endereço (String logradouro , int numero , String cep, String cidade , String estado) {

        this.logradouro = logradouro;
        this.cep = cep ;
        this.cidade =cidade;
        this.estado = estado;
        this.numero =numero;

    }

    public String getLogradouro(){

        return logradouro;

    }

    public void setLogradouro (String logradouro) {
        this.logradouro=logradouro;
    }

    public String getCidade(){

        return cidade;

    }

    public void setCidade (String cidade) {
        this.cidade=cidade;
    }

    public String getEstado(){

        return estado;

    }

    public void setEstado (String estado) {
        this.estado=estado;
    }

    public String getCep(){

        return cep;

    }

    public void setCep (String cep) {
        this.cep=cep;
    }

    public int getNumero(){

        return numero;

    }

    public void setNumero (int numero) {
        this.numero =numero;
    }

}
