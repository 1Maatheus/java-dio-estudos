package aulas.anatomia.classes;
public class MinhaClasse {
  public static void main(String[] args) {
    String primeiroNome = "Matheus";
    String segundoNome = "Oliveira";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println("O seu nome é: " + nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}
 