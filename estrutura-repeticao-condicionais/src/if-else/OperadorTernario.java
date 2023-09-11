public class OperadorTernario {
 public static void main(String[] args) {
  int nota = 8;

  String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
  System.out.println(resultado);

  int note = 4;

  String result = note >= 7 ? "Aprovado" : note >= 5 && note < 7 ? "Recuperação" : "Reprovado";
  System.out.println(result);
 } 
}
