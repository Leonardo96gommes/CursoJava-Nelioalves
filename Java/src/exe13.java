import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe13 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int num1 = sc.nextInt(); // Lê o primeiro número digitado pelo usuário
        int num2 = sc.nextInt(); // Lê o segundo número digitado pelo usuário

        // Verifica se num1 é múltiplo de num2 ou se num2 é múltiplo de num1
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("São múltiplos"); // Imprime "São múltiplos" se a condição for verdadeira
        } else {
            System.out.println("Não são múltiplos"); // Imprime "Não são múltiplos" se a condição for falsa
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}