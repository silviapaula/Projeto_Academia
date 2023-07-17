package Classes;

public class Recepcionista extends Funcionario {
  public Recepcionista(String nome, String telefone, String endereco, int idade, String matricula, double salario) {
    super(nome, telefone, endereco, idade, matricula, salario);
  }
  
  @Override
  public double calcularSalario() {
    double bonificacao = getSalario() * 0.2;
    return getSalario() + bonificacao;
  }

  public boolean liberarAcesso(Aluno aluno) {
    try {
      aluno.getPagamento().pagamentoPendente();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public void realizarPagamento(Aluno aluno) {
    try {
      aluno.getPagamento().realizarPagamento(this.getNome());
      System.out.println("O(a) aluno " + aluno.getNome() + " realizou o pagamento");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
