// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

import java.util.Locale; // Importa a classe Locale para definir a localidade padrão
import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe04 { // Declaração da classe principal
    public void main(String[] args) { // Método principal que inicia a execução do programa
        Locale.setDefault(Locale.US); // Define a localidade padrão para US, garantindo o uso do ponto como separador decimal
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int num, horas; // Declaração das variáveis inteiras para armazenar o número do funcionário e as horas trabalhadas
        double valorHora, salario; // Declaração das variáveis de ponto flutuante para armazenar o valor por hora e o salário

        // Solicita ao usuário que digite o número do funcionário
        System.out.println("Digite o número do funcionário: ");
        num = sc.nextInt(); // Lê o número do funcionário digitado pelo usuário

        // Solicita ao usuário que digite o número de horas trabalhadas
        System.out.println("Digite o número de horas trabalhadas: ");
        horas = sc.nextInt(); // Lê o número de horas trabalhadas digitado pelo usuário

        // Solicita ao usuário que digite o valor que recebe por hora
        System.out.println("Digite o valor que recebe por hora: ");
        valorHora = sc.nextDouble(); // Lê o valor por hora digitado pelo usuário

        // Calcula o salário multiplicando o número de horas pelo valor por hora
        salario = horas * valorHora;

        // Imprime o número do funcionário e o salário com duas casas decimais
        System.out.println("Numero do Funcionario  = " + num);
        System.out.printf("Salario = U$ %.2f%n", salario);

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}