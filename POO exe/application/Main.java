package application;
import entities.Produto;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);
        
        // Cria um objeto Produto
        Produto produto = new Produto();

        // Lê o nome do produto
        System.out.print("Digite nome do produto: ");
        produto.nomeProduto = scanner.nextLine();

        // Lê o preço do produto
        System.out.print("Digite o preço do produto: ");
        produto.precoProduto = scanner.nextDouble();

        // Lê a quantidade do produto
        System.out.print("Digite a quantidade do produto: ");
        produto.quantidadeProduto = scanner.nextInt();

        // Exibe os dados do produto
        produto.exibirDados();

        // Adiciona produtos

        System.out.print("Digite a quantidade de produtos a ser adicionada no estoque: ");
        int quantidade = scanner.nextInt();
        produto.adicionarProdutos(quantidade);

        // Exibe os dados do produto
        produto.exibirDados();

        // Remove produtos

        System.out.print("Digite a quantidade de produtos a ser removida do estoque: ");
        quantidade = scanner.nextInt();
        produto.removerProdutos(quantidade);

        // Exibe os dados do produto
        produto.exibirDados();

        if(produto.quantidadeProduto == 0){
            System.out.println("Produto esgotado");
        }

        // Fecha o objeto Scanner
        scanner.close();
    }
}

