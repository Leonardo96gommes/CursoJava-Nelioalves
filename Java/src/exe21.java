import java.util.Scanner; // Importa a classe Scanner para leitura de dados do usuário

public class exe21 { // Declaração da classe principal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int senha = 2002; // Declaração e inicialização da variável que armazena a senha correta
        int tentativa = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário e armazena na variável tentativa

        // Estrutura de repetição while que continua enquanto a tentativa for diferente da senha
        while (tentativa != senha) {
            System.out.println("Senha Invalida"); // Imprime mensagem de senha inválida
            tentativa = sc.nextInt(); // Lê a próxima tentativa fornecida pelo usuário
        }

        // Imprime mensagem de acesso permitido quando a senha correta é fornecida
        System.out.println("Acesso Permitido");
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }
}