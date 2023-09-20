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

    Atendente atendente = new Atendente();
    atendente.servindoMesa();
    atendente.receberPagamento();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();
  }
}
