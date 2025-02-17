import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe07 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        double nota1 = sc.nextDouble(); // Lê a primeira nota digitada pelo usuário
        double nota2 = sc.nextDouble(); // Lê a segunda nota digitada pelo usuário
        double notaFinal = nota1 + nota2; // Calcula a nota final somando as duas notas
        if(notaFinal < 60.0) { // Verifica se a nota final é menor que 60.0
            System.out.printf("NOTA FINAL = %.1f%n", notaFinal); // Imprime a nota final com uma casa decimal
            System.out.println("REPROVADO"); // Imprime "REPROVADO" se a condição for verdadeira

        } else { // Caso contrário
            System.out.println("PARABENS VC FOI APROVADO"); // Imprime "PARABENS VC FOI APROVADO"
        }
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}