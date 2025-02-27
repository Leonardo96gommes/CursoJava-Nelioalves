package entities; // Define o pacote da classe

public class Produto { // Declaração da classe Produto
    private String nome; // Atributo para o nome do produto
    private double preco; // Atributo para o preço do produto
    private int quantidade; // Atributo para a quantidade no estoque

    public  Produto() { // Construtor padrão
    }

    public Produto(String nome, double preco, int quantidade) { // Construtor padrão
        this.nome = nome; // Inicializa o nome do produto
        this.preco = preco; // Inicializa o preço do produto
        this.quantidade = quantidade; // Inicializa a quantidade no estoque
    }

    public Produto(String nome, double preco) { // Construtor padrão
        this.nome = nome; // Inicializa o nome do produto
        this.preco = preco; // Inicializa o preço do produto
    }

    public String getNome() { // Método para obter o nome do produto
        return nome; // Retorna o nome do produto
    }

    public void setNome(String nome) { // Método para obter o nome do produto
        this.nome = nome; // Retorna o nome do produto
    }

    public double getPreco() { // Método para obter o preço do produto
        return preco; // Retorna o preço do produto
    }

    public void setPreco(double preco) { // Método para definir o preço do produto
        this.preco = preco; // Define o preço do produto
    }

    public int getQuantidade() { // Método para obter a quantidade no estoque
        return quantidade; // Retorna a quantidade no estoque
    }


    public double valorTotalEmEstoque() { // Método para calcular o valor total em estoque
        return preco * quantidade; // Retorna o valor total em estoque
    }

    public void adicionarProdutos(int quantidade) { // Método para adicionar produtos ao estoque
        this.quantidade += quantidade; // Adiciona a quantidade ao estoque
    }

    public void removerProdutos(int quantidade) { // Método para remover produtos do estoque
        this.quantidade -= quantidade; // Remove a quantidade do estoque
    }

    public String toString() { // Método para retornar uma representação em string do produto
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: $ "
                + String.format("%.2f", valorTotalEmEstoque()); // Retorna os dados do produto formatados
    }
}