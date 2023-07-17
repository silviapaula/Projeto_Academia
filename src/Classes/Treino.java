package Classes;

import java.util.ArrayList;
import java.util.List;

public class Treino {
  private List<Equipamento> equipamentos;
  
  public Treino(String nome) {
    this.equipamentos = new ArrayList<Equipamento>();
  }

  public void adicionarEquipamento(Equipamento equipamento) {
    this.equipamentos.add(equipamento);
  }

  public void removerEquipamento(Equipamento equipamento) {
    this.equipamentos.remove(equipamento);
  }

  public List<Equipamento> getEquipamentos() {
    return this.equipamentos;
  }

}
