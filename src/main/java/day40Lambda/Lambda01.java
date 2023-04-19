package day40Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> states = new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne","Izmir"));

        func1(states);

        System.out.println();

        func2(states);

        System.out.println();

        func3(states);

        System.out.println();

        System.out.println(func4(states));


        System.out.println(func5(states));







    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void func1(List<String> myList){

        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t +" "));
    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void func2(List<String> myList){

        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()).//Lambda Expression
                sorted(Comparator.comparing(t -> t.substring(t.length()-1))).//Lambda Expression
                forEach(t -> System.out.print(t +" "));
    }           //substring yerine charAt de kullanilabilir.


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void func3(List<String> myList){

        myList.
                stream().
                distinct().
                map(String :: toUpperCase).//method references
                sorted(Comparator.comparing(String :: length).thenComparing(Comparator.naturalOrder())).//method references
                forEach(System.out::println);//method references
        //t -> t.toUpperCase == Lambda Expressions demektir.
        //String::toUpperCase == Method Reference demektir.(Önerilir,Her zaman olmayabilir.)
        //Bu yapıda hangi Class'dan geldigini :: ve method ismi yazilir

    }

    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

    public static List<String> func4(List<String> myList){

        myList.
                removeIf(t -> t.length()>5);
        return myList;
    }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz

    public static List<String> func5(List<String> myList){

        myList.removeIf(t -> t.startsWith("H") || t.endsWith("r"));
        return myList;
    }

    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin

        public static void func6(List<String> myList){


        }


    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static void func7(List<String> myList){


    }
}
