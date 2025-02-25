package entities; // Define o pacote da classe

public class Estudante { // Declaração da classe Estudante
    public String nome; // Atributo para o nome do estudante
    public double nota1; // Atributo para a primeira nota do estudante
    public double nota2; // Atributo para a segunda nota do estudante
    public double nota3; // Atributo para a terceira nota do estudante

    // Método para calcular a nota final do estudante
    public double notaFinal() {
        return nota1 + nota2 + nota3; // Retorna a soma das três notas
    }

    // Método para calcular os pontos faltantes para aprovação
    public double pontosFaltantes() {
        if (notaFinal() < 60.0) { // Verifica se a nota final é menor que 60
            return 60.0 - notaFinal(); // Retorna a diferença para 60
        } else {
            return 0.0; // Retorna 0 se a nota final for maior ou igual a 60
        }
    }
}