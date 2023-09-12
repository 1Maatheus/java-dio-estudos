package repeticoes;

public class ExemploForEach {
  public static void main(String[] args) {
    String carros [] = {"Ferrari", "Mercedes", "BMW", "Audi", "Volkswagen", "Supra"};

    for(String carro : carros) {
      System.out.println("Carros: " + carro);
    }
  }
}
