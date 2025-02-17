// Estrutura sequencial em Java exercício resolvido 01

import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe00 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal

        // Lê a largura, comprimento e valor por metro quadrado digitados pelo usuário
        Double largura = sc.nextDouble(); // Lê a largura do terreno
        Double comprimento = sc.nextDouble(); // Lê o comprimento do terreno
        Double valorMetroQuadrado = sc.nextDouble(); // Lê o valor do metro quadrado

        // Calcula a área e o preço do terreno
        Double area = largura * comprimento; // Calcula a área do terreno
        Double preco = area * valorMetroQuadrado; // Calcula o preço do terreno

        // Imprime a área e o preço do terreno com duas casas decimais
        System.out.printf("AREA = %.2f%n", area); // Imprime a área do terreno
        System.out.printf("PRECO = %.2f%n", preco); // Imprime o preço do terreno

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}