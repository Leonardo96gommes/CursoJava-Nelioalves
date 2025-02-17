import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe15 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Digite o código do produto e a quantidade comprada:"); // Solicita ao usuário o código do produto e a quantidade comprada
        int codigo = sc.nextInt(); // Lê o código do produto
        int quantidade = sc.nextInt(); // Lê a quantidade comprada
        double total = 0; // Declaração e inicialização da variável que armazenará o total a ser pago

        // Verifica o código do produto e calcula o total com base na quantidade comprada
        if (codigo == 1) {
            total = quantidade * 4.00; // Produto 1 custa R$ 4,00
        } else if (codigo == 2) {
            total = quantidade * 4.50; // Produto 2 custa R$ 4,50
        } else if (codigo == 3) {
            total = quantidade * 5.00; // Produto 3 custa R$ 5,00
        } else if (codigo == 4) {
            total = quantidade * 2.00; // Produto 4 custa R$ 2,00
        } else if (codigo == 5) {
            total = quantidade * 1.50; // Produto 5 custa R$ 1,50
        }

        // Imprime o total a ser pago com duas casas decimais
        System.out.printf("Total: R$ %.2f\n", total);
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}