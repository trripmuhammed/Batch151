package day33Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
        1)"TreeMap" "thread-safe" ve "synchronized" degeildir.
        Note: Map'lerde "multi-thread" kullanmamız gerektiginde sadece "HashTable" kullanabiliriz.
        2)TreeMap ler value'larda null kullanımına musade eder, key'lerde etmez.
        3)TreeMap entry'leri key'lerine gore natural order'a gore sıraya koyar, bu yuzden cook yavastır.
     */

    public static void main(String[] args) {

        long time1 = System.nanoTime();

        TreeMap<String, Integer> countryPopulations = new TreeMap<>();

        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherlands",18000000);
        countryPopulations.put("Turkiye",83000000);
        countryPopulations.put("Belgium",13000000);
        countryPopulations.put("Mexico",71000000);
        countryPopulations.put("Brasil",215000000);
        countryPopulations.put("France",75000000);
        countryPopulations.put("Finland",8000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Madagaskar",30000000);
        System.out.println(countryPopulations);

        long time2 = System.nanoTime();

        HashMap<String, Integer> countryPop = new HashMap<>();

        countryPop.put("USA",400000000);
        countryPop.put("Netherlands",18000000);
        countryPop.put("Turkiye",83000000);
        countryPop.put("Belgium",13000000);
        countryPop.put("Mexico",71000000);
        countryPop.put("Brasil",215000000);
        countryPop.put("France",75000000);
        countryPop.put("Finland",8000000);
        countryPop.put("Germany",85000000);
        countryPop.put("Madagaskar",30000000);

        TreeMap<String, Integer> countryPop2 = new TreeMap<>(countryPop);

        System.out.println(countryPop2);

        long time3 = System.nanoTime();

        System.out.println(time2 - time1);
        System.out.println(time3 - time2);
    }
}
