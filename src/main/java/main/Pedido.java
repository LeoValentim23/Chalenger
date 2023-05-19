package main;

import java.util.Scanner;
import java.util.Random;

public class Pedido {

    public static void main(String[] args) {

        Scanner chamado = new Scanner(System.in);

        System.out.println("Bem vindo a Porto seguro, poderia me informar o CPF do cadastrado do veiculo. ");
        String CPF = chamado.next();

        System.out.println("O seu veiculo esta tombado?");
        String tombado = chamado.next();


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

        System.out.println("Chamado concluido!");

        Random gerador = new Random();

        for (int i = 0; i < 1; i++) {
            System.out.println("O numero do seu chamado:" + gerador.nextInt());
        }
    }
}
