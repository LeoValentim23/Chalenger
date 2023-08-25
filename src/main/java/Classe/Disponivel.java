package Classe;

import java.util.ArrayList;
import java.util.List;

public class Disponivel {
    public static List<Funcionarioo> getFuncionariosDisponiveis() {
        Endereço endereço1 = new Endereço("Rua euclides cunha n 10", 100001001, "1002121200", "Sao paulo", "SP");
        Endereço endereço2 = new Endereço("Rua aRGELIA n 10", 15290222, "06110280", "osasco", "SP");
        Endereço endereço3 = new Endereço("Rua orquidea n20", 232332333, "02922922", "osasco", "SP");
        Endereço endereço4 = new Endereço("Rua rogerio n20", 23555555, "02933355", "osasco", "SP");
        Endereço endereço5 = new Endereço("Rua geordia n20", 232211553, "029229444", "osasco", "SP");
        Endereço endereço6 = new Endereço("Rua rodrifo n20", 23233643, "0292242235", "osasco", "SP");

        List<Funcionarioo> funcionariosDisponiveis = new ArrayList<>();
        funcionariosDisponiveis.add(new Funcionarioo("Leonardo", 121212222, "Guincho_pesado_não_padrão", "Disponivel", endereço1));
        funcionariosDisponiveis.add(new Funcionarioo("Japa", 1222222230, "Guincho_pesado_com_plat_hidráulica_munck", "Disponivel", endereço2));
        funcionariosDisponiveis.add(new Funcionarioo("Gustavo", 1222234730, "Guincho_pesado_com_plataforma_hidráulica_e_band", "Disponivel", endereço3));
        funcionariosDisponiveis.add(new Funcionarioo("Lucas", 1547779676, "Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lança", "Disponivel", endereço4));
        funcionariosDisponiveis.add(new Funcionarioo("cleber", 989777777, "Guincho_pesado_com_quinta_roda_e_lança", "Disponivel", endereço5));
        funcionariosDisponiveis.add(new Funcionarioo("Guiga", 454545455, "Guincho_técnico_pesado_para_quincho_pesado", "Disponivel", endereço6));

        return funcionariosDisponiveis;
    }
}
