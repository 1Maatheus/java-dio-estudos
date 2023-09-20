package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.atendimento.cozinha.Almoxarife; 
import lanchonete.cliente.Cliente;

public class Estabeleciomento {
  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();

    //Ações que não precisam estarem disponíveis para toda a aplicação.
    cozinheiro.lavarIngredientes();
    cozinheiro.baterVitaminaLiquidificador();
    cozinheiro.selecionarIngredientesVitamina();
    cozinheiro.prepararLanche();
    cozinheiro.prepararVitamina();

    //Ações que o estabelecimento precisa ter ciência.
    cozinheiro.adicinarSucoNoBalcao();
    cozinheiro.adicionarLanhceNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Almoxarife almoxarife = new Almoxarife();

    //Ações que não precisam estarem disponíveis para toda a aplicação.
    almoxarife.controlarEntrada();
    almoxarife.controlarSaida();

    //ação que somente o seu pacote cozinha precisa conhecer(default)
    almoxarife.entregarIngredientes();
    almoxarife.trocarGas();

    Atendente atendente = new Atendente();

    atendente.pegarLancheCozinha();
    atendente.receberPagamento();
    atendente.servindoMesa();

    //ação que somente o seu pacote cozinha precisa conhecer(default)
    atendente.trocarGas();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

    //Estabelecimento ainda não definiu normas de atendimento
    cliente.pegarPedidoBalcao();

    //ação sigilosa.
    cliente.consultarSaldoAplicativo();

    //Cliente não deve ouvir o pedido.
    cozinheiro.pedirParaTrocarGas(atendente);
    cozinheiro.pedirParaTrocarGas(almoxarife);
  }
}
