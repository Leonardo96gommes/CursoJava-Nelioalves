import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class Condicao_if_else { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int horas; // Declaração da variável inteira para armazenar a hora

        // Solicita ao usuário que digite a hora atual
        System.out.println("Digite a hora atual: ");
        horas = sc.nextInt(); // Lê a hora digitada pelo usuário

        // Verifica o valor da hora e imprime a saudação correspondente
        if (horas < 12) { // Se a hora for menor que 12
            System.out.println("Bom dia"); // Imprime "Bom dia"
        } else if (horas < 18) { // Se a hora for menor que 18
            System.out.println("Boa tarde"); // Imprime "Boa tarde"
        } else { // Se a hora for 18 ou maior
            System.out.println("Boa noite"); // Imprime "Boa noite"
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}