package Aula01_Ex_05;

/**
 *
 * @author PEDROBORGESPOSPICHIL
 */
public class Circulo {

    double raio;
    
    double calcularArea() {
        return Math.PI * Math.pow(raio,2);
    }
    
    double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}
