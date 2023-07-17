import javax.swing.SwingUtilities;

import Classes.AcademiaInterface;
import Classes.Aluno;
import Classes.Equipamento;
import Classes.Gerente;
import Classes.Recepcionista;
import Classes.Treino;
import Classes.Professor;

public class Main {
  public static void main(String[] args) {
    try {
      Professor professor = new Professor("Maria", "987654321", "Rua B", 30, "123", 3000.0, "Manhã");
      Gerente gerente = new Gerente("José", "555555555", "Rua C", 40, "456", 5000.0);
      Recepcionista recepcionista = new Recepcionista("Joana", "202045634", "Rua L", 52, "951", 1700.00);
      
      double salarioProfessor = professor.calcularSalario();
      double salarioRecepcionista = recepcionista.calcularSalario();
      double salarioGerente = gerente.calcularSalario();
      
      System.out.println("Salário do professor: R$ " + salarioProfessor);
      System.out.println("Salário da recepcionista: R$ " + salarioRecepcionista);
      System.out.println("Salário do gerente: R$ " + salarioGerente);

      Aluno alunoA = new Aluno("Maria", "987654321", "Rua X", 25);
      Aluno alunoB = new Aluno("Pedro", "654321987", "Rua Y", 30);
      Aluno alunoC = new Aluno("Ana", "456123789", "Rua Z", 28);
      
      professor.addAluno(alunoA);
      professor.addAluno(alunoB);
      professor.addAluno(alunoC);
 
      Treino treinoA = new Treino("Músculos Superiores");
      treinoA.adicionarEquipamento(new Equipamento("Haltere"));
      treinoA.adicionarEquipamento(new Equipamento("Banco de Supino"));
    
      Treino treinoB = new Treino("Músculos Inferiores");
      treinoB.adicionarEquipamento(new Equipamento("Cadeira Extensora"));
      treinoB.adicionarEquipamento(new Equipamento("Leg Press"));

      Treino treinoC = new Treino("Anaeróbico");
      treinoC.adicionarEquipamento(new Equipamento("Esteira"));
      treinoC.adicionarEquipamento(new Equipamento("Bicicleta"));

      professor.adicionarTreinoAoAluno("Pedro", treinoA);
      professor.adicionarTreinoAoAluno("Maria", treinoB);
      professor.adicionarTreinoAoAluno("Ana", treinoC);

      alunoA.getPagamento().realizarPagamento(recepcionista.getNome());

      alunoA.iniciarTreino();
    } catch (Exception e) {
      System.out.println(e);
    }

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        AcademiaInterface academiaInterface = new AcademiaInterface();
        academiaInterface.exibir();
      }
    });

  }
}
