import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe06 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal

        // Declaração das variáveis para armazenar os valores de entrada e os resultados dos cálculos
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        // Solicita ao usuário que digite os valores de A, B e C
        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble(); // Lê o valor de A digitado pelo usuário
        System.out.println("Digite o valor de B: ");
        b = sc.nextDouble(); // Lê o valor de B digitado pelo usuário
        System.out.println("Digite o valor de C: ");
        c = sc.nextDouble(); // Lê o valor de C digitado pelo usuário

        // Calcula as áreas das figuras geométricas
        triangulo = (a * c) / 2; // Calcula a área do triângulo
        circulo = 3.14159 * c * c; // Calcula a área do círculo
        trapezio = ((a + b) * c) / 2; // Calcula a área do trapézio
        quadrado = b * b; // Calcula a área do quadrado
        retangulo = a * b; // Calcula a área do retângulo

        // Imprime os resultados dos cálculos com 3 casas decimais
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}