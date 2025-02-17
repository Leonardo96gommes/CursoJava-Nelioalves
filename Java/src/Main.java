import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis
        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        // Configura o Locale para US
        Locale.setDefault(Locale.US);

        // Imprime o valor de y
        System.out.println(y);
        // Imprime uma mensagem de bom dia
        System.out.println("Bom dia!");

        // Imprime o valor de x com duas casas decimais
        System.out.printf("%.2f%n", x);
        // Imprime o valor de x com quatro casas decimais
        System.out.printf("%.4f%n", x);

        // Imprime o resultado com o valor de x em metros
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n", x);

        // Imprime uma mensagem com o nome, idade e renda formatados
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda );
    }
}

