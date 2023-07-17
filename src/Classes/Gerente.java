package Classes;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
  private List<Equipamento> equipamentos;

  public Gerente(String nome, String telefone, String endereco, int idade, String matricula, double salario) {
    super(nome, telefone, endereco, idade, matricula, salario);
    this.equipamentos = new ArrayList<>();
  }
  
  @Override
  public double calcularSalario() {
    double bonificacao = getSalario() * 0.3;
    double desconto = getSalario() * 0.1;
    return getSalario() + bonificacao - desconto;
  }

  public void cadastrarEquipamento(String nome) {
    Equipamento equipamento = new Equipamento(nome);
    equipamentos.add(equipamento);
  }

  public void removerEquipamento(Equipamento equipamento) {
    equipamentos.remove(equipamento);
  }

  public List<Equipamento> getEquipamentos() {
    return this.equipamentos;
  }
}

