package Aula03.Ex_11;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Triangulo implements Forma {

    private double a, b, c, h;

    public Triangulo(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return (b * h) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return a + b + c;
    }
}
