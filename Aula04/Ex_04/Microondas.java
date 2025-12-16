
package Aula04_Ex_04;

/**
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Microondas extends Eletrodomestico{
    
    private String potencia;

    public Microondas(String marca, String modelo, boolean ligado, String potencia) {
        super(marca, modelo, ligado);
        this.potencia = potencia;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
}
