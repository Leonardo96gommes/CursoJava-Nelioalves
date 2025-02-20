/* Funções
• Representam um processamento que possui um significado
• Math.sqrt(double)
• System.out.println(string)
• Principais vantagens: modularização, delegação e reaproveitamento
• Dados de entrada e saída
• Funções podem receber dados de entrada (parâmetros ou argumentos)
• Funções podem ou não retornar uma saída
• Em orientação a objetos, funções em classes recebem o nome de
"métodos"
• Exemplo: Math.sqrt(double)
 */

import java.util.Scanner;

public class Funçoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Enter three numbers:"); // Solicita ao usuário que digite três números
        int a = sc.nextInt(); // Lê o primeiro número inteiro fornecido pelo usuário
        int b = sc.nextInt(); // Lê o segundo número inteiro fornecido pelo usuário
        int c = sc.nextInt(); // Lê o terceiro número inteiro fornecido pelo usuário
        int higher = max(a, b, c); // Chama a função max para encontrar o maior dos três números e armazena o resultado na variável higher
        showResult(higher); // Chama a função showResult para exibir o maior número encontrado
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }

    // Função que recebe três inteiros e retorna o maior deles
    public static int max(int x, int y, int z) {
        int aux; // Declaração da variável auxiliar para armazenar o maior valor
        if (x > y && x > z) { // Verifica se x é maior que y e z
            aux = x; // Se verdadeiro, armazena x em aux
        } else if (y > z) { // Caso contrário, verifica se y é maior que z
            aux = y; // Se verdadeiro, armazena y em aux
        } else {
            aux = z; // Se nenhuma das condições anteriores for verdadeira, armazena z em aux
        }
        return aux; // Retorna o maior valor encontrado
    }

    // Função que recebe um inteiro e exibe o resultado
    public static void showResult(int value) {
        System.out.println("Higher = " + value); // Imprime o valor recebido
    }
}
