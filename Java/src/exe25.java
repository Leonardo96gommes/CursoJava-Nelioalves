import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe25 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int x = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável x
        int y = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável y
        int min, max; // Declaração das variáveis min e max

        // Determina os valores de min e max
        if (x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }

        int soma = 0; // Declaração e inicialização da variável que armazenará a soma dos números ímpares

        // Estrutura de repetição for que percorre os números entre min e max
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar
                soma += i; // Adiciona o valor de i à variável soma
            }
        }

        System.out.println(soma); // Imprime a soma dos números ímpares
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}