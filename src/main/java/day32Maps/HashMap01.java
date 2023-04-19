package day32Maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);
        //Key'i tekrarli kullandıgımızda value'yi en sonuncusu kabul eder.
        //Bu yöntem value güncellemede kullanılabilir(tavsiye edilmez).Buna "overwrite" denir.
        stdAges.put("Tom",83);

        //HashMap ler entry'leri rsatgele sıralar bu yuzden cok hızlı calısır
        //Map ler entry'leri sıralarken key'lere bakarak sıralama yapar.
        System.out.println(stdAges);

        //(önerilir)replace() methodu value'ları key'leri kullanarak uptade etmek icin kullanılır
        stdAges.replace("Ezel",39);
        System.out.println(stdAges);

        //Bu method map'in icinde angelina 57 varsa 57 yi 61 yapar.Yoksa ellemez.
        stdAges.replace("Angelina",57,61);
        System.out.println(stdAges);

        //Bu method map'de key olarak "Ali" yoksa Map'e "Ali=60"i ekler, yoksa eklemez.
        stdAges.putIfAbsent("Ali",60);

        //Varolan value icin aynı sonucları verir.
        System.out.println(stdAges.get("Tom"));
        System.out.println(stdAges.getOrDefault("Tom",0));

        //Map'de varolmayan deger girersek get() null, getOrDefault() ise
        //bizim sectigimiz default degeri(0) verir.
        System.out.println(stdAges.get("Ayse"));
        System.out.println(stdAges.getOrDefault("Ayse", 0));

        //Map'lerin icinde belirtilen vaule'nin olup olmadıgını kontrol eder.
        System.out.println(stdAges.containsValue(77));//true
        System.out.println(stdAges.containsValue(99));//false

        //Map'lerin icinde belirtilen key'in olup olmadıgını kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));//true

        //Key kullanarak "Entry"i silmeye yarar
        stdAges.remove("Ali");

        //Burda Map'te key ve value uyusuyorsa "entry"i siler.
        stdAges.remove("Tom",81);

        HashMap<String,Integer> kidsAge = new HashMap<>();

        kidsAge.put("John",12);
        kidsAge.put("Jim",22);
        kidsAge.put("Jack",32);

        //putAll() Method'u Bir map'i diger map'in icine koymaya yarar.
        //İlk Map degisir(stdAges)
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);
        System.out.println(kidsAge);
    }
}
