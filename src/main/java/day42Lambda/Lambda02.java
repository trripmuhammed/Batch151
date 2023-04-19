package day42Lambda;

import day41Lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Lambda02 {

    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(7,10));

        System.out.println(getSumInTheGivenRang(7,10));

        System.out.println(getSumOfDigitsInTheGivenRange(45,47));
    }

    //Swap icin bir tane private method olustur
    //tekrarlanan ve Utils de kullanilacak kadar tekrarlanmayan method'lar icin
    //boyle method'lar olusturulur.Utils'i copluk yapmamamiz gerekir.
    private static List<Integer> swap(int starting,int ending){
        List<Integer> list = new ArrayList<>();
        if(starting>ending){
            starting+= ending;
            ending = starting - ending;
            starting-= ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    //Example 1: 7 den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz.
    public static int  getSumInTheGivenRange(int starting,int ending){
        List<Integer> list = swap(starting,ending);
        //eger starting buyukse rangeClosed() calismaz ve "0" verir.
        return IntStream.rangeClosed(list.get(0), list.get(1)).sum();
        //rangeClosed() ile range() farki ilk'i son sayiyi'da aliyor
    }

    //Example 2: 7 den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.
    public static int  getSumInTheGivenRang(int starting,int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 3: 45 ten 47'e kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.

    public static int getSumOfDigitsInTheGivenRange(int starting,int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).map(Utils::getSumOfDigits).sum();
    }

}
