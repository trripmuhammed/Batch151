package day39Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElement(myList);

        System.out.println();

        printElement(myList);

        System.out.println();

        printElExceptStartsWithT(myList);

        System.out.println();

        printElLenghtLessThanFour(myList);

        System.out.println();

        printElLengthMoreThanFourWithUpper(myList);

        System.out.println();

        printElLengthMoreThanFourUniqueLowerCase(myList);

        System.out.println();

        printElUniqueToUpperCaseSorted(myList);

        System.out.println();

        printElUniqueLowerCaseSortWithLength(myList);



    }
    //Example 1: Bir List'deki elemanlari console'a yazdiran methodu olusturunuz.

    //1. Yol:
    public static void printElement(List<String> myList){

        for( String w : myList){
            System.out.print(w + " ");
        }
        //Bu yapısal programlamadir.

    }

    //2. Yol:
    public static void printEl(List<String> myList){

        myList.stream().forEach(t -> System.out.print(t + " "));
        //Burdaki t forEach deki w yi temsil ediyor.
        //Lambda fonksiyenel programlama dir.
    }

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printElExceptStartsWithT(List<String> myList){

        myList.stream().filter(t -> !t.startsWith("T")).forEach(t -> System.out.print(t + " "));
        //filter veriable elemesi yapar.
    }

    //Example 3: Bir List'te karakter sayisi 4 den az olan tum elemanlari consola yazdiran method'u olusturunuz.

    public static void printElLenghtLessThanFour(List<String> myList){

        myList.stream().filter(t -> t.length()<4).forEach(t -> System.out.print(t + " "));
    }

    //Example 4: Bir List'teki karakter sayisi 4 den cok olan tum elemanlari buyuk harflerle consola yazdiran methodu olusturunuz.

    public static void printElLengthMoreThanFourWithUpper(List<String> myList){

        myList.stream().filter(t -> t.length()>4).map(t -> t.toUpperCase()).forEach(t -> System.out.print(t + " "));
        //map() varolan methodu degistirir.
    }

    //Example 5: Bir List'teki karakter sayisi 4 den cok olan tum elemanlari tekrarsız olarak kucuk harflerle consola yazdiran methodu olusturunuz.

    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){

        myList.stream().
                distinct().
                filter(t -> t.length()>4).
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " "));
        //distinct tekrarli elemanlari tekrarsiz yapar(sadece birini alir).
        //filter'in ici bazen cok dolu olabildiginden distinct'i once kullandik
        //map'i ise once kullanmayiz cunku silecegimiz veriyi degistirmenin mantigi yok.
        //oncelik genelde elemanlari azaltanlardadir.
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak büyük harflerle alfabetik olarak consola yazdiran method'u olusturunuz

    public static void printElUniqueToUpperCaseSorted(List<String> myList){

        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarına gore kucukten buyuge consola yazdiran method'u olusturunuz

    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){

        myList.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));
        //sorted() siralama demektir.Default(Natural) siralama ascii degerine gore dir.(String => A-Z Integer => 1-999...)
        //tersten siralama reverse order dir.
        //Comparator karsılastır demektir.Biz burda length yerine bir cok sey(method) kullanabiliriz.
        //kullandıgımız method'a gore neye gore sıraladıgını belirleriz.
    }
}
