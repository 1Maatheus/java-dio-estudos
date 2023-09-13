public class FormatadorCep {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("078551620");
      System.out.println(cepFormatado);
    } catch (CepIvalidoException e) {
      // TODO Auto-generated catch block
      System.out.println("O cep informado está incorreto.");
    }
  }

  static String formatarCep(String cep) throws CepIvalidoException {
    if(cep.length() != 8) {
      throw new CepIvalidoException();
      
    }
    return "07855-160";
  }

}
