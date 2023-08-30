package Menus;

import Classe.*;
import Guincho.*;
import java.util.Scanner;
import java.util.List;

class MenuChamado {
    public static void realizarChamado(Scanner scanner, List<Funcionarioo> funcionariosDisponiveis) {
        System.out.println("Chamado");

        System.out.println("Informe o peso do veículo:");
        int pesoVeiculo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("O veículo está tombado? (S/N):");
        String respostaTombado = scanner.nextLine();

        boolean veiculoTombado = respostaTombado.equalsIgnoreCase("S");

        Guincho[] guinchos = {
                new Guincho_pesado_com_plat_hidraulica_munck(),
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
        scanner.nextLine(); // Consumir a quebra de linha

        if (opcaoGuincho >= 1 && opcaoGuincho <= guinchos.length) {
            Guincho guinchoSelecionado = guinchos[opcaoGuincho - 1];
            System.out.println("Guincho selecionado: " + guinchoSelecionado.getNome());

            Funcionarioo funcionarioDisponivel = encontrarFuncionario(guinchoSelecionado, funcionariosDisponiveis);

            if (funcionarioDisponivel != null) {
                System.out.println("Funcionário Disponível:");
                System.out.println("Nome: " + funcionarioDisponivel.getNome());
                System.out.println("Número: " + funcionarioDisponivel.getnumero());
                System.out.println("Status: " + funcionarioDisponivel.getStats());
                System.out.println("Endereço: " + funcionarioDisponivel.getEndereço().getLogradouro() + ", " +
                        funcionarioDisponivel.getEndereço().getNumero() + " - " +
                        funcionarioDisponivel.getEndereço().getCidade() + " - " +
                        funcionarioDisponivel.getEndereço().getEstado());
            } else {
                System.out.println("Nenhum funcionário disponível para esse guincho.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static Funcionarioo encontrarFuncionario(Guincho guincho, List<Funcionarioo> funcionariosDisponiveis) {
        System.out.println("Nome do guincho selecionado: " + guincho.getNome());

        for (Funcionarioo funcionario : funcionariosDisponiveis) {
            System.out.println("Nome do guincho no funcionário: " + funcionario.getGuinchoUtili());

            if (funcionario.getGuinchoUtili().equalsIgnoreCase(guincho.getClass().getSimpleName())) {
                return funcionario;
            }
        }
        return null;
    }


}