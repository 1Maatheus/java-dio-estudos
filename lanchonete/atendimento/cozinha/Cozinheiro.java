package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
  public void adicionarLanhceNoBalcao() {
    System.out.println("Adicionando lanche no balcão.");
  }

  public void adicionarSucoNoBalcao() {
    System.out.println("Adicionando suco no balcao.");
  }

  public void adicionarComboNoBalcao() {
    adicionarLanhceNoBalcao();
    adicionarSucoNoBalcao();
  }

  private void prepararLanche() {
    System.out.println("Preparando lanche.");
  }

  private void selecionarIngredientesLanche() {
    System.out.println("Selecionado o pão, salada, ovo e carne.");
  }

  private void selecionarIngredientesVitamina() {
    System.out.println("Selecionado fruta, leite e suco.");
  }

  private void lavarIngredientes() {
    System.out.println("Lavando ingredientes.");
  }

  private void baterVitaminaLiquidificador() {
    System.out.println("Batendo vitamina liquidificador.");
  }

  private void fritarIngredientesLanche() {
    System.out.println("Fritando a carne e ovo para o hamburger.");
  }

  public void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
}

  public void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }

  private void prepararVitamina() {
    System.out.println("Preparando vitamina.");
  }

}