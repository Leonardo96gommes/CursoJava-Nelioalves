package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Vetorv2;

public class Vetorpart2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        int n = sc.nextInt(); // Lê o número de produtos
        Vetorv2[] vect = new Vetorv2[n]; // Cria um vetor de Vetorv2 com tamanho n
        for (int i = 0; i < vect.length; i++) { // Loop para ler os dados dos produtos
            sc.nextLine(); // Consome a nova linha deixada pelo nextInt()
            String name = sc.nextLine(); // Lê o nome do produto
            double price = sc.nextDouble(); // Lê o preço do produto
            vect[i] = new Vetorv2(name, price); // Cria um novo objeto Vetorv2 e adiciona ao vetor
        }
        double sum = 0.0; // Inicializa a soma dos preços
        for (int i = 0; i < vect.length; i++) { // Loop para somar os preços dos produtos
            sum += vect[i].getPrice(); // Adiciona o preço do produto à soma
        }
        double avg = sum / vect.length; // Calcula a média dos preços
        System.out.printf("AVERAGE PRICE = %.2f%n", avg); // Exibe a média dos preços
        sc.close(); // Fecha o Scanner
    }
}