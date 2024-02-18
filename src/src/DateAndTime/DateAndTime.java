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

//        //Datum a cas
//        LocalDateTime datumCas = LocalDateTime.of(2016, Month.APRIL,15,3,15,56);
//        System.out.println(datumCas);
//        LocalDate datum = LocalDate.of(1988, Month.FEBRUARY, 17);
//        System.out.println(datum);
//        LocalTime cas = LocalTime.of(3,23,45);
//        System.out.println(cas);
//
//        //Now
//        LocalDateTime datumCasNow = LocalDateTime.now();
//        System.out.println(datumCasNow);
//        LocalDate datumNow = LocalDate.now();
//        System.out.println(datumNow);
//        LocalTime casNow = LocalTime.now();
//        System.out.println(casNow);
//
//        //Own format
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
//        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM)));
//        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d.M.y H:m:ss")));
//
////        Conversion
//        LocalDateTime datumCasPrevod = LocalDateTime.of(LocalDate.of(1988, Month.FEBRUARY,14), LocalTime.of(2,3));
//        System.out.print(datumCasPrevod);
////        Conversion
//        LocalDate zaciatok = LocalDate.of(1944,12,3);
//        LocalDateTime zaciatokDna = zaciatok.atStartOfDay(); // zaciatok dna nastaveny na 00:00
//        LocalDateTime danyZaciatok = zaciatok.atTime(10,0); // pripoji lubovolny cas
//        System.out.println(zaciatokDna);
//        System.out.println(danyZaciatok);
//
//        LocalDateTime datumCasPlus = LocalDateTime.now();
//        datumCasPlus = datumCasPlus.plusDays(3);    // plus 3 dni
//        System.out.println(datumCasPlus.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
//        System.out.println(datumCasPlus.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
//        System.out.println(datumCasPlus.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
//        System.out.println(datumCasPlus.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
//
//        // Period
//        LocalDateTime datumCasPeriod = LocalDateTime.now();
//        datumCasPeriod = datumCasPeriod.plus(Period.ofDays(3));
//        System.out.println(datumCas.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

//        // Duration
//        LocalTime casDuration = LocalTime.now();
//        casDuration = casDuration.plus(Duration.ofDays(1));
//        System.out.println(casDuration);
////
//        // ChronoUnit
//        LocalDateTime datumCasUnit = LocalDateTime.now();
//        datumCasUnit = datumCasUnit.plus(3, ChronoUnit.DAYS);
//        System.out.println(datumCasUnit.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
////
//        // Between
//        LocalDate zacatek = LocalDate.of(1939, 9, 1);
//        LocalDate konec = LocalDate.of(1945, 9, 2);
//        TemporalAmount doba = Period.between(zacatek, konec);
//        System.out.println("II. světová válka trvala " + doba.get(ChronoUnit.YEARS) + " let a " + doba.get(ChronoUnit.DAYS) + " dní");
//
//        // Until
//        LocalDate zaciatokUntil = LocalDate.of(2000,1,1);
//        LocalDate koniecUntil = LocalDate.of(2005,1,2);
//        // Doba medzi damumamy je
//        Period dobaUntil = Period.between(zaciatokUntil, koniecUntil);
//        System.out.println("doba medzi datumami, Roky : " + dobaUntil.get(ChronoUnit.YEARS) + " dni " + dobaUntil.get(ChronoUnit.DAYS)) ;

//        // With - nahradenie povodnej hodnoty
//        LocalDateTime casDatumWith = LocalDateTime.of(1939,12,12,2,12,12,12);
//        casDatumWith = casDatumWith.withHour(8);
//        System.out.println("with " + casDatumWith);
//
//        // Viac metod po sebe v jednom riadku
//        LocalDate casMethod = LocalDate.of(1923,12,12);
//        casMethod = casMethod.withMonth(10).withDayOfMonth(10);
//        System.out.println("with " + casMethod);

//        // Get on dates
//        LocalDate haloween = LocalDate.of(2016, Month.OCTOBER, 31);
//        System.out.println("Rok : " + haloween.getYear() + " Mesiac : " + haloween.getMonthValue() + " Den " + haloween.getDayOfMonth());

//        // Parse
//        LocalDateTime datumCasParse = LocalDateTime.parse("2016-12-08T10:20:30");
//        LocalDate datumParse = LocalDate.parse("2016-12-09");
//        LocalTime casParse = LocalTime.parse("12:12:12");
//        System.out.println(datumCasParse.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
//        System.out.println(datumParse.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
//        System.out.println(casParse.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

        //Selfmade parse
//        LocalDateTime datumCasSelfParse = LocalDateTime.parse("12/12/1212 12:12:12", DateTimeFormatter.ofPattern("M/d/y HH:mm:ss"));
//        LocalDate datumSelfParse = LocalDate.parse("12/12/1212", DateTimeFormatter.ofPattern("M/d/y"));
//        LocalTime casSelfParse = LocalTime.parse("12:12:12", DateTimeFormatter.ofPattern("H:m:ss"));
//
//        System.out.println(datumCasSelfParse.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
//        System.out.println(datumSelfParse.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
//        System.out.println(casSelfParse.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

//        //Porovnavanie is...vracia false/true
//        LocalDate halloween1 = LocalDate.of(2016, 10, 31);
//        LocalDate vanoce = LocalDate.of(2016, 12, 25);
//        System.out.println("Halloween po Vánocích: " + halloween1.isAfter(vanoce));
//        System.out.println("Halloween před Vánocemi: " + halloween1.isBefore(vanoce));
//        System.out.println("shodný Vánoce - Halloween: " + vanoce.isEqual(halloween1));
//        System.out.println("shodný Halloween - Halloween: " + halloween1.isEqual(halloween1));
//        System.out.println("přestupný rok 2016: " + halloween1.isLeapYear());
//        System.out.println("přestupný rok 2017: " + halloween1.withYear(2017).isLeapYear());
//        System.out.println("podporuje hodiny: " + halloween1.isSupported(ChronoUnit.HOURS));
//        System.out.println("podporuje roky: " + halloween1.isSupported(ChronoUnit.YEARS));

        // utc DATE
        Instant nyni = Instant.now();
        System.out.println(nyni);




    }




}
