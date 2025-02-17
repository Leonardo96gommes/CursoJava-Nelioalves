import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe22 { // Declaração da classe principal

    public static void main(String[] args) { // Método principal que inicia a execução do programa

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        int x = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável x
        int y = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável y

        // Estrutura de repetição while que continua enquanto x e y forem diferentes de 0
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro"); // Imprime "primeiro" se x e y forem positivos
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo"); // Imprime "segundo" se x for negativo e y for positivo
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro"); // Imprime "terceiro" se x e y forem negativos
            }
            else {
                System.out.println("quarto"); // Imprime "quarto" se x for positivo e y for negativo
            }
            x = sc.nextInt(); // Lê o próximo valor de x fornecido pelo usuário
            y = sc.nextInt(); // Lê o próximo valor de y fornecido pelo usuário
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}