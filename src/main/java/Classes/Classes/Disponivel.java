package Classes.Classes;

public class Disponivel {
    public static void main(String[] args) {

         Endereço endereço1 = new Endereço ("Rua euclides cunha n 10" ,100001001 , "1002121200", "Sao paulo", "SP" );
        Endereço endereço2 = new Endereço ("Rua aRGELIA n 10" ,15290222 , "06110280", "osasco", "SP" );
        Endereço endereço3 = new Endereço("Rua orquidea n20", 232332333 , "02922922" , "osascco" , "sp");
        Endereço endereço4 = new Endereço("Rua rogerio n20", 23555555 , "02933355" , "osascco" , "sp");
        Endereço endereço5 = new Endereço("Rua geordia n20", 232211553 , "029229444" , "osascco" , "sp");
        Endereço endereço6 = new Endereço("Rua rodrifo  n20", 23233643 , "0292242235" , "osascco" , "sp");

        Funcionarioo funcionarioo1 = new Funcionarioo("Leonardo", 121212222 , "Guincho_pesado_não_padrão" , "Disponivel" + endereço1) ;
        Funcionarioo funcionarioo2 = new Funcionarioo("Japa" , 1222222230 , "Guincho_pesado_com_plat_hidráulica_munck" , "Disponivel" + endereço2) ;
        Funcionarioo funcionarioo3 = new Funcionarioo("Gustavo" , 1222234730 , "Guincho_pesado_com_plataforma_hidráulica_e_band" , "Disponivel" + endereço3) ;
        Funcionarioo funcionarioo4 = new Funcionarioo("Lucas" , 1547779676 , "Guincho_pesado_com_quinta_roda_pesado_com_torre_e_lança" , "Disponivel" + endereço4) ;
        Funcionarioo funcionarioo5 = new Funcionarioo("cleber" , 989777777 , "Guincho_pesado_com_quinta_roda_e_lança" , "Disponivel" + endereço5) ;
        Funcionarioo funcionarioo6 = new Funcionarioo("Guiga" , 454545455 , "Guincho_técnico_pesado_para_quincho_pesado" , "Disponivel" + endereço6) ;

    }
}
