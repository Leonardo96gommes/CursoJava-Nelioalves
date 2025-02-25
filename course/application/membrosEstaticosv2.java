package application; // Define o pacote da classe
import util.Calculator; // Importa a classe Calculator do pacote util

import java.util.Locale; // Importa a classe Locale para configuração regional
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class membrosEstaticosv2 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        Calculator calc = new Calculator(); // Cria uma nova instância da classe Calculator
        System.out.print("Enter radius: "); // Solicita o raio
        double radius = sc.nextDouble(); // Lê o valor do raio
        double c = calc.circunferencia(radius); // Calcula a circunferência usando o método da classe Calculator
        double v = calc.volume(radius); // Calcula o volume usando o método da classe Calculator

        System.out.printf("Circunferência: %.2f%n", c); // Exibe a circunferência
        System.out.printf("Volume: %.2f%n", v); // Exibe o volume
        System.out.printf("PI value: %.2f%n", calc.PI); // Exibe o valor de PI

        sc.close(); // Fecha o Scanner
    }
}