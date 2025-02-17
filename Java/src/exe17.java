import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe17 { // Declaração da classe principal

    public static void main(String[] args) { // Método principal que inicia a execução do programa

        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        double x = sc.nextDouble(); // Lê um valor do tipo double fornecido pelo usuário para a variável x
        double y = sc.nextDouble(); // Lê um valor do tipo double fornecido pelo usuário para a variável y

        // Verifica a posição do ponto (x, y) no plano cartesiano e imprime a mensagem correspondente
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem"); // Ponto na origem
        } else if (x == 0.0) {
            System.out.println("Eixo Y"); // Ponto no eixo Y
        } else if (y == 0.0) {
            System.out.println("Eixo X"); // Ponto no eixo X
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1"); // Ponto no primeiro quadrante
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2"); // Ponto no segundo quadrante
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3"); // Ponto no terceiro quadrante
        } else {
            System.out.println("Q4"); // Ponto no quarto quadrante
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}