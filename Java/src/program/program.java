package program;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define o local padrão para os EUA, garantindo o uso do ponto como separador decimal
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Triangulo x, y; // Declaração das variáveis para armazenar as medidas dos triângulos X e Y
        x = new Triangulo(); // Instancia um objeto da classe Triangulo para armazenar as medidas do triângulo X
        y = new Triangulo(); // Instancia um objeto da classe Triangulo para armazenar as medidas do triângulo Y

        System.out.println("Enter the measures of triangle X:"); // Solicita ao usuário que insira as medidas do triângulo X
        x.a = sc.nextDouble(); // Lê a primeira medida do triângulo X
        x.b = sc.nextDouble(); // Lê a segunda medida do triângulo X
        x.c = sc.nextDouble(); // Lê a terceira medida do triângulo X
        System.out.println("Enter the measures of triangle Y:"); // Solicita ao usuário que insira as medidas do triângulo Y
        y.a = sc.nextDouble(); // Lê a primeira medida do triângulo Y
        y.b = sc.nextDouble(); // Lê a segunda medida do triângulo Y
        y.c = sc.nextDouble(); // Lê a terceira medida do triângulo Y

        double areaX = x.area(); // Calcula a área do triângulo X
        double areaY = y.area(); // Calcula a área do triângulo Y

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