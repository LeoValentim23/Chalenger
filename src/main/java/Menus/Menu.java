package Menus;

import Classe.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import Conexão.ConnectionManager;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        List<Funcionarioo> funcionariosDisponiveis = new ArrayList<>();

        System.out.println("Bem-vindo ao Menu Principal!");

        while (true) {
            System.out.println("Selecione a opção:");
            System.out.println("1 - Cadastro Cliente");
            System.out.println("2 - Nossos Objetivos");
            System.out.println("3 - Chamado");
            System.out.println("0 - Sair");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        MenuCadastro.realizarCadastro(scanner, new ConnectionManager());
                        break;
                    case 2:
                        MenuNossosObjetivos.exibirObjetivos();
                        break;
                    case 3:
                        MenuChamado.realizarChamado(scanner, funcionariosDisponiveis);
                        break;
                    case 0:
                        System.out.println("Obrigado por utilizar o sistema!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine();
            }
        }
    }
}
