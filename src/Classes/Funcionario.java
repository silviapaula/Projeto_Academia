package Classes;

public class Funcionario implements Membro {
  private String nome;
  private String telefone;
  private String endereco;
  private int idade;
  private String matricula;
  private double salario;

  public Funcionario(String nome, String telefone, String endereco, int idade, String matricula, double salario) {
    this.nome = nome;
    this.telefone = telefone;
    this.endereco = endereco;
    this.idade = idade;
    this.matricula = matricula;
    this.salario = salario;
  }

  public String getNome() {
    return this.nome;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public int getIdade() {
    return this.idade;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public double getSalario() {
    return this.salario;
  }

  public double calcularSalario() {
    return salario;
  }

  public double calcularSalario(double bonificacao, double desconto) {
    return salario + bonificacao - desconto;
  }
}
