package entities;

// Declaração da classe Vetorv2
public class Vetorv2 {
    private String name; // Variável de instância para armazenar o nome
    private double price; // Variável de instância para armazenar o preço

    // Construtor da classe Vetorv2
    public Vetorv2(String name, double price) {
        this.name = name; // Inicializa a variável name com o valor passado
        this.price = price; // Inicializa a variável price com o valor passado
    }

    // Método para obter o nome
    public String getName() {
        return name; // Retorna o valor da variável name
    }

    // Método para obter o preço
    public double getPrice() {
        return price; // Retorna o valor da variável price
    }
}
