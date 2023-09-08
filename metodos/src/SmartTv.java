public class SmartTv {
  
  boolean ligada = false;
  int canal = 1;
  int volume = 20;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public int trocarCanal() {
    return this.canal++;
  }

  public int aumentarVolume () {
    return this.volume += 5;
  }
  
  public int diminuirVolume () {
    return this.volume--;
  }

  public int mudarCanal (int novoCanal) {
    return this.canal = novoCanal;
  }
}
