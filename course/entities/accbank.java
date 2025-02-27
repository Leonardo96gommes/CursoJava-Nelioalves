package entities; // Define o pacote da classe

public class accbank { // Declaração da classe accbank
    private int accountNumber; // Atributo para o número da conta
    private String holder; // Atributo para o titular da conta
    private double balance; // Atributo para o saldo da conta

    public accbank(int accountNumber, String holder) { // Construtor que inicializa o número da conta e o titular
        this.accountNumber = accountNumber; // Inicializa o número da conta
        this.holder = holder; // Inicializa o titular da conta
    }

    public accbank(int accountNumber, String holder, double initialDeposit) { // Construtor que inicializa o número da conta, o titular e o depósito inicial
        this.accountNumber = accountNumber; // Inicializa o número da conta
        this.holder = holder; // Inicializa o titular da conta
        deposit(initialDeposit); // Realiza o depósito inicial
    }

    public int getAccountNumber() { // Método para obter o número da conta
        return accountNumber; // Retorna o número da conta
    }

    public String getHolder() { // Método para obter o titular da conta
        return holder; // Retorna o titular da conta
    }

    public void setHolder(String holder) { // Método para definir o titular da conta
        this.holder = holder; // Define o titular da conta
    }

    public double getBalance() { // Método para obter o saldo da conta
        return balance; // Retorna o saldo da conta
    }

    public void deposit(double amount) { // Método para realizar um depósito
        balance += amount; // Adiciona o valor do depósito ao saldo
    }

    public void withdraw(double amount) { // Método para realizar um saque
        balance -= amount + 5.0; // Subtrai o valor do saque e a taxa de 5.0 do saldo
    }

    public String toString() { // Método para retornar uma representação em string da conta
        return "Account "
                + accountNumber
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance); // Retorna os dados da conta formatados
    }
}