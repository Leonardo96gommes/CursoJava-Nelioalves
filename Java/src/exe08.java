import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe08 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal
        System.out.println("Digite o valor de A, B e C: "); // Solicita ao usuário que digite os valores de A, B e C
        double a = sc.nextDouble(); // Lê o valor de A digitado pelo usuário
        double b = sc.nextDouble(); // Lê o valor de B digitado pelo usuário
        double c = sc.nextDouble(); // Lê o valor de C digitado pelo usuário
        double delta = b * b - 4 * a * c; // Calcula o valor de delta (discriminante da equação quadrática)

        // Verifica se a é igual a 0 ou se delta é menor que 0
        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular"); // Imprime "Impossivel calcular" se a condição for verdadeira
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a); // Calcula a primeira raiz da equação quadrática
            double r2 = (-b - Math.sqrt(delta)) / (2 * a); // Calcula a segunda raiz da equação quadrática
            System.out.printf("R1 = %.5f\n", r1); // Imprime a primeira raiz com 5 casas decimais
            System.out.printf("R2 = %.5f\n", r2); // Imprime a segunda raiz com 5 casas decimais
        }
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}