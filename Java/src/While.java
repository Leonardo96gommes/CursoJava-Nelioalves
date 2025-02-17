import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class While { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int num = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário
        int soma = 0; // Declaração e inicialização da variável que armazenará a soma dos números

        // Estrutura de repetição while que continua enquanto num for diferente de 0
        while (num != 0) {
            soma += num; // Adiciona o valor de num à variável soma
            System.out.println("Digite um numero: " + num); // Imprime o número digitado
            num = sc.nextInt(); // Lê o próximo número fornecido pelo usuário
        }

        // Imprime a soma dos números digitados
        System.out.println("Soma dos numeros digitados : " + soma);
        System.out.println("Saiu do loop"); // Indica que saiu do loop
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}