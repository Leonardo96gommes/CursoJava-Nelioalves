package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt(); // Lê o tamanho do vetor
        int[] vetor = new int[n]; // Cria um vetor de inteiros com tamanho n

        for (int i = 0; i < vetor.length; i++) { // Loop para ler os elementos do vetor
            System.out.printf("Digite o %do. número: ", i + 1);
            vetor[i] = sc.nextInt(); // Lê o elemento do vetor
        }

        System.out.println("Números negativos: ");
        for (int i = 0; i < vetor.length; i++) { // Loop para exibir os números negativos
            if (vetor[i] < 0) { // Se o número for negativo
                System.out.println(vetor[i]); // Exibe o número
            }
        }
        sc.close(); // Fecha o Scanner
    }
}
