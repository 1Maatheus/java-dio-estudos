package apps;
public abstract class ServicoMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConecatdoInternet() {
        System.out.println("Verificando se está conectado à internet...");
    }
}
