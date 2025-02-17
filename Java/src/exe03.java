import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe03 { // Declaração da classe principal
    public void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal
        int a, b, c, d, diferenca; // Declaração das variáveis inteiras

        // Solicita ao usuário que digite os valores de A, B, C e D
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt(); // Lê o valor de A digitado pelo usuário
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt(); // Lê o valor de B digitado pelo usuário
        System.out.println("Digite o valor de C: ");
        c = sc.nextInt(); // Lê o valor de C digitado pelo usuário
        System.out.println("Digite o valor de D: ");
        d = sc.nextInt(); // Lê o valor de D digitado pelo usuário

        // Calcula a diferença do produto de A e B pelo produto de C e D
        diferenca = (a * b - c * d);
        System.out.println("DIFERENCA = " + diferenca); // Imprime a diferença calculada

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}