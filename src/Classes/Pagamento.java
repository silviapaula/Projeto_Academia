package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.time.Duration;

public class Pagamento {
  private Aluno aluno;
  private LocalDate dataRealizada;
  static final String DATA_INICIAL = "2023-05-16";
  static final int DIAS_POR_MES = 30;

  public Pagamento(Aluno aluno) throws ParseException {
    this.aluno = aluno;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    this.dataRealizada = LocalDate.parse(DATA_INICIAL, formato);
  }

  public Aluno getAluno() {
    return this.aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  public void realizarPagamento(String nomeResponsavel) throws ParseException {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    this.dataRealizada = LocalDate.parse(LocalDate.now().toString(), formato);
    System.out.println("Pagamento do aluno(a) " + this.aluno.getNome() + " realizado com sucesso!!!");
  }

  public void pagamentoPendente() throws Exception {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dataAgora = LocalDate.parse(LocalDate.now().toString(), formato);    

    long quantidadeDias = Duration.between(dataAgora, this.dataRealizada).toDays();
    if (quantidadeDias > DIAS_POR_MES) {
      throw new Exception("Mensalidade atrasada!!!!!!!");
    }
    System.out.println("O(A) aluno(a) " + this.aluno.getNome() + " está com pagamento em dia");
  }
}
