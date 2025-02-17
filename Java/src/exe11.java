import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe11 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int num = sc.nextInt(); // Lê o número digitado pelo usuário

        // Verifica se o número é negativo
        if(num < 0){
            System.out.println("Negativo"); // Imprime "Negativo" se a condição for verdadeira
        } else if(num == 0){
            System.out.println("Nao negativo"); // Imprime "Nao negativo" se o número for igual a zero
        } else {
            System.out.println("Positivo"); // Imprime "Positivo" se o número for maior que zero
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}