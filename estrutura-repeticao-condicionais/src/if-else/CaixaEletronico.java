public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 67.10;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        } 
        System.out.println(saldo);
    }
}
