package application;

import entities.Departamento;
import entities.horasContract;
import entities.worker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome da empresa: ");
        String departamentoNome = sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nivel: ");
        String WorkerLevel = sc.nextLine();
        System.out.print("Base Salarial: ");
        Double Salario = sc.nextDouble();
        worker worker = new worker(nome, WorkerLevel.valueOf(WorkerLevel), Salario, new Departamento(departamentoNome));
        System.out.print("Quantos contratos esse trabalhador tem?");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com o contrato #" + (i + 1) + " data: ");
            System.out.print("Data (DD/MM/YYYY): ");
            String data = sc.nextLine();
            try {
                Date contratoData = sdf.parse(data);
                System.out.print("Valor por hora: ");
                double valorPorHora = sc.nextDouble();
                System.out.print("Duração (horas): ");
                int horas = sc.nextInt();
                sc.nextLine(); // Consumir a quebra de linha
                horasContract contrato = new horasContract(contratoData, valorPorHora, horas);
                worker.addContract(contrato);
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Por favor, tente novamente.");
            }
        }

        System.out.println();
        System.out.print("Entre com o mes e ano para calcular a renda (MM/YYYY): ");
        String mesEAno = sc.nextLine();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartamento().getNome());
        System.out.println("Renda para " + mesEAno + ": " + String.format("%.2f", worker.income(ano, mes)));

        sc.close();
    }
}