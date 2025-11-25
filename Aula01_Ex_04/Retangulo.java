package Aula01_Ex_04;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Retangulo {

    double base, altura;
    
    public double calcularArea() {
        return base * altura; 
    }
    
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
