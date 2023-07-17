package Classes;

import java.util.List;
import java.text.ParseException;

public class Aluno implements Membro {
  private String nome;
  private String telefone;
  private String endereco;
  private int idade;
  private Treino treino;
  private Pagamento ultimoPagamento;

  public Aluno(String nome, String telefone, String endereco, int idade) throws ParseException {
    this.nome = nome;
    this.telefone = telefone;
    this.endereco = endereco;
    this.idade = idade;
    this.ultimoPagamento = new Pagamento(this);
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

  public Pagamento getPagamento() {
    return this.ultimoPagamento;
  }

  public Treino getTreino() {
    return this.treino;
  }

  public List<Equipamento> getEquipamentos() {
    return this.getTreino().getEquipamentos();  
  }
  
  public void setTreino(Treino treino) {
    this.treino = treino;
  }

  public void iniciarTreino() {
    try {
      this.ultimoPagamento.pagamentoPendente();
      System.out.println("O(A) aluno(a) " + this.getNome() + " Iniciou o treino");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
