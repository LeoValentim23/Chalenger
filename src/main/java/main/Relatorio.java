package main;

import java.util.Scanner;

public class Relatorio {
    public static void main(String[] args) {
        Scanner relatorio = new Scanner(System.in);

        System.out.println("ola, queria realizar alguns tipos de pergunta do seu chamado , no qual são?");
        System.out.println(" o guincho foi enviado corretamente?   ");
        String correto = relatorio.next();

        System.out.println("Ok, voce acha que foi boa o atendimento?");
        String atendimento = relatorio.next();

        System.out.println("Obrigado por responder o relatorio,  tenha um otimo dia!");



    }

}
