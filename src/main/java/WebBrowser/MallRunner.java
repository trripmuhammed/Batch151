package WebBrowser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MallRunner {
    public static void main(String[] args) {
        System.out.println("Please enter the location of your place\nlike this Asia/Tokyo");
        Scanner input = new Scanner(System.in);
        MallDateTime user1 = new MallDateTime();
        LocalDateTime time=user1.TimeLocation(input.next());
        System.out.println("Please set your time style\nwe have rules for this");
        System.out.println("Month=MMMM(Full name),MMM(short name),MM(number of Month) | Day=dd | Year=yy(short year),yyyy(long year) | Hour=HH(24 hour system),hh(12 hour system) | Minute=mm | Second=ss | a=AM,PM(for 12 hour system)");
        DateTimeFormatter timeFormat=user1.DateTimeFormat(input.next());
        String formattedTime = timeFormat.format(time);
        System.out.println(formattedTime);
        System.out.println("Please enter the discount time");
        LocalDateTime a1=user1.addDiscount(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println(a1);
        System.out.println(formattedTime);
        System.out.println(time);
    }
}
