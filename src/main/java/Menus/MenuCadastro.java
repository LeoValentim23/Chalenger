package Menus;

import java.util.ArrayList;  // Importe a classe ArrayList
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Classe.Cliente;

public class MenuCadastro {
    private static ArrayList<Cliente> clientes = new ArrayList<>();  // Adicione a importação da classe ArrayList
    private static final String DB_URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String DB_USER = "seu_usuario";
    private static final String DB_PASSWORD = "sua_senha";

    public static void realizarCadastro(Scanner scanner) {
        System.out.println("Cadastro Cliente");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Qual o carro: ");
        String carro = scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Peso do veículo: ");
        String pesoVeiculo = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        Cliente novoCliente = new Cliente(nome, carro, placa, pesoVeiculo, cpf);
        clientes.add(novoCliente);

        inserirNoBancoDeDados(novoCliente);

        System.out.println("Cadastro realizado com sucesso!");
    }

    private static void inserirNoBancoDeDados(Cliente cliente) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "INSERT INTO clientes (nome, carro, placa, peso_veiculo, cpf) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, cliente.getNome());
                preparedStatement.setString(2, cliente.getCarro());
                preparedStatement.setString(3, cliente.getPlaca());
                preparedStatement.setString(4, cliente.getPesoVeiculo());
                preparedStatement.setString(5, cliente.getCpf());

                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




