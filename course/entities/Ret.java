package entities; // Define o pacote da classe

public class Ret { // Declaração da classe Ret
    public double largura; // Atributo para a largura do retângulo
    public double altura; // Atributo para a altura do retângulo

    public double area() { // Método para calcular a área do retângulo
        return largura * altura; // Retorna a área do retângulo
    }

    public double perimetro() { // Método para calcular o perímetro do retângulo
        return 2 * (largura + altura); // Retorna o perímetro do retângulo
    }

    public double diagonal() { // Método para calcular a diagonal do retângulo
        return Math.sqrt(largura * largura + altura * altura); // Retorna a diagonal do retângulo
    }
}