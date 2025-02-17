// Estrutura repetitiva "para" (for)

// for ( início ; condição ; incremento) {
//       comando 1
//       comando 2
//  }

import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class For { // Declaração da classe principal

    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int n = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável n
        int soma = 0; // Declaração e inicialização da variável que armazenará a soma dos números

        // Estrutura de repetição for que executa n vezes
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável x
            soma += x; // Adiciona o valor de x à variável soma
        }

        // Imprime a soma dos números digitados
        System.out.println(soma);
        System.out.println("Fim!"); // Indica o fim da execução do programa
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}