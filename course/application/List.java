package application;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        java.util.List<String> lista = new ArrayList<>(); // Cria uma lista de Strings
        lista.add("Maria"); // Adiciona "Maria" à lista
        lista.add("Alex"); // Adiciona "Alex" à lista
        lista.add("Bob"); // Adiciona "Bob" à lista
        lista.add("Anna"); // Adiciona "Anna" à lista
        lista.add(2, "Marco"); // Adiciona "Marco" na posição 2 da lista

        System.out.println("Tamanho da lista é: " + lista.size()); // Imprime o tamanho da lista

        // Itera sobre a lista e imprime cada elemento
        for (String x : lista) {
            System.out.println(x);
        }

        // Remove elementos da lista cujo primeiro caractere é 'M'
        lista.removeIf(x -> x.charAt(0) == 'M');
        // Itera sobre a lista e imprime cada elemento após a remoção
        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");
        System.out.println("Index of Bob: " + lista.indexOf("Bob")); // Imprime o índice de "Bob"
        System.out.println("Index of Marco: " + lista.indexOf("Marco")); // Imprime o índice de "Marco"

        System.out.println("-------------------------------");
        // Filtra a lista para elementos cujo primeiro caractere é 'A' e coleta em uma nova lista
        java.util.List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        // Itera sobre a lista filtrada e imprime cada elemento
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");
        // Encontra o primeiro elemento cujo primeiro caractere é 'J' ou retorna null se não encontrar
        String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name); // Imprime o nome encontrado ou null

        sc.close(); // Fecha o Scanner
    }
}