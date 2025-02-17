// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe01 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal

        // Solicita ao usuário que digite dois números inteiros
        System.out.println("Digite um numero: ");
        int number1 = sc.nextInt(); // Lê o primeiro número digitado pelo usuário
        System.out.println("Digite um segundo numero: ");
        int number2 = sc.nextInt(); // Lê o segundo número digitado pelo usuário

        // Calcula a soma dos dois números
        int soma = number1 + number2;

        // Imprime a soma dos valores com uma mensagem explicativa
        System.out.printf("A SOMA DOS VALORES DEU: = %d%n", soma);

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}