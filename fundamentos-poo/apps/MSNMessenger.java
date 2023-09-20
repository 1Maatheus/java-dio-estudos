package apps;
public class MSNMessenger extends ServicoMensagem {

  @Override
  public void enviarMensagem() {
    validarConecatdoInternet();
    System.out.println("Enviando mensagem pelo MSN Messenger");
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN Messenger");
  }
 
}
