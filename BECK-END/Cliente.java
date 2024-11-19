public class Cliente {
  private String nome;
  private String cpf;
  private String telefone;
  private String endereco;

  public Cliente(String nome, String cpf, String telefone, String endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "Nome: " + this.nome + ", CPF: " + this.cpf + ", Telefone: " + this.telefone + ", Endereço: "
        + this.endereco;
  }
}