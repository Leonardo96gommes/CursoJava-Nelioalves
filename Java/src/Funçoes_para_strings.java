    /*
     * 1. Funções para strings
     Checklist
     • Formatar: toLowerCase(), toUpperCase(), trim()
     • Recortar: substring(inicio), substring(inicio, fim)
     • Substituir: Replace(char, char), Replace(string, string)
     • Buscar: IndexOf, LastIndexOf
     • str.Split(" ")
     */

public class Funçoes_para_strings {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG "; // Declaração e inicialização da string original
        String s01 = original.toLowerCase(); // Converte todos os caracteres da string original para minúsculas
        String s02 = original.toUpperCase(); // Converte todos os caracteres da string original para maiúsculas
        String s03 = original.trim(); // Remove os espaços em branco no início e no final da string original
        String s04 = original.substring(2); // Extrai uma substring da string original a partir do índice 2
        String s05 = original.substring(2, 9); // Extrai uma substring da string original do índice 2 ao 9
        String s06 = original.replace('a', 'x'); // Substitui todas as ocorrências do caractere 'a' por 'x' na string original
        String s07 = original.replace("abc", "xy"); // Substitui todas as ocorrências da substring "abc" por "xy" na string original
        int i = original.indexOf("bc"); // Retorna o índice da primeira ocorrência da substring "bc" na string original
        int j = original.lastIndexOf("bc"); // Retorna o índice da última ocorrência da substring "bc" na string original
        System.out.println("Original: -" + original + "-"); // Imprime a string original
        System.out.println("toLowerCase: -" + s01 + "-"); // Imprime a string convertida para minúsculas
        System.out.println("toUpperCase: -" + s02 + "-"); // Imprime a string convertida para maiúsculas
        System.out.println("trim: -" + s03 + "-"); // Imprime a string sem espaços em branco no início e no final
        System.out.println("substring(2): -" + s04 + "-"); // Imprime a substring a partir do índice 2
        System.out.println("substring(2, 9): -" + s05 + "-"); // Imprime a substring do índice 2 ao 9
        System.out.println("replace('a', 'x'): -" + s06 + "-"); // Imprime a string com 'a' substituído por 'x'
        System.out.println("replace('abc', 'xy'): -" + s07 + "-"); // Imprime a string com "abc" substituído por "xy"
        System.out.println("Index of 'bc': " + i); // Imprime o índice da primeira ocorrência de "bc"
        System.out.println("Last index of 'bc': " + j); // Imprime o índice da última ocorrência de "bc"



        // Operação split

        String s = "potato apple lemon"; // Declaração e inicialização da string s com três palavras separadas por espaços
        String[] vect = s.split(" "); // Divide a string s em um array de strings usando o espaço como delimitador
        String word1 = vect[0]; // Armazena a primeira palavra do array na variável word1
        String word2 = vect[1]; // Armazena a segunda palavra do array na variável word2
        String word3 = vect[2]; // Armazena a terceira palavra do array na variável word3
    }
}
