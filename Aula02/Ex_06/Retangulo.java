package Aula02_Ex_06;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Retangulo {

    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea() {
        return largura * altura;
    }
    
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
