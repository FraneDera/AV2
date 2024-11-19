import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cadastro cadastro = new Cadastro();

    while (true) {
      System.out.println("1. Adicionar Cliente");
      System.out.println("2. Listar Clientes");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");

      int opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        case 1:
          System.out.println("Digite o nome do cliente: ");
          String nome = scanner.nextLine();
          System.out.println("Digite o cpf do cliente: ");
          String cpf = scanner.nextLine();
          System.out.println("Digite o telefone do cliente: ");
          String telefone = scanner.nextLine();
          System.out.println("Digite o endereço do cliente: ");
          String endereco = scanner.nextLine();

          // Criando cadastro do novo cliente
          Cliente cliente = new Cliente(nome, cpf, telefone, endereco);
          cadastro.adicionarCliente(cliente);

          break;

        case 2:
          System.out.println("Listando cadastro dos clientes...");
          // Listando cadastro dos clientes
          cadastro.listarClientes();
          break;

        case 3:
          System.out.println("Saindo...");
          scanner.close();
          return;

        default:
          System.out.println("Opção inválida");
      }
    }
  }
}