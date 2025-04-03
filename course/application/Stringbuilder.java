package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Stringbuilder { // Nome da classe corrigido
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, that's awesome!");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                12,
                "Traveling to New Zealand",
                "Trip to New Zealand"
        );

        p1.addComment(c1);
        p1.addComment(c2); // Adicionando o segundo comentário

        System.out.println(p1); // Exibe o post com tudo formatado

        sc.close(); // Boa prática fechar o Scanner
    }
}
