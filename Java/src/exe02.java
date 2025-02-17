// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.

import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe02 { // Declaração da classe principal
    public void main(String[] args) { // Método principal que inicia a execução do programa
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        double r, a, pi = 3.14159; // Declaração das variáveis para armazenar o raio, a área e o valor de pi

        // Solicita ao usuário que digite o valor do raio
        System.out.println("Digite o valor do raio: ");
        r = sc.nextDouble(); // Lê o valor do raio digitado pelo usuário

        // Calcula a área do círculo
        a = pi * r * r;

        // Imprime o valor da área do círculo com quatro casas decimais
        System.out.printf("A AREA DO CIRCULO DE RAIO %.2f = %.4f%n", r, a);

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}