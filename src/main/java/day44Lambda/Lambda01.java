package day44Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz
        Files.
                lines(Paths.get("src/main/java/day44Lambda/myTextFile.txt")).
                forEach(System.out::println);

        //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz
        Files.
                lines(Paths.get("src/main/java/day44Lambda/myTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //Example 3: Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigin kontrol eden kodu yaziniz
        boolean r1 = Files.lines(Paths.get("src/main/java/day44Lambda/myTextFile.txt")).anyMatch(t-> t.contains("Java"));
        System.out.println(r1);

        //Example 4: Verilen text file icindeki text'kerde kullanilan farkli kelimeleri bir List icinde return ediniz.
        List<String> words = Files.lines(Paths.get("src/main/java/day44Lambda/myTextFile.txt")).
                map(t-> t.replaceAll("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream).//split kullandıgımdan array yapisina dondu bu kodla birlikte kelimleri kullanmaya geri donduk
                //Yani array'leri stream'e donusturdu
                distinct().
                collect(Collectors.toList());
        System.out.println(words);

        //Example 5: Verilen text file icindeki text'de toplam kaç harf kullanildigini return eden kodu yaziniz.
        long numOfLetters = Files.
                lines(Paths.get("src/main/java/day44Lambda/myTextFile.txt")).
                map(t-> t.replaceAll("[^a-zA-Z]","").
                split("")).
                flatMap(Arrays::stream).
                count();//Burdaki data sayisi verir.Bundan sonra baska method kullanılamaz.
        System.out.println(numOfLetters);

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sırada bir list'in icinde return eden kodu yaziniz
        List<String> letters = Files.
                lines(Paths.get("src/main/java/day44Lambda/myTextFile.txt")).
                map(t-> t.replaceAll("[^a-zA-Z]","").
                split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.println(letters);

    }

}
