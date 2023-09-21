package interfaces.Equipamentos.multifuncional;

import interfaces.Equipamentos.digitalizadora.Digitalizadora;
import interfaces.Equipamentos.copiadora.Copiadora;
import interfaces.Equipamentos.impressora.Impressora;



public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

  @Override
  public void digitalizar() {
    System.out.println("Digitalizando via Multifuncional...");
  }

  @Override
  public void imprimir() {
    System.out.println("Imprimindo via Multifuncional...");
  }

  @Override
  public void copiar() {
    System.out.println("Copiando via Multifuncional...");
  }
  
}
