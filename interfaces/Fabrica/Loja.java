package interfaces.Fabrica;
import interfaces.Equipamentos.copiadora.Copiadora;
import interfaces.Equipamentos.digitalizadora.Digitalizadora;
import interfaces.Equipamentos.impressora.Deskjet;
import interfaces.Equipamentos.impressora.Impressora;
import interfaces.Equipamentos.impressora.Laserjet;
import interfaces.Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
  public static void main(String[] args) {
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();
    Impressora impressora = em;
    Digitalizadora digitalizadora = em;
    Copiadora copiadora = em;
    
    impressora.imprimir();
    digitalizadora.digitalizar();
    copiadora.copiar();
  }
}
