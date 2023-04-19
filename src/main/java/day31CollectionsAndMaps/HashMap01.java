package day31CollectionsAndMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map'lerde sozluklerdeki gibi kelime ve manası seklinde bir kullanım vardır
    "key" kısmı tekrarsız,"value" tekrarlı olabilir.
    Map'ler "key" ve "value" structure'ını kullanır.
    Map'lerdeki elemanlara "Entry" denir
    Elemanlarn tamamına ise Entry ler tekrarsız olduklarından "EntrySet" denir
    "Key" ve "value" lar ayrı data type'larında olabilirler.

    HashMap'ler "Entry" leri rastgele sıralar.Bu yüzden en hızlı Maptir.
    HashMap'ler Collections degildir.Farklı bir yapıdır.
 */
public class HashMap01 {
    public static void main(String[] args) {

        //Map nasıl olusturulur
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map'e Entry nasıl eklenir
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",18000000);

        System.out.println(countryPopulation);

        //get method "Key" ile calısır ve "Value" kısmını verir.
        int usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation);

        //Bütün "Key" leri nasıl alırız
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);

        //Butun "Value" ları nasıl alırız
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);


        //Example 1 : countryPopulation mapindeki ulkelerin nufuslarının ortalaması kactır
        int sum=0;
        for(Integer w : values){
            sum+=w;
        }
        System.out.println(sum/values.size());//ortalama nufus

        //entrySet() "entry"leri kalıp halinde alıp bize "Set"in icine koyarak verir
        //loop'lar map'Ler ile kullanılamaz.Sadece entry'ler arasubda gezmek istedigimizde loop kullanabiliriz.

        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();

        System.out.println(entries);

        //Example 2 : countryPopulation Map'indeki ulkelerin isimlerinin character sayısı ile nufuslarının toplamını bulunuz
        int toplam=0;

        for(Map.Entry<String,Integer> w : entries){

            toplam+=w.getKey().length()+ w.getValue();

        }
        System.out.println(toplam);
    }
}
