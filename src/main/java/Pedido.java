import java.util.Scanner;

public class Pedido {

    public static void main(String[] args) {

        Scanner chamado = new Scanner(System.in);

        System.out.println("Bem vindo a Porto seguro, poderia me informar o CPF do cadastrado do veiculo. ");
        String CPF = chamado.next();

        System.out.println("Ok, tudo bem , encontrado o cadastrado");
        System.out.println("Por favor , me informe o que aconteceu?");

        String ACONTECIMENTO = chamado.next();

        System.out.println("Tudo bem , agora me informe o estado do veiculo?");

        String estado = chamado.next();

        System.out.println("O seu veiculo esta tombado?");

        String tombado = chamado.next();
    }
}
