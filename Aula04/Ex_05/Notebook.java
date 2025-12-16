package Aula04_Ex_05;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Notebook extends Dispositivo_Eletronico{
    
    private double armazenamento;

    public Notebook(String marca, String modelo, double armazenamento) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
    
}
