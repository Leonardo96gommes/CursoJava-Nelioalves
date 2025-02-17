import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class Operadores_de_atribuição_cumulativa { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int minutos = sc.nextInt(); // Lê o número de minutos fornecido pelo usuário
        double conta = 50.0; // Declaração e inicialização da variável que armazenará o valor da conta, com valor inicial de R$ 50,00
        if (minutos > 100) { // Verifica se os minutos excedem 100
            conta += (minutos - 100) * 2.0; // Adiciona R$ 2,00 por cada minuto que exceder 100 minutos
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta); // Imprime o valor da conta com duas casas decimais
        System.out.println("Fim do programa"); // Imprime uma mensagem indicando o fim do programa
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}