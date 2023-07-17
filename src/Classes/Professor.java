package Classes;

import java.util.Map;
import java.util.HashMap;
import java.lang.Exception;

public class Professor extends Funcionario {
  private String horario;
  private Map<String, Aluno> alunos;

  public Professor(String nome, String telefone, String endereco, int idade, String matricula, double salario,
      String horario) {
    super(nome, telefone, endereco, idade, matricula, salario);
    this.horario = horario;
    this.alunos = new HashMap<>();
  }
  
  @Override
  public double calcularSalario() {
    double bonificacao = getSalario() * 0.2;
    return getSalario() + bonificacao;
  }

  public String getHorario() {
    return this.horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public void adicionarEquipamentoAoTreinoDoAluno(String nomeAluno, Equipamento equipamento) throws Exception {
    try {
      Aluno aluno = this.obterAlunoPorNome(nomeAluno);
      aluno.getTreino().getEquipamentos().add(equipamento);
    } catch (Exception e) {
      throw e;
    }
  }

  public void adicionarTreinoAoAluno(String nomeAluno, Treino treino) throws Exception {
    try {
      Aluno aluno = this.obterAlunoPorNome(nomeAluno);
      aluno.setTreino(treino);
    } catch (Exception e) {
      throw e;
    }
  }

  public void addAluno(Aluno novoAluno) throws Exception {
    try {
      //Utilizei o método put do Hasmaps para adicionar uma chave Aluno
      this.alunoNaoExistente(novoAluno.getNome());
      this.alunos.put(novoAluno.getNome(), novoAluno);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public Aluno obterAlunoPorNome(String nomeAluno) throws Exception {
    Aluno aluno = this.alunos.get(nomeAluno);
    if (aluno != null) {
      return aluno;
    }
    throw new Exception("Aluno não encontrado");
  }

  private void alunoNaoExistente(String nomeAluno) throws Exception {
    if (this.alunos.containsKey(nomeAluno)) {
      throw new Exception("Aluno(a) já existe");
    }
  }
}