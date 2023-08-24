package Menus;

import Guincho.*;
import java.util.Scanner;

class MenuChamado {
    public static void realizarChamado(Scanner scanner) {
        System.out.println("Chamado");

        System.out.println("Informe o peso do veículo:");
        int pesoVeiculo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("O veículo está tombado? (S/N):");
        String respostaTombado = scanner.nextLine();

        boolean veiculoTombado = respostaTombado.equalsIgnoreCase("S");

        Guincho[] guinchos = {
                new Guincho_pesado_com_plataforma_hidraulica_e_band(),
                new Guincho_pesado_com_quinta_roda_e_lanca(),
                new Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lanca(),
                new Guincho_pesado_não_padrao(),
                new Guincho_tecnico_pesado_para_quincho_pesado()
        };

        System.out.println("Guinchos disponíveis:");

        for (int i = 0; i < guinchos.length; i++) {
            if (guinchos[i].pesoAdequado(pesoVeiculo) &&
                    (!veiculoTombado || guinchos[i].podeLevantarTombado())) {
                System.out.println(i + 1 + " - " + guinchos[i].getNome());
            }
        }

        System.out.println("Selecione o guincho adequado:");
        int opcaoGuincho = scanner.nextInt();
        scanner.nextLine();

        if (opcaoGuincho >= 1 && opcaoGuincho <= guinchos.length) {
            Guincho guinchoSelecionado = guinchos[opcaoGuincho - 1];
            System.out.println("Guincho selecionado: " + guinchoSelecionado.getNome());
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
