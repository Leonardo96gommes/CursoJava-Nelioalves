import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe24 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.print("Digite o numero: "); // Solicita ao usuário que digite um número
        int N = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável N

        // Estrutura de repetição for que executa 10 vezes
        for (int i = 1; i <= 10; i++) {
            int result = N * i; // Calcula o resultado da multiplicação de N por i
            System.out.println(N + " x " + i + " = " + result); // Imprime o resultado da multiplicação
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}