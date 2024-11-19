import java.util.ArrayList;
import java.util.List;

public class Cadastro {
  private List<Cliente> clientes;

  public Cadastro() {
    this.clientes = new ArrayList<Cliente>();
  }

  public void adicionarCliente(Cliente cliente) {
    clientes.add(cliente);
    System.out.println("Cliente cadastrado com sucesso!!!");
  }

  public void listarClientes() {
    if (clientes.isEmpty()) {
      System.out.println("Nenhuma cliente cadastrado!!!");
      return;
    }
    System.out.println("Listando...");
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
    }
  }
}