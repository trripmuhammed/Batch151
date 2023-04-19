package day20ArrayListDayTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //içimizde bulundugumuz zaman dilimindeki tarihi alma
        LocalDate myCurrentDate=LocalDate.now();
        System.out.println(myCurrentDate);//2023.03.15
        //tarihten istediğimiz bileşeni nasıl alırız ?
        int monthValue=myCurrentDate.getMonthValue();
        System.out.println(monthValue);

        int yearValue= myCurrentDate.getYear();
        System.out.println(yearValue);

        int dayValue= myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);

        //Aşağıdaki month bir Enum'dır
        //Enum Java'da sabit değerleri(Ay isimleri,Gün isimleri,Şehirler,Gezegen isimleri) depolamak için kullanılır
        //depolamak için kullanılır
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);

        //Aşağıdaki "DayOfWeek" bir Enum'dir
        DayOfWeek dayName=myCurrentDate.getDayOfWeek();
        System.out.println(dayName);

        //İleriki tarihe nasıl gidilir
        System.out.println(myCurrentDate.plusDays(5)
                .plusMonths(2)
                .plusYears(4));//2027.05.20

        //Geçmiş tarihe nasıl gidilir
        System.out.println(myCurrentDate.minusYears(30)
                .minusMonths(2)
                .minusDays(18));

        //Specific bir tarih objesi nasıl oluşturulur
        LocalDate gokhanDob=LocalDate.of(1986,6,10);
        LocalDate fatihDob=LocalDate.of(1985,2,25);

        //Bir tarihin bir tarih'ten sonra olup olmadığı nasıl kontrol edilir
        boolean r1=gokhanDob.isAfter(fatihDob);
        System.out.println(r1);

        //Bir tarihin bir tarih'ten önce olup olmadığı nasıl kontrol edilir
        boolean r2=fatihDob.isBefore(gokhanDob);
        System.out.println(r2);

        //Bir tarihin bir tarih'e eşit olup olmadığı nasıl kontrol edilir
        boolean r3=gokhanDob.isEqual(fatihDob);
        System.out.println(r3);

        //Example 1: Kullanıcıdan aldığınız tarih geçmişe ait ise "Geçersiz tarih girdiniz" mesajı veriniz.
        //Kullanıcıdan aldığınız tarih geleceğe ait ise "zamani girebilirsiniz" deyiniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year,month and day numbers in order");
        int year =input.nextInt();
        int month= input.nextInt();
        int day = input.nextInt();
        DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyy-MM-dd-hh-mm");

        LocalDate givenDate = LocalDate.of(year,month,day);
        if(givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " Invalid date");
        }else{
            System.out.println("You can enter the time for ticket");
        }

        int lengthOfMonth=myCurrentDate.lengthOfMonth();
        System.out.println(lengthOfMonth);

        //Example 2: Kullanıcının girdiği tarihin gün ismini bulan kodu yazınız
        System.out.println("Please enter year,month and day numbers in order");
        int y =input.nextInt();
        int m= input.nextInt();
        int d = input.nextInt();
        LocalDate date = LocalDate.of(year,month,day);

        System.out.println(date.getDayOfWeek());
    }
}
