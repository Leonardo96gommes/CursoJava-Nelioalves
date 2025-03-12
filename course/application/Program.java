package application;

import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        Locale.setDefault(Locale.US); // Define o local padrão para US

        List<Employees> list = new ArrayList<>(); // Cria uma lista de objetos Employees

        System.out.println("Quantos funcionários serão registrados?");
        int n = sc.nextInt(); // Lê o número de funcionários a serem registrados

        for (int i = 1; i <= n; i++) { // Loop para registrar cada funcionário
            System.out.println();
            System.out.println("Funcionário #" + i + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt(); // Lê o ID do funcionário
            System.out.print("Nome: ");
            sc.nextLine(); // Consome a quebra de linha pendente
            String name = sc.nextLine(); // Lê o nome do funcionário
            System.out.print("Salário: ");
            Double salary = sc.nextDouble(); // Lê o salário do funcionário
            Employees emp = new Employees(id, name, salary); // Cria um novo objeto Employees

            list.add(emp); // Adiciona o objeto Employees à lista
        }

        System.out.println("Digite o id do funcionário que terá aumento de salário: ");
        System.out.println();
        int idsalary = sc.nextInt(); // Lê o ID do funcionário que terá aumento de salário
        Employees emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null); // Verifica se o ID existe na lista

        if (emp == null) {
            System.out.println("Este ID não existe!"); // Mensagem de erro se o ID não existir
        } else {
            System.out.print("Insira a porcentagem: ");
            double percent = sc.nextDouble(); // Lê a porcentagem de aumento
            emp.increaseSalary(percent); // Aumenta o salário do funcionário
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Employees e : list) { // Itera sobre a lista de funcionários e imprime cada um
            System.out.println(e);
        }

        sc.close(); // Fecha o Scanner
    }

    public Integer hasId(List<Employees> list, int id) {
        for (int i = 0; i < list.size(); i++) { // Itera sobre a lista de funcionários
            if (list.get(i).getId() == id) { // Verifica se o ID corresponde
                return i; // Retorna o índice do funcionário
            }
        }
        return null; // Retorna null se o ID não for encontrado
    }
}