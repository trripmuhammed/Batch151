package day42Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();

        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistinctUpperInList(names));

        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));

        System.out.println(isLengthMoreThanTwo(names));

        System.out.println(isLengthLessThanThree(names));

        System.out.println(atLeastOneLengthLessThanFour(names));


    }


    //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir list'in icinde return ediniz.

    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){

        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).
                collect(Collectors.toList());//Normalde distinct elemanlari depolamak icin "Set" kullanilir
        //ama Lambda'daki collect(Collectors.toSet()) methodu elemanlari rastgele sirlar
        //halbıki bu soruda rastgele kabul edilmediginden mecburen toList() kullandik
    }

    //Example 2: List elemanlarini character sayilarina gore ters sirada'da kucuk harfle bir list'in icinde return ediniz.
    //Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun

    public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){

        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder())).
                collect(Collectors.toList());
    }

    //Example 3: List elemanlarinin tamaminin character sayisinin 2 den buyuk olup olmadigini kontrol eden methodu olusturunuz

    public static boolean isLengthMoreThanTwo(List<String> names){

        return names.stream().allMatch(t-> t.length()>2);
        //allMatch() parantez icine yazdigimiz kuralla tum elemanlarin uyusup uyusmadigini kontrol eder
        //uyuyorsa true dondurur.
    }

    //Example 3: List elemanlarinin tamaminin character sayisinin 3 den kucuk olmadigini kontrol eden methodu olusturunuz

    public static boolean isLengthLessThanThree(List<String> names){

        return names.stream().noneMatch(t-> t.length()<3);
        //noneMatch() allMatch() in tersidir.
    }

   //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz.

    public static boolean atLeastOneLengthLessThanFour(List<String> names){

        return names.stream().anyMatch(t-> t.length()<4);
        //anyMatch() herhangi biri sarti sagliyorsa true dondurur.
    }

}
