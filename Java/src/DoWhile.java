import java.util.Locale;
import java.util.Scanner;

public class DoWhile { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Locale.setDefault(Locale.US); // Define o locale para US

        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: "); // Solicita a temperatura em Celsius
            double c = sc.nextDouble(); // Lê a temperatura em Celsius
            double f = 9.0 * c / 5.0 + 32.0; // Converte a temperatura para Fahrenheit
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", f); // Exibe a temperatura em Fahrenheit
            System.out.print("Deseja repetir (s/n)? "); // Pergunta se deseja repetir
            resp = sc.next().charAt(0); // Lê a resposta
        } while (resp == 's'); // Repete o bloco de código enquanto a resposta for 's'
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}