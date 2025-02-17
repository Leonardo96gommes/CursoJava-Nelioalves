import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class Condicao_ternaria { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        double preco = 34.5; // Declaração e inicialização da variável que armazenará o preço do produto
        // Utiliza a condição ternária para calcular o desconto com base no preço
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; // Calcula o desconto com base no preço usando a condição ternária
        System.out.println(desconto); // Imprime o valor do desconto calculado
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}