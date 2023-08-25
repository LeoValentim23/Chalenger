package Guincho;

public class Guincho_pesado_com_plat_hidraulica_munck extends Guincho {
    public Guincho_pesado_com_plat_hidraulica_munck() {
        super("Guincho Pesado com Plataforma Hidráulica Munck");
    }

    @Override
    public boolean pesoAdequado(int peso) {
        return peso < 100;
    }

    @Override
    public boolean podeLevantarTombado() {
        return false;
    }
}


