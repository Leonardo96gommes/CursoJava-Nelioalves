package entities;
import aula03.Aluno;

import java.util.Scanner;

public class Alunotestar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        aluno1.setNome(nome);
        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        aluno1.setIdade(idade);
        System.out.println("Idade do aluno: " + aluno1.getIdade());

        sc.close();

    }
}
