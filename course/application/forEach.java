package application;

import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        String[] vect = new String[] { "Maria", "Bob", "Alex" }; // Inicializa um array de Strings com três nomes

        // Loop for tradicional para iterar sobre o array usando índices
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]); // Imprime cada elemento do array
        }
        System.out.println("-------------------"); // Imprime uma linha separadora

        // Loop for-each para iterar sobre o array de forma mais simples
        for (String obj : vect) {
            System.out.println(obj); // Imprime cada elemento do array
        }
    }
}