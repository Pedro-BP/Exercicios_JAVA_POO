package Aula02_Ex_11;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Televisao {

    private int volume;
    private int canal;

    public Televisao(int volumeInicial, int canalInicial) {
        this.volume = volumeInicial;
        this.canal = canalInicial;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("Volume diminuído para: " + volume);
    }

    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
        System.out.println("Canal trocado para: " + canal);
    }
}
