import java.util.Locale;

public class Fixa {
    public static void main(String[] args) {
        // Declaração de variáveis de produtos
        String product1 = "Computer";
        String product2 = "Office desk";

        // Declaração de variáveis de dados pessoais
        int age = 30;
        int code = 5290;
        char gender = 'F';

        // Declaração de variáveis de preços e medidas
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // Impressão dos produtos
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, Office desk, which price is $ %.2f%n", product2, price2);
        System.out.println();

        // Impressão dos dados pessoais
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();

        // Impressão das medidas com diferentes formatações
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        // Configuração do locale para US e impressão da medida com ponto decimal americano
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}