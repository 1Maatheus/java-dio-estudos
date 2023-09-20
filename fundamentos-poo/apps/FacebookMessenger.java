package apps;

public class FacebookMessenger extends ServicoMensagem {

  @Override
  public void enviarMensagem() {
    validarConecatdoInternet();
    System.out.println("Enviando mensagem pelo Facebook Messenger");
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Facebook Messenger");
  }
  
}
