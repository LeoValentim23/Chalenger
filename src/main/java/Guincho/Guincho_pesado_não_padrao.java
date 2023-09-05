package Guincho;

public class Guincho_pesado_não_padrao extends Guincho {
    public Guincho_pesado_não_padrao() {
        super("Guincho Pesado Não Padrão");
    }

    @Override
    public boolean pesoAdequado(int peso) {
        return peso > 500;
    }

    @Override
    public boolean podeLevantarTombado() {
        return false;
    }

    @Override
    public double getCapacidadePeso() {
        return 600;
    }
}
