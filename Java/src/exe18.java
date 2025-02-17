import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe18 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        double salario = sc.nextDouble(); // Lê o valor do salário fornecido pelo usuário
        double imposto; // Declaração da variável que armazenará o valor do imposto

        // Calcula o imposto com base no valor do salário
        if (salario <= 2000.0) {
            imposto = 0.0; // Isento de imposto
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08; // 8% sobre a parte que excede R$ 2000,00
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08; // 18% sobre a parte que excede R$ 3000,00 mais 8% sobre R$ 1000,00
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; // 28% sobre a parte que excede R$ 4500,00 mais 18% sobre R$ 1500,00 mais 8% sobre R$ 1000,00
        }

        // Verifica se o imposto é zero e imprime a mensagem correspondente
        if (imposto == 0.0) {
            System.out.println("Isento"); // Isento de imposto
        } else {
            System.out.printf("R$ %.2f%n", imposto); // Imprime o valor do imposto com duas casas decimais
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}