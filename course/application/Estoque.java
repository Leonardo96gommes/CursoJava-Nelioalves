package application; // Define o pacote da classe

import entities.Produto; // Importa a classe Produto do pacote entities

import java.util.Locale; // Importa a classe Locale para configuração regional
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Estoque { // Declaração da classe principal
    public static void main(String[] args) { // Método principal
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        Produto p = new Produto(); // Instancia um objeto da classe Produto com o construtor padrão

        System.out.println("Enter Produto Data:"); // Exibe uma mensagem para o usuário
        System.out.print("Nome: "); // Solicita o nome do produto
        String nome = sc.nextLine(); // Lê o nome do produto
        System.out.print("Preço: "); // Solicita o preço do produto
        double preco = sc.nextDouble(); // Lê o preço do produto
        Produto produto = new Produto(nome, preco); // Instancia um objeto da classe Produto
        System.out.println(); // Pula uma linha
        System.out.println("Produto data: " + produto.toString()); // Exibe os dados do produto
        System.out.println(); // Pula uma linha
        System.out.print("Entre com uma quantidade de produtos a serem adicionados no estoque: "); // Solicita a quantidade de produtos a serem adicionados no estoque
        int quantidade = sc.nextInt(); // Lê a quantidade de produtos a serem adicionados no estoque
        produto.adicionarProdutos(quantidade); // Adiciona a quantidade de produtos no estoque
        System.out.println(); // Pula uma linha
        System.out.println("Update data: " + produto.toString()); // Exibe os dados do produto
        System.out.println(); // Pula uma linha
        System.out.print("Entre com uma quantidade de produtos a serem removidos do estoque: "); // Solicita a quantidade de produtos a serem removidos do estoque
        quantidade = sc.nextInt(); // Lê a quantidade de produtos a serem removidos do estoque
        produto.removerProdutos(quantidade); // Remove a quantidade de produtos do estoque
        System.out.println(); // Pula uma linha
        System.out.println("Update data: " + produto.toString()); // Exibe os dados do produto


        sc.close(); // Fecha o Scanner
    }
}