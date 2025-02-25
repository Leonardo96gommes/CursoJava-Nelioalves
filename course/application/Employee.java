package application; // Define o pacote da classe

import entities.Emp; // Importa a classe Emp do pacote entities

import java.util.Locale; // Importa a classe Locale para configuração regional
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Employee { // Declaração da classe principal
    public static void main(String[] args) { // Método principal
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        Emp emp = new Emp(); // Cria uma nova instância da classe Emp
        System.out.print("Nome: "); // Solicita o nome do empregado
        emp.name = sc.nextLine(); // Lê o nome do empregado
        System.out.print("Salario bruto: "); // Solicita o salário bruto do empregado
        emp.grossSalary = sc.nextDouble(); // Lê o salário bruto do empregado
        System.out.print("Valor do imposto: "); // Solicita o valor do imposto
        emp.tax = sc.nextDouble(); // Lê o valor do imposto

        System.out.println(); // Pula uma linha
        System.out.println("Funcionario: " + emp); // Exibe os dados do empregado
        System.out.println(); // Pula uma linha

        System.out.print("Qual porcentagem de aumento do salário? "); // Solicita a porcentagem de aumento do salário
        double percentage = sc.nextDouble(); // Lê a porcentagem de aumento do salário
        emp.increaseSalary(percentage); // Aumenta o salário do empregado

        System.out.println(); // Pula uma linha
        System.out.println("Dados atualizados: " + emp); // Exibe os dados atualizados do empregado

        sc.close(); // Fecha o Scanner
    }
}