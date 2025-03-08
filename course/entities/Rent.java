package entities;

// Declaração da classe Rent
public class Rent {
    private String name; // Variável de instância para armazenar o nome do inquilino
    private String email; // Variável de instância para armazenar o email do inquilino

    // Construtor padrão da classe Rent
    public Rent() {
    }

    // Construtor da classe Rent que inicializa as variáveis name e email
    public Rent(String name, String email) {
        this.name = name; // Inicializa a variável name com o valor passado
        this.email = email; // Inicializa a variável email com o valor passado
    }

    // Método para obter o nome do inquilino
    public String getName() {
        return name; // Retorna o valor da variável name
    }

    // Método para obter o email do inquilino
    public String getEmail() {
        return email; // Retorna o valor da variável email
    }

    // Método toString para representar o objeto Rent como uma string
    public String toString() {
        return name + ", " + email; // Retorna uma string com o nome e o email do inquilino
    }
}