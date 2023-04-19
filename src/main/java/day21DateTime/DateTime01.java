package day21DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //anlık zamanı nasıl alırız
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);
        //anlık zamanda bileşenler nasıl alınır
        int hour= myCurrentTime.getHour();
        System.out.println(hour);

        int minute= myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nano= myCurrentTime.getNano();
        System.out.println(nano);

        //gelecek ve gecmis zamana nasıl gidilir
        LocalTime next=myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        //Zaman formatı nasıl değiştirilir
        //"HH" 24'luk saat sistemini, "hh" 12'lik saat sistemini kullanır
        // "hh.mm a" 12 lik saat sisteminde "AM","PM" yazılmasını sağlar
        //"ss" saniyeyi gösterir
        //"mm" "minut" demektir.Eğer M kullansaydım buda "MM" month demektir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh.mm a");
        String formattedMyCurrentTime=dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formatı nasıl değiştirilir
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);

        //Tarihi ay/gün/yıl şekline çeviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate1=dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate1);

        //Tarihi gün/ay isminin ilk 3 harfi/yıl şekline çeviriniz
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2=dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);

        //Tarihi Gün/Ay ismi/Yıl sekline ceviriniz
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yy");
        String formattedMyCurrentDate3=dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);

        //Başka bir zaman dilimindeki tarih ve zamanı nasıl alırız

        //Tokyo'da ayın kaçı
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalDate dateInTashkent=LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);

        //Tokyo'da ayın kaçı
        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //Koln'de saat kaç
        LocalTime timeInBerlin= LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);


    }
}
