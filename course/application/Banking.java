package application;

import entities.Account;
import entities.BunisessAccount;
import entities.SavingsAccount;

public class Banking {
    public static void main(String[] args) {

        // Criação de uma conta genérica
        Account acc = new Account(1001, "Alex", 0.0);

        // Criação de uma conta empresarial com limite de empréstimo
        BunisessAccount bacc = new BunisessAccount(1002, "Maria", 0.0, 500.0);

        // **UPCASTING**: Conversão de uma subclasse para uma superclasse
        Account acc1 = bacc; // BunisessAccount convertido para Account
        Account acc2 = new BunisessAccount(1003, "Bob", 0.0, 200.0); // Instância de BunisessAccount atribuída a Account
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01); // Instância de SavingsAccount atribuída a Account

        // **DOWNCASTING**: Conversão de uma superclasse para uma subclasse
        BunisessAccount acc4 = (BunisessAccount) acc2; // Account convertido de volta para BunisessAccount
        acc4.loan(100.0); // Realiza um empréstimo na conta empresarial

        // Verificação de tipo antes de realizar o downcasting
        if (acc3 instanceof BunisessAccount) { // Verifica se acc3 é uma instância de BunisessAccount
            BunisessAccount acc5 = (BunisessAccount) acc3; // Downcasting para BunisessAccount
            acc5.loan(200.0); // Realiza um empréstimo
            System.out.println("Loan!"); // Exibe mensagem indicando que o empréstimo foi realizado
        }

        if (acc3 instanceof SavingsAccount) { // Verifica se acc3 é uma instância de SavingsAccount
            SavingsAccount acc5 = (SavingsAccount) acc3; // Downcasting para SavingsAccount
            acc5.updateBalance(); // Atualiza o saldo com base na taxa de juros
            System.out.println("Update!"); // Exibe mensagem indicando que o saldo foi atualizado
        }
    }
}