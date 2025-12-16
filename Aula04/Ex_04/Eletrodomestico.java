
package Aula04_Ex_04;

/**
 * 
 * @author PEDROBORGESPOSPICHIL
 */
public class Eletrodomestico {
    
    protected String marca, modelo;
    protected boolean ligado;

    public Eletrodomestico(String marca, String modelo, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }
}
