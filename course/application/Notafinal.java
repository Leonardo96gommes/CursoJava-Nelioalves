package application;
import entities.Estudante;
import java.util.Locale;
import java.util.Scanner;

public class Notafinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante(); // Instancia um objeto da classe Estudante
        System.out.print("Nome do estudante: "); // Exibe a mensagem "Nome do estudante: "
        estudante.nome = sc.nextLine(); // Lê o nome do estudante
        System.out.print("Digite as três notas do estudante: "); // Exibe a mensagem "Digite as três notas do estudante: "
        estudante.nota1 = sc.nextDouble(); // Lê a primeira nota do estudante
        estudante.nota2 = sc.nextDouble(); // Lê a segunda nota do estudante
        estudante.nota3 = sc.nextDouble(); // Lê a terceira nota do estudante

        System.out.printf("Nota Trimestral = %.2f%n", estudante.notaFinal()); // Exibe a nota final do estudante

        if (estudante.notaFinal() < 60.0) { // Verifica se a nota final é menor que 60
            System.out.println("Reprovado"); // Exibe a mensagem "Reprovado"
            System.out.printf("Faltaram %.2f pontos%n", estudante.pontosFaltantes()); // Exibe a quantidade de pontos faltantes
        } else {
            System.out.println("Aprovado"); // Exibe a mensagem "Aprovado"
        }

        sc.close();
    }
}
