package WebBrowser;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MallDateTime {

    public DateTimeFormatter DateTimeFormat(String format){
        DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern(format);
        return dtf1;
    }
    public LocalDateTime TimeLocation(String location){
        LocalDateTime localDate = LocalDateTime.now(ZoneId.of(location));
        return localDate;
    }
    public LocalDateTime addDiscount(int year, int day, int month, int hour, int minute){

        LocalDateTime discountDate = LocalDateTime.of(month,day,year,hour,minute);
        return discountDate;
    }
    public void addDiscount(int year,int day,int month,int hour,int minute,int second){
        LocalDateTime discountDate = LocalDateTime.of(month,day,year,hour,minute,second);
    }

}
