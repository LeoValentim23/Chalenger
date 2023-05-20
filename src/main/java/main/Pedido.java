package main;

import java.util.Scanner;
import java.util.Random;

public class Pedido {

    public static void main(String[] args) {

        Scanner chamado = new Scanner(System.in);
        boolean Guincho_pesado_não_padrão = true;
        boolean Guincho_pesado_com_plat_hidráulica_munck= true;
        boolean Guincho_pesado_com_plataforma_hidráulica_e_band = true;
        boolean Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lança = true;
        boolean Guincho_pesado_com_quinta_roda_e_lança = true;
        boolean Guincho_técnico_pesado_para_quincho_pesado = true;

        System.out.println("Bem vindo a Porto seguro, poderia me informar o CPF do cadastrado do veiculo. ");
        String CPF = chamado.next();

        System.out.println("O seu veiculo esta tombado?"+
                " 1 - Sim" +
                " 2 - Não");
        int tombado = chamado.nextInt();

        System.out.println("O seu veiculo e a carga esta pesando quanto?");
        int peso =chamado.nextInt();


        System.out.println("Ok, tudo bem , encontrado o cadastrado");

        for (int resposta = 1;  resposta ==1 ; resposta = chamado.nextInt()) {
            System.out.println("Por favor , me informe o que aconteceu?");
            String ACONTECIMENTO = chamado.next();

            System.out.println("Tudo bem , agora me informe o estado do veiculo?");
            String estado = chamado.next();


            System.out.println("ok, Quer adicionar mais alguma informaçao" +
                    "  1 - sim" +
                    "  2 - Nao");

        }


        //se os  tres apresentarem  Guincho aprovado , ele esta sendo liberado para utiliar o chamado

        System.out.println("Guincho_pesado_não_padrão");
        if (peso > 10 && Guincho_pesado_não_padrão) {
            System.out.println("Guincho aprovado.");
        }  else {
            System.out.println("Guincho NÃO aprovado.");
        }


        if (peso < 100 && Guincho_pesado_não_padrão) {
            System.out.println("Guincho aprovado.");
        }  else {
            System.out.println("Guincho NÃO aprovado.");
        }
        if (tombado == 1 && Guincho_pesado_não_padrão) {
            System.out.println("Guincho NÃO aprovado");
        } else {
            System.out.println("Guincho aprovado");
        }







        System.out.println("Guincho_pesado_com_plat_hidráulica_munck");
        if (peso > 10 && Guincho_pesado_com_plat_hidráulica_munck) {
            System.out.println("Guincho aprovado.");
        } else {
            System.out.println("Guincho NÃO aprovado.");
        }


        if (peso < 200 && Guincho_pesado_com_plat_hidráulica_munck) {
            System.out.println(" Guincho aprovado.");
        }  else {
            System.out.println("Guincho NÃO aprovado.");
        }
        if (tombado == 1 && Guincho_pesado_com_plat_hidráulica_munck) {
            System.out.println("Guincho NÃO aprovado");
        } else {
            System.out.println("Guincho  aprovado");
        }






        System.out.println("Guincho_pesado_com_plataforma_hidráulica_e_band");
        if (peso > 10 && Guincho_pesado_com_plataforma_hidráulica_e_band) {
            System.out.println("Guincho aprovado.");
        } else {
            System.out.println("Guincho NÃO aprovado.");
        }


        if (peso < 300 && Guincho_pesado_com_plataforma_hidráulica_e_band) {
            System.out.println("Guincho aprovado.");
        }  else {
            System.out.println("Guincho NÃO aprovado.");
        }
        if (tombado == 1 && Guincho_pesado_com_plataforma_hidráulica_e_band) {
            System.out.println("Guincho NÃO aprovado");
        } else {
            System.out.println("Guincho aprovado");
        }






        System.out.println("Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lança ");
        if (peso > 10 && Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lança) {
            System.out.println("Guincho aprovado.");
        } else {
            System.out.println("Guincho NÃO aprovado.");
        }


        if (peso < 100 && Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lança) {
            System.out.println("Guincho aprovado.");
        }  else {
            System.out.println("Guincho NÃO aprovado.");
        }

        if (tombado == 1 && Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lança) {
            System.out.println("Guincho aprovado");
        } else {
            System.out.println("Guincho NÃO aprovado");
        }




        System.out.println("Guincho_pesado_com_quinta_roda_e_lança");
        if (peso > 10 && Guincho_pesado_com_quinta_roda_e_lança) {
            System.out.println("Guincho aprovado.");
        } else {
            System.out.println("Guincho NÃO aprovado.");
        }


        if (peso < 200 && Guincho_pesado_com_quinta_roda_e_lança) {
            System.out.println("Guincho aprovado.");
        }  else {
            System.out.println("Guincho NÃO aprovado.");
        }

        if (tombado == 1 && Guincho_pesado_com_quinta_roda_e_lança) {
            System.out.println("Guincho aprovado");
        } else {
            System.out.println("Guincho NÃO aprovado");
        }



        System.out.println("Guincho_técnico_pesado_para_quincho_pesado");
        if (peso > 10 && Guincho_técnico_pesado_para_quincho_pesado) {
            System.out.println("Guincho aprovado.");
        } else {
            System.out.println("Guincho NÃO aprovado.");
        }


        if (peso < 300 && Guincho_técnico_pesado_para_quincho_pesado) {
            System.out.println("Guincho aprovado.");
        }  else {
            System.out.println("Guincho NÃO aprovado.");
        }

        if (tombado == 1 && Guincho_técnico_pesado_para_quincho_pesado) {
            System.out.println("Guincho aprovado");
        } else {
            System.out.println("Guincho NÃO aprovado");
        }




        System.out.println("Chamado concluido!");

        Random gerador = new Random();

        for (int i = 0; i < 1; i++) {
            System.out.println("O numero do seu chamado:" + gerador.nextInt());
        }
    }
}
