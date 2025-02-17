import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe10 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Digite 3 numeros inteiros: "); // Solicita ao usuário que digite 3 números inteiros
        int num1 = sc.nextInt(); // Lê o primeiro número digitado pelo usuário
        int num2 = sc.nextInt(); // Lê o segundo número digitado pelo usuário
        int num3 = sc.nextInt(); // Lê o terceiro número digitado pelo usuário

        // Verifica qual dos três números é o menor
        if (num1 < num2 && num1 < num3) {
            System.out.println("Menor = " + num1); // Imprime o primeiro número se ele for o menor
        } else if (num2 < num3) {
            System.out.println("Menor = " + num2); // Imprime o segundo número se ele for o menor
        } else {
            System.out.println("Menor = " + num3); // Imprime o terceiro número se ele for o menor
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}