package application;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt(); // Lê o número de pessoas

        String[] nomes = new String[n]; // Cria um vetor para armazenar os nomes
        double[] alturas = new double[n]; // Cria um vetor para armazenar as alturas
        int[] idades = new int[n]; // Cria um vetor para armazenar as idades

        for(int i = 0; i < n; i++) { // Loop para ler os dados de cada pessoa
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine(); // Consome a nova linha deixada pelo nextInt()
            nomes[i] = sc.nextLine(); // Lê o nome da pessoa
            System.out.print("Idade: ");
            idades[i] = sc.nextInt(); // Lê a idade da pessoa
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble(); // Lê a altura da pessoa
        }

        double soma = 0;
        for(int i = 0; i < n; i++) { // Loop para somar as alturas
            soma += alturas[i];
        }
        double media = soma / n; // Calcula a média das alturas

        System.out.printf("Altura média: %.2f%n", media); // Exibe a média das alturas

        int cont = 0;
        for(int i = 0; i < n; i++) { // Loop para contar quantas pessoas têm menos de 16 anos
            if (idades[i] < 16) {
                cont++;
            }
        }
        double porcentagem = (double) cont / n * 100; // Calcula a porcentagem de pessoas com menos de 16 anos

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem); // Exibe a porcentagem de pessoas com menos de 16 anos

        for(int i = 0; i < n; i++) { // Loop para exibir os nomes das pessoas com menos de 16 anos
            if (idades[i] < 16) {
                System.out.printf("%s%n", nomes[i]);
            }
        }
    }
}