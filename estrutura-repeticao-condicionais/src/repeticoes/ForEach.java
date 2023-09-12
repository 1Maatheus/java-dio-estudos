package repeticoes;

public class ForEach {
  public static void main(String[] args) {
    String carros [] = {"Ferrari", "Mercedes", "BMW", "Audi", "Volkswagen", "Supra"};

    for(String carro : carros) {
      System.out.println("Carros: " + carro);
    }
  }
}
