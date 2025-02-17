import java.util.Scanner;

public class exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();


        while (x != y) {
            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
            System.out.print("Digite o valor de x: ");
            x = sc.nextInt();
            System.out.print("Digite o valor de y: ");
            y = sc.nextInt();
        }
        System.out.println("Fim do programa");
        sc.close();
    }
}
