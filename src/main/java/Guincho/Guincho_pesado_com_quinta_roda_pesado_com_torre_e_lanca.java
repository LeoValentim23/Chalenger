package Guincho;

public class Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lanca extends Guincho {
    public Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lanca() {
        super("Guincho Pesado com Quinta Roda, Torre e Lança");
    }

    @Override
    public boolean pesoAdequado(int peso) {
        return peso > 300;
    }

    @Override
    public boolean podeLevantarTombado() {
        return true;
    }

    @Override
    public double getCapacidadePeso() {
        return 400;
    }
}
