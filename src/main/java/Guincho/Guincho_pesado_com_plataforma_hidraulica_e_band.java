package Guincho;

public class Guincho_pesado_com_plataforma_hidraulica_e_band extends Guincho {
    public Guincho_pesado_com_plataforma_hidraulica_e_band() {
        super("Guincho Pesado com Plataforma Hidráulica e Bandeira");
    }

    @Override
    public boolean pesoAdequado(int peso) {
        return peso < 100;
    }

    @Override
    public boolean podeLevantarTombado() {
        return true;
    }
}

