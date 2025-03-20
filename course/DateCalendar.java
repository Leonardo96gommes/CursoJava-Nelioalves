import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
    public static void main(String[] args) {
        // Somando uma unidade de tempo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));

        // Obtém uma instância de Calendar e define a data
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        // Adiciona 4 horas à data
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(sdf.format(d));

        // Obtendo uma unidade de tempo
        d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        // Obtém uma instância de Calendar e define a data
        cal.setTime(d);

        // Obtém os minutos e o mês da data
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH); // Janeiro é 0, então adiciona 1
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}