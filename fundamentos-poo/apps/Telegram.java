package apps;
public class Telegram extends ServicoMensagem {

  @Override
  public void enviarMensagem() {
    validarConecatdoInternet();
    System.out.println("Enviando mensagem pelo Telegram");
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Telegram");
  }
  
}
