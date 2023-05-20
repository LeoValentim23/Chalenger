package main;

public class Autorizador_guincho1 {
    public static void main(String[] args) {
        int peso = 85;
        boolean Guincho_pesado_não_padrão = true;

        if (peso > 10 && Guincho_pesado_não_padrão) {
            System.out.println("Parabéns! Você foi selecionado para uma vaga efeitva.");
        }  else {
            System.out.println("Você não foi selecionado desta vez. Tente novamente em breve.");
        }


        if (peso < 100 && Guincho_pesado_não_padrão) {
            System.out.println("Parabéns! Você foi selecionado para uma vaga efeitva.");
        }  else {
            System.out.println("Você não foi selecionado desta vez. Tente novamente em breve.");
        }
    }
}
