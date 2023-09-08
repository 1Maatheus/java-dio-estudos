public class metodos {
    public static void main(String[] args) throws Exception {
        //Métodos: Todas as ações das aplicações são consideradas métodos. Os métodos correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.
        //Não existe em Java o conceito de métodos globais, todos os métodos devem sempre ser definidos dentro de uma classe.
        
        SmartTv smartTv = new SmartTv();
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: a tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.trocarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(40);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
