import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe14 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int horaInicial = sc.nextInt(); // Lê a hora inicial do jogo
        int horaFinal = sc.nextInt(); // Lê a hora final do jogo
        int duracao; // Declaração da variável que armazenará a duração do jogo

        // Verifica se a hora inicial é menor que a hora final
        if (horaInicial < horaFinal) {
            // Calcula e imprime a duração do jogo quando a hora inicial é menor que a final
            System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");
        } else if (horaInicial == horaFinal) {
            // Caso a hora inicial seja igual à final, o jogo durou 24 horas
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            // Caso a hora inicial seja maior que a final, calcula a duração considerando a virada do dia
            System.out.println("O JOGO DUROU " + (24 - horaInicial + horaFinal) + " HORA(S)");
        }
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}