package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calcDataHora {

    public static void main(String[] args) {

        // Converte strings para objetos de data/hora
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Calcula a data de uma semana atrás e uma semana à frente
        LocalDate pastWeekDate = d04.minusDays(7);
        LocalDate nextWeekDate = d04.plusDays(7);

        // Calcula a data/hora de uma semana atrás e uma semana à frente
        LocalDateTime pastWeekLocalDate = d05.minusDays(7);
        LocalDateTime nextWeekLocalDate = d05.plusDays(7);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        // Imprime as datas calculadas
        System.out.println("Data da semana passada = " + pastWeekDate);
        System.out.println("Data da próxima semana = " + nextWeekDate);

        // Imprime as datas/horas calculadas
        System.out.println("Data/hora da semana passada = " + pastWeekLocalDate);
        System.out.println("Data/hora da próxima semana = " + nextWeekLocalDate);

        // Imprime os instantes calculados
        System.out.println("Instante da semana passada = " + pastWeekInstant);
        System.out.println("Instante da próxima semana = " + nextWeekInstant);

        // Calcula a duração entre as datas
        Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDate, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        // Imprime a duração em dias
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
    }
}