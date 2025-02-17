import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe20 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int idade = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável idade
        int soma = 0; // Declaração e inicialização da variável que armazenará a soma das idades
        int cont = 0; // Declaração e inicialização da variável que armazenará a contagem de idades

        // Estrutura de repetição while que continua enquanto idade for maior ou igual a 0
        while (idade >= 0) {
            soma += idade; // Adiciona o valor de idade à variável soma
            cont++; // Incrementa a contagem de idades
            idade = sc.nextInt(); // Lê a próxima idade fornecida pelo usuário
        }

        // Verifica se alguma idade válida foi fornecida
        if (cont == 0) {
            System.out.println("Impossivel calcular"); // Imprime mensagem de erro se nenhuma idade válida foi fornecida
        } else {
            double media = (double) soma / cont; // Calcula a média das idades
            System.out.printf("%.2f%n", media); // Imprime a média das idades com duas casas decimais
        }
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}