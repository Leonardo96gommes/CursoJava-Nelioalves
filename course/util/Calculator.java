package util; // Define o pacote da classe

public class Calculator { // Declaração da classe Calculator
    public static final double PI = 3.14159; // Declaração da constante PI

    // Método para calcular a circunferência de um círculo
    public static double circunferencia(double radius) {
        return 2.0 * PI * radius; // Retorna o valor da circunferência
    }

    // Método para calcular o volume de uma esfera
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0; // Retorna o valor do volume
    }
}