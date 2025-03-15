package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {

        // Define formatos de data/hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Obtém a data e hora atuais
        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now();

        // Converte strings para objetos de data/hora
        LocalDate date4 = LocalDate.parse("2021-07-20");
        LocalDateTime date5 = LocalDateTime.parse("2021-07-20T15:42:07");
        Instant date6 = Instant.parse("2021-07-20T15:42:07Z");
        Instant date7 = Instant.parse("2021-07-20T01:30:26-03:00");

        // Converte strings para objetos de data/hora usando formatos definidos
        LocalDate date8 = LocalDate.parse("20/07/2021", fmt1);
        LocalDateTime date9 = LocalDateTime.parse("20/07/2022 01:30:26", fmt2);

        // Cria objetos de data/hora usando valores específicos
        LocalDate date10 = LocalDate.of(2022, 7, 20);
        LocalDateTime date11 = LocalDateTime.of(2022, 7, 20, 15, 42, 07);

        // Imprime os objetos de data/hora
        System.out.println("Data Hora: " + date1);
        System.out.println("Data Hora: " + date2);
        System.out.println("Data Hora: " + date3);
        System.out.println("Data Hora: " + date4);
        System.out.println("Data Hora: " + date5);
        System.out.println("Data Hora: " + date6);
        System.out.println("Data Hora: " + date7);
        System.out.println("Data Hora: " + date8);
        System.out.println("Data Hora: " + date9);
        System.out.println("Data Hora: " + date10);
        System.out.println("Data Hora: " + date11);
    }
}