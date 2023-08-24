package Guincho;

public class Guincho_tecnico_pesado_para_quincho_pesado extends Guincho {
    public Guincho_tecnico_pesado_para_quincho_pesado() {
        super("Guincho Técnico Pesado para Guincho Pesado");
    }

    @Override
    public boolean pesoAdequado(int peso) {
        return peso > 500;
    }

    @Override
    public boolean podeLevantarTombado() {
        return true;
    }
}