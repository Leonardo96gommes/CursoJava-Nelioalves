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

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + i + ":");

            int id;
            do {
                System.out.print("Id: ");
                id = sc.nextInt();
                if (hasId(list, id) != null) {
                    System.out.println("Este ID já existe! Tente novamente.");
                }
            } while (hasId(list, id) != null);

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salary = sc.nextDouble();

            Employees emp = new Employees(id, name, salary);
            list.add(emp);
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

    public static Integer hasId(List<Employees> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}