package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateHoraConvertLocal {
    public static void main(String[] args) {
        // Converte strings para objetos de data/hora
        LocalDate d04 = LocalDate.parse("2021-04-20");
        LocalDateTime d05 = LocalDateTime.parse("2021-04-20T15:42:07");
        Instant d06 = Instant.parse("2021-04-20T15:42:07Z");

        // Converte Instant para LocalDate e LocalDateTime em diferentes fusos horários
        LocalDate r01 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r02 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r03 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r04 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1: " + r01);
        System.out.println("r2: " + r02);
        System.out.println("r3: " + r03);
        System.out.println("r4: " + r04);

        // Imprime partes específicas da data d04
        System.out.println("d04 Dia: " + d04.getDayOfMonth());
        System.out.println("dt04 Mes: " + d04.getMonthValue());
        System.out.println("d04 Segundo: " + d04.getYear());

        // Imprime partes específicas da data/hora d05
        System.out.println("d05 hora: " + d05.getHour());
        System.out.println("d05 minuto: " + d05.getMinute());

        // Código comentado que imprime todos os fusos horários disponíveis
        /* for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        } */
    }
}