import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

// Operadores bitwise
// Os operadores bitwise são usados para manipular bits de variáveis inteiras
// Eles são usados para realizar operações lógicas bit a bit em variáveis inteiras
// Os operadores bitwise são: & (AND), | (OR), ^ (XOR), ~ (NOT), << (left shift), >> (right shift)
// Exemplo: 0b100000 & 0b100000 = 0b100000 (32 & 32 = 32)


public class operadores_bitwise { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int mask = 0b100000; // Declara uma máscara binária com o valor 32 (6º bit)
        int n = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável n

        // Verifica se o 6º bit do número n é verdadeiro (1)
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!"); // Imprime que o 6º bit é verdadeiro
        } else {
            System.out.println("6th bit is false"); // Imprime que o 6º bit é falso
        }

        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}