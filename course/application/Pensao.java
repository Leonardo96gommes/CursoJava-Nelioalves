package application;
import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Pensao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt(); // Lê o número de quartos que serão alugados
        Rent[] Quartos = new Rent[10]; // Cria um array de Rent com 10 posições para representar os quartos

        for (int i = 0; i < n; i++) { // Loop para ler os dados de cada aluguel
            sc.nextLine(); // Consome a nova linha deixada pelo nextInt()
            System.out.println("Aluguel #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String name = sc.nextLine(); // Lê o nome do inquilino
            System.out.print("Email: ");
            String email = sc.nextLine(); // Lê o email do inquilino
            System.out.print("Quarto: ");
            int room = sc.nextInt(); // Lê o número do quarto a ser alugado
            Quartos[room] = new Rent(name, email); // Atribui um novo objeto Rent ao quarto correspondente
        }

        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) { // Loop para exibir os quartos ocupados
            if (Quartos[i] != null) { // Verifica se o quarto está ocupado
                System.out.println(i + ": " + Quartos[i]); // Imprime o número do quarto e os detalhes do inquilino
            }
        }

        sc.close(); // Fecha o Scanner
    }
}