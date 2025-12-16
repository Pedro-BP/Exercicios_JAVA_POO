package Aula03_Ex_08;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Carro implements Veiculo {

    private String modelo;
    private boolean ligado;

    public Carro(String modelo, boolean ligado) {
        this.modelo = modelo;
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String acelerar() {
        if (ligado) {
            return "Acelerando...";
        } else {
            return "...";
        }
    }

    @Override
    public String frear() {
        return "Freiando...";
    }

    @Override
    public String virar(String direcao) {
        return "Virando a " + direcao + "...";
    }
}
