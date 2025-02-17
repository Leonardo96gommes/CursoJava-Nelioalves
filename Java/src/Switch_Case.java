import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class Switch_Case { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int x = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário
        String dia; // Declaração da variável que armazenará o dia da semana correspondente

        // Estrutura switch para determinar o dia da semana com base no valor de x
        switch (x) {
            case 1:
                dia = "domingo"; // Se x for 1, dia é "domingo"
                break; // Interrompe a execução do switch
            case 2:
                dia = "segunda"; // Se x for 2, dia é "segunda"
                break; // Interrompe a execução do switch
            case 3:
                dia = "terca"; // Se x for 3, dia é "terça"
                break; // Interrompe a execução do switch
            case 4:
                dia = "quarta"; // Se x for 4, dia é "quarta"
                break; // Interrompe a execução do switch
            case 5:
                dia = "quinta"; // Se x for 5, dia é "quinta"
                break; // Interrompe a execução do switch
            case 6:
                dia = "sexta"; // Se x for 6, dia é "sexta"
                break; // Interrompe a execução do switch
            case 7:
                dia = "sabado"; // Se x for 7, dia é "sábado"
                break; // Interrompe a execução do switch
            default:
                dia = "valor invalido"; // Se x não for nenhum dos valores acima, dia é "valor inválido"
                break; // Interrompe a execução do switch
        }

        // Imprime o dia da semana correspondente ou "valor inválido" se x não for de 1 a 7
        System.out.println("Dia da semana: " + dia);
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}