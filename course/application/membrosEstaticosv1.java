package application; // Define o pacote da classe
import java.util.Locale; // Importa a classe Locale para configuração regional
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class membrosEstaticosv1 { // Declaração da classe principal
    public static final double PI = 3.14159; // Declaração da constante PI

    public static void main(String[] args) { // Método principal
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        System.out.print("Enter radius: "); // Solicita o raio
        double radius = sc.nextDouble(); // Lê o valor do raio
        double c = circunferencia(radius); // Calcula a circunferência usando o método estático
        double v = volume(radius); // Calcula o volume usando o método estático

        System.out.printf("Circunferência: %.2f%n", c); // Exibe a circunferência
        System.out.printf("Volume: %.2f%n", v); // Exibe o volume
        System.out.printf("PI value: %.2f%n", PI); // Exibe o valor de PI

        sc.close(); // Fecha o Scanner
    }

    // Método estático para calcular a circunferência de um círculo
    public static double circunferencia(double radius) {
        return 2.0 * PI * radius; // Retorna o valor da circunferência
    }

    // Método estático para calcular o volume de uma esfera
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0; // Retorna o valor do volume
    }
}