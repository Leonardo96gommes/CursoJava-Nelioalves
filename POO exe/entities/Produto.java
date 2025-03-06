package entities;

public class Produto {
    //atributos
    public String nomeProduto;
    public double precoProduto;
    public int quantidadeProduto;


public Produto(){
    //construtor Padrao
}

public Produto(String nomeProduto, double precoProduto, int quantidadeProduto){
    //construtor com parametros
    this.nomeProduto = nomeProduto;
    this.precoProduto = precoProduto;
    this.quantidadeProduto = quantidadeProduto;
}

//metodo para calcular o valor total do produto

double calcularValorTotal(){
    return precoProduto * quantidadeProduto;

}

//metodo para adicionar produtos

public void adicionarProdutos(int quantidade){
    quantidadeProduto += quantidade;
}

//metodo para remover produtos

public void removerProdutos(int quantidade){
    quantidadeProduto -= quantidade;
}

//metodo para exibir os dados do produto

public void exibirDados(){
    System.out.println("Nome do produto: " + nomeProduto);
    System.out.printf("Preço do produto: %.3f %n", precoProduto);
    System.out.println("Quantidade do produto: " + quantidadeProduto);
    System.out.printf("Valor total do produto: %.3f %n", calcularValorTotal());
}

}

