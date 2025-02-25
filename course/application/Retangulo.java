package application; // Define o pacote da classe

import entities.Ret; // Importa a classe Ret do pacote entities

import java.util.Locale; // Importa a classe Locale para configuração regional
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Retangulo { // Declaração da classe principal
    public static void main(String[] args) { // Método principal
        Locale.setDefault(Locale.US); // Define a localidade padrão para US
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        Ret ret = new Ret(); // Cria uma nova instância da classe Ret

        System.out.println("Digite Retângulo largura e altura:"); // Exibe uma mensagem para o usuário
        ret.largura = sc.nextDouble(); // Lê a largura do retângulo
        ret.altura = sc.nextDouble(); // Lê a altura do retângulo

        System.out.printf("AREA = %.2f%n", ret.area()); // Calcula e exibe a área do retângulo
        System.out.printf("PERIMETRO = %.2f%n", ret.perimetro()); // Calcula e exibe o perímetro do retângulo
        System.out.printf("DIAGONAL = %.2f%n", ret.diagonal()); // Calcula e exibe a diagonal do retângulo

        sc.close(); // Fecha o Scanner
    }
}