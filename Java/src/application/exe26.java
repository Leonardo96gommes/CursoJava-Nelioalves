package application;

import java.util.Locale;
import java.util.Scanner;

public class exe26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define o local padrão para os EUA, garantindo o uso do ponto como separador decimal
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        double xA, xB, xC, yA, yB, yC; // Declaração das variáveis para armazenar as medidas dos triângulos X e Y

        System.out.println("Enter the measures of triangle X:"); // Solicita ao usuário que insira as medidas do triângulo X
        xA = sc.nextDouble(); // Lê a primeira medida do triângulo X
        xB = sc.nextDouble(); // Lê a segunda medida do triângulo X
        xC = sc.nextDouble(); // Lê a terceira medida do triângulo X
        System.out.println("Enter the measures of triangle Y:"); // Solicita ao usuário que insira as medidas do triângulo Y
        yA = sc.nextDouble(); // Lê a primeira medida do triângulo Y
        yB = sc.nextDouble(); // Lê a segunda medida do triângulo Y
        yC = sc.nextDouble(); // Lê a terceira medida do triângulo Y

        double p = (xA + xB + xC) / 2.0; // Calcula o semiperímetro do triângulo X
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC)); // Calcula a área do triângulo X usando a fórmula de Heron

        p = (yA + yB + yC) / 2.0; // Calcula o semiperímetro do triângulo Y
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC)); // Calcula a área do triângulo Y usando a fórmula de Heron

        System.out.printf("Triangle X area: %.4f%n", areaX); // Imprime a área do triângulo X com 4 casas decimais
        System.out.printf("Triangle Y area: %.4f%n", areaY); // Imprime a área do triângulo Y com 4 casas decimais

        if (areaX > areaY) { // Compara as áreas dos triângulos X e Y
            System.out.println("Larger area: X"); // Imprime que a área do triângulo X é maior
        } else {
            System.out.println("Larger area: Y"); // Imprime que a área do triângulo Y é maior
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}