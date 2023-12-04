package Java8;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {

        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime=LocalDateTime.now();
        System.out.println(datetime);

        LocalDate of=LocalDate.of(2028,05,5);
        System.out.println(of.isLeapYear());
        LocalDate of1=LocalDate.of(1990, Month.JANUARY,5);
        System.out.println(of1.atTime(LocalTime.now()));

        String anotherDate = "07-15-2023";
        LocalDate parse3 = LocalDate.parse(anotherDate, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println(parse3);

        String dob="01-01-1999";
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dt=LocalDate.parse(dob,format);
        System.out.println(dt);
      //  System.out.println(dob);
        System.out.println("dd-MMM-yy :" + dt.format(DateTimeFormatter.ofPattern("dd-MMM-yy")));
        String d=dt.format(DateTimeFormatter.ofPattern("MM-yyyy-dd"));
        System.out.println(d);

        LocalDate dat = LocalDate.ofEpochDay(123456789);
        System.out.println(dat);



    }
}
