package day33Maps;

import java.util.Hashtable;

/*
        "HashMap" ile "HashTable" arasındaki fark nedir?

        ***1)"HashMap" "thread-safe" degildir."HashTable" "thread-safe" dir.(Birçok işi aynanda yapabilme)
        "HashMap" "synchronized" degildir."HashTable" "synchronized" dir.(mantıklı sıralama yapmaktır.(once corbayı ocaga koy sonra salata yap))
        2)"HashMap" bir tane "null" key'e ve istedigimiz kadar "null" value ya musade eder.
          "HashTable" key'lerde de value'larda da "null" kullanılmasına musade etmez.
        3)"HashMap" hızlıdır."HashTable" "HaskMap" e gore yavastır.
        Note: "HashMap" ve "HashTable" ikiside entry'leri rastgele sıralar.
 */
public class HashTable01 {
    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges = new Hashtable<>();

        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
        //stdAges.put(null,85); ==> HashTable'ların key'lerine null konulamaz.
        //stdAges.put("Chris",null); ==> HashTable'ların value'larına da null konulamaz.

        System.out.println(stdAges);
    }
}
