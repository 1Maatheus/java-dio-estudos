import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploException {
  public static void main(String[] args) throws ParseException {
    Number valor;

    try {
      valor = NumberFormat.getInstance().parse("a2.76");
      System.out.println(valor);
    } catch(ParseException e) {
      e.printStackTrace();
    }
  }
}
