package application;

import java.util.Locale;
import java.util.Scanner;
import entities.accbank; // Importa a classe accbank do pacote entities

public class Account {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        System.out.print("Digite o número da conta: "); // Solicita o número da conta
        int accountNumber = sc.nextInt(); // Lê o número da conta
        sc.nextLine(); // Consome a nova linha deixada pelo nextInt()
        System.out.print("Digite o titular da conta: "); // Solicita o titular da conta
        String holder = sc.nextLine(); // Lê o titular da conta
        System.out.print("Há um depósito inicial (s/n)? "); // Pergunta se há um depósito inicial
        char response = sc.next().charAt(0); // Lê a resposta do usuário

        double initialDeposit = 0.0; // Inicializa o depósito inicial com 0.0
        if (response == 's') { // Se a resposta for 's'
            System.out.print("Digite o valor do depósito inicial: "); // Solicita o valor do depósito inicial
            initialDeposit = sc.nextDouble(); // Lê o valor do depósito inicial
        }

        accbank acc = new accbank(accountNumber, holder, initialDeposit); // Cria uma nova conta com os dados fornecidos

        System.out.println(); // Pula uma linha
        System.out.println("Dados da conta:"); // Exibe a mensagem "Dados da conta:"
        System.out.println(acc); // Exibe os dados da conta

        System.out.println(); // Pula uma linha
        System.out.print("Digite um valor para depósito: "); // Solicita um valor para depósito
        double depositValue = sc.nextDouble(); // Lê o valor do depósito
        acc.deposit(depositValue); // Realiza o depósito na conta
        System.out.println(acc); // Exibe os dados atualizados da conta

        System.out.print("Digite um valor para saque: "); // Solicita um valor para saque
        double withdrawValue = sc.nextDouble(); // Lê o valor do saque
        acc.withdraw(withdrawValue); // Realiza o saque na conta
        System.out.println("Dados da conta atualizados:"); // Exibe a mensagem "Dados da conta atualizados:"
        System.out.println(acc); // Exibe os dados atualizados da conta

        sc.close(); // Fecha o Scanner
    }
}