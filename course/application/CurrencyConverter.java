package application; // Define o pacote da classe

import util.IOF; // Importa a classe IOF do pacote util
import java.util.Locale; // Importa a classe Locale para configuração regional
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class CurrencyConverter { // Declaração da classe principal
    public static void main(String[] args) { // Método principal
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        IOF iof = new IOF(); // Cria uma nova instância da classe IOF
        double dollarPrice = 3.10; // Define o preço inicial do dólar
        System.out.print("Qual é o preço do dólar? "); // Solicita o preço do dólar
        dollarPrice = sc.nextDouble(); // Lê o valor do preço do dólar
        System.out.print("Quantos dólares serão comprados? "); // Solicita a quantidade de dólares a ser comprada
        double amount = sc.nextDouble(); // Lê a quantidade de dólares
        double result = dollarPrice * amount + iof.tax(dollarPrice * amount); // Calcula o valor total a ser pago em reais, incluindo o IOF
        System.out.printf("Valor a ser pago em reais com IOF incluso = %.2f%n", result); // Exibe o valor total a ser pago em reais

        sc.close(); // Fecha o Scanner
    }
}