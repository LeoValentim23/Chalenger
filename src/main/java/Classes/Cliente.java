package Classes;

import java.util.Date;

public class Cliente {
        public String nome;
        public String cpf;
        public Date data_nascimento;
        public String email;
        public double telefone;

        public Cliente (String _nome, String _cpf, Date _data , String _email , double _telefone) {
            this.nome = _nome;
            this.cpf = _cpf;
            this.data_nascimento = _data;
            this.email = _email;
            this.telefone = _telefone;
        }
    }
}
