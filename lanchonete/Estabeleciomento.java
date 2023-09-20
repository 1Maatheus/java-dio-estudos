package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.atendimento.cozinha.Almoxarife; 
import lanchonete.cliente.Cliente;

public class Estabeleciomento {
  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro(); 

    //Ações que o estabelecimento precisa ter ciência.
    cozinheiro.adicionarSucoNoBalcao();
    cozinheiro.adicionarLanhceNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Almoxarife almoxarife = new Almoxarife();

    //Ações que não precisam estarem disponíveis para toda a aplicação.
    almoxarife.controlarEntrada();
    almoxarife.controlarSaida();

    Atendente atendente = new Atendente();

    atendente.pegarLancheCozinha();
    atendente.receberPagamento();
    atendente.servindoMesa();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

    //Estabelecimento ainda não definiu normas de atendimento
    cliente.pegarPedidoBalcao();

    //ação sigilosa.
    cliente.consultarSaldoAplicativo();

    //Cliente não deve ouvir o pedido.
    cozinheiro.pedirParaTrocarGas(almoxarife);
  }
}
