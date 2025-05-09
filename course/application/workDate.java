package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class workDate {
    public static void main(String[] args) {
        // Formatos de data para conversão
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Criação de objetos Date com diferentes instantes
        Date x1 = new Date(); // Data e hora atuais
        Date x2 = new Date(System.currentTimeMillis()); // Data e hora atuais
        Date x3 = new Date(0L); // Data correspondente ao início da era Unix (01/01/1970)
        Date x4 = new Date(1000L * 60L * 60L * 5L); // Data correspondente a 5 horas após o início da era Unix

        try {
            // Conversão de strings para objetos Date
            Date y1 = sdf1.parse("25/06/2018");
            Date y2 = sdf2.parse("25/06/2018 15:42:07");
            Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

            // Impressão dos objetos Date
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
            System.out.println("x3: " + x3);
            System.out.println("x4: " + x4);
            System.out.println("y1: " + y1);
            System.out.println("-------------");

            // Impressão dos objetos Date formatados com sdf2
            System.out.println("x1: " + sdf2.format(x1));
            System.out.println("x2: " + sdf2.format(x2));
            System.out.println("x3: " + sdf2.format(x3));
            System.out.println("x4: " + sdf2.format(x4));
            System.out.println("y1: " + sdf2.format(y1));
            System.out.println("y2: " + sdf2.format(y2));
            System.out.println("-------------");

            // Impressão dos objetos Date formatados com sdf3
            System.out.println("x1: " + sdf3.format(x1));
            System.out.println("x2: " + sdf3.format(x2));
            System.out.println("x3: " + sdf3.format(x3));
            System.out.println("x4: " + sdf3.format(x4));
            System.out.println("y1: " + sdf3.format(y1));
            System.out.println("y2: " + sdf3.format(y2));
            System.out.println("y3: " + sdf3.format(y3));
        } catch (ParseException e) {
            // Tratamento de exceção para erros de parsing
            e.printStackTrace();
        }
    }
}