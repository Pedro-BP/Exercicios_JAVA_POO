package Aula03_Ex_08;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Bicicleta implements Veiculo {

    private String modelo;

    public Bicicleta(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String acelerar() {
            return "Acelerando...";
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
