import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe05 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal

        // Declaração das variáveis para armazenar os valores de entrada e o resultado do cálculo
        int pecas1, pecas2, qtd1, qtd2;
        double valor1, valor2, total;

        // Solicita ao usuário que digite o código, quantidade e valor da peça 1
        System.out.println("Digite o código da peça 1: ");
        pecas1 = sc.nextInt(); // Lê o código da peça 1 digitado pelo usuário
        System.out.println("Digite a quantidade de peças 1: ");
        qtd1 = sc.nextInt(); // Lê a quantidade de peças 1 digitada pelo usuário
        System.out.println("Digite o valor da peça 1: ");
        valor1 = sc.nextDouble(); // Lê o valor da peça 1 digitado pelo usuário

        // Solicita ao usuário que digite o código, quantidade e valor da peça 2
        System.out.println("Digite o código da peça 2: ");
        pecas2 = sc.nextInt(); // Lê o código da peça 2 digitado pelo usuário
        System.out.println("Digite a quantidade de peças 2: ");
        qtd2 = sc.nextInt(); // Lê a quantidade de peças 2 digitada pelo usuário
        System.out.println("Digite o valor da peça 2: ");
        valor2 = sc.nextDouble(); // Lê o valor da peça 2 digitado pelo usuário

        // Calcula o valor total a pagar
        total = (qtd1 * valor1) + (qtd2 * valor2); // Multiplica a quantidade pelo valor de cada peça e soma os resultados
        System.out.printf("Valor a pagar: R$ %.2f%n", total); // Imprime o valor total a pagar com duas casas decimais

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}