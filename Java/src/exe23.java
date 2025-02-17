import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe23 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int alcool = 0, gasolina = 0, diesel = 0; // Declaração e inicialização das variáveis que armazenarão as contagens de cada tipo de combustível
        int tipo = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável tipo

        // Estrutura de repetição while que continua enquanto tipo for diferente de 4
        while (tipo != 4) {
            if (tipo == 1) {
                alcool++; // Incrementa a contagem de álcool
            } else if (tipo == 2) {
                gasolina++; // Incrementa a contagem de gasolina
            } else if (tipo == 3) {
                diesel++; // Incrementa a contagem de diesel
            }
            tipo = sc.nextInt(); // Lê o próximo valor de tipo fornecido pelo usuário
        }

        // Imprime as contagens de cada tipo de combustível
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}