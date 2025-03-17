package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataTexto {
    public static void main(String[] args) {
        // Converte strings para objetos de data/hora
        LocalDate dt04 = LocalDate.parse("2022-07-20");
        LocalDateTime dt05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant dt06 = Instant.parse("2022-07-20T01:30:26Z");

        // Define formatos de data/hora
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;

        // Imprime os objetos de data/hora formatados
        System.out.println("dt04: " + dt04.format(fmt01));
        System.out.println("dt04: " + fmt01.format(dt04));
        System.out.println("dt04: " + dt04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("dt05: " + dt05.format(fmt01));
        System.out.println("dt05: " + dt05.format(fmt02));
        System.out.println("dt05: " + dt05.format(fmt04));
        System.out.println("dt06: " + fmt03.format(dt06));
        System.out.println("dt06: " + fmt05.format(dt06));
        System.out.println("dt06: " + dt06.toString());
    }
}


    }
}
