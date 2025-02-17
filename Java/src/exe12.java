import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe12 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Digite um número: "); // Solicita ao usuário que digite um número
        int num = sc.nextInt(); // Lê o número digitado pelo usuário

        // Verifica se o número é par
        if(num % 2 == 0) {
            System.out.println("O número é par"); // Imprime "O número é par" se a condição for verdadeira
        } else {
            System.out.println("O número é ímpar"); // Imprime "O número é ímpar" se a condição for falsa
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}