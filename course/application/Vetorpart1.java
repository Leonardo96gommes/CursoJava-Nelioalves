package application;
import java.util.Locale;
import java.util.Scanner;

public class Vetorpart1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        System.out.print("Enter the number of people: "); // Solicita o número de pessoas
        int n = sc.nextInt(); // Lê o número de pessoas
        double[] vect = new double[n]; // Cria um vetor de doubles com tamanho n
        for (int i = 0; i < n; i++) { // Loop para ler as alturas das pessoas
            vect[i] = sc.nextDouble(); // Lê a altura e armazena no vetor
        }
        double sum = 0; // Inicializa a soma das alturas
        for (int i = 0; i < n; i++) { // Loop para somar todas as alturas
            sum += vect[i]; // Adiciona a altura atual à soma
        }
        double avg = sum / n; // Calcula a média das alturas
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg); // Exibe a média das alturas formatada

        sc.close(); // Fecha o Scanner
    }
}