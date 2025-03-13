package application;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o tamanho da matriz (n x n)
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        // Preenche a matriz com os valores inseridos pelo usuário
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Exibe a diagonal principal
        System.out.println("Main diagonal:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        // Conta a quantidade de números negativos
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        // Exibe a quantidade de números negativos
        System.out.println("Negative numbers = " + count);

        sc.close(); // Fecha o scanner
    }
}
