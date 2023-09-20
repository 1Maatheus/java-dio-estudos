package lanchonete;

public class Cozinheiro {
  public void adicionarLanhceNoBalcao() {
    System.out.println("Adicionando lanche no balcão.");
  }

  public void adicinarSucoNoBalcao() {
    System.out.println("Adicionando suco no balcao.");
  }

  public void adicionarComboNoBalcao() {
    adicionarLanhceNoBalcao();
    adicinarSucoNoBalcao();
  }

  public void prepararLanche() {
    System.out.println("Preparando lanche.");
  }

  public void selecionarIngredientesLanche() {
    System.out.println("Selecionado o pão, salada, ovo e carne.");
  }

  public void selecionarIngredientesVitamina() {
    System.out.println("Selecionado fruta, leite e suco.");
  }

  public void lavarIngredientes() {
    System.out.println("Lavando ingredientes.");
  }

  public void baterVitaminaLiquidificador() {
    System.out.println("Batendo vitamina liquidificador.");
  }

  public void fritarIngredientesLanche() {
    System.out.println("Fritando a carne e ovo para o hamburger.");
  }

  public void pedirParaTrocarGas(Atendente meuAmigo) {
    meuAmigo.trocarGas();
  }

  public void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
}

  public void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }

  public void prepararVitamina() {
    
  }

}