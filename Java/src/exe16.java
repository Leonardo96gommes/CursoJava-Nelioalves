import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe16 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Double valor = sc.nextDouble(); // Lê um valor do tipo Double fornecido pelo usuário

        // Verifica em qual intervalo o valor se encontra e imprime a mensagem correspondente
        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]"); // Intervalo de 0 a 25, inclusive
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]"); // Intervalo de 25 a 50, exclusivo em 25 e inclusivo em 50
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]"); // Intervalo de 50 a 75, exclusivo em 50 e inclusivo em 75
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75,100]"); // Intervalo de 75 a 100, exclusivo em 75 e inclusivo em 100
        } else {
            System.out.println("Fora de intervalo"); // Valor fora dos intervalos especificados
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}