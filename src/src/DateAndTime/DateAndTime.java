package DateAndTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class DateAndTime {

    public static void main(String[] args) {

        //Datum a cas
        LocalDateTime datumCas = LocalDateTime.of(2016, Month.APRIL,15,3,15,56);
        System.out.println(datumCas);
        LocalDate datum = LocalDate.of(1988, Month.FEBRUARY, 17);
        System.out.println(datum);
        LocalTime cas = LocalTime.of(3,23,45);
        System.out.println(cas);

        //Now
        LocalDateTime datumCasNow = LocalDateTime.now();
        System.out.println(datumCasNow);
        LocalDate datumNow = LocalDate.now();
        System.out.println(datumNow);
        LocalTime casNow = LocalTime.now();
        System.out.println(casNow);

        //Own format
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM)));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d.M.y H:m:ss")));

//        Conversion
        LocalDateTime datumCasPrevod = LocalDateTime.of(LocalDate.of(1988, Month.FEBRUARY,14), LocalTime.of(2,3));
        System.out.print(datumCasPrevod);
//        Conversion
        LocalDate zaciatok = LocalDate.of(1944,12,3);
        LocalDateTime zaciatokDna = zaciatok.atStartOfDay(); // zaciatok dna nastaveny na 00:00
        LocalDateTime danyZaciatok = zaciatok.atTime(10,0); // pripoji lubovolny cas
        System.out.println(zaciatokDna);
        System.out.println(danyZaciatok);

        LocalDateTime datumCasPlus = LocalDateTime.now();
        datumCasPlus = datumCasPlus.plusDays(3);    // plus 3 dni
        System.out.println(datumCasPlus.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(datumCasPlus.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(datumCasPlus.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(datumCasPlus.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
    }

}
