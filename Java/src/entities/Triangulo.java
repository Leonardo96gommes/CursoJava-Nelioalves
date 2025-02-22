package entities;

public class Triangulo {
    public double a; // Lado 'a' do triângulo
    public double b; // Lado 'b' do triângulo
    public double c; // Lado 'c' do triângulo

    // Método para calcular a área do triângulo usando a fórmula de Heron
    public double area() {
        double p = (a + b + c) / 2.0; // Calcula o semiperímetro do triângulo
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Calcula e retorna a área do triângulo
    }
}