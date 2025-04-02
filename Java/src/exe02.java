import java.util.Locale;
import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double r, a, pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        r = sc.nextDouble();

        a = pi * r * r;

        System.out.printf("A área do círculo de raio %.2f = %.4f%n", r, a);

        sc.close();
    }
}