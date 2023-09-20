public class Escola {
  public static void main(String[] args) {
    Aluno matheus = new Aluno();
    matheus.setNome("Matheus");
    matheus.setIdade(25);

    System.out.println("O aluno " + matheus.getNome() + " tem " + matheus.getIdade() + " anos!");
  }
}
