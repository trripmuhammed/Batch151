package day21DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("M/dd/yyyy - hh:mm a");
        String formattedLdt=dtf1.format(ldt);
        System.out.println(formattedLdt);
    }

}
