package repeticoes;

public class ExemploForLoopArrays {
  public static void main(String[] args) {
    String carros [] = {"Ferrari", "Mercedes", "BMW", "Audi", "Volkswagen", "Supra"};

    for (int i = 0; i < carros.length; i++) {
      System.out.println("Carros disponíveis: " + carros[i]);;
    }
  }
}