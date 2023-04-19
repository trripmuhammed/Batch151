package day30Condactioan;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    /*
        1)Set'ler tekrarsız eleman(unique) depolamak icin kullanılır.
        2)3 tane Set Class vardır:
            1)HashSet Class:
                     "Hash" Benzersiz Id olusturma teknigidir.Bu teknige "Hashing Tecnic" denir
                     "HashSet" elemanları rastgele sıralar.
                     "HashSet" elemanları rastgele sıraladıgından cok hızlı calısır.
                     "HashSet"ler "null" ı eleman olarak kabul eder.
                     "HashSet"ler tekrarsız eleman demekamak icindir.

            2)LinkedHashSet Class:
                     "LinkedHashSet"ler elemanları sizin siraya göre dizdiklerinden(insertion order) "Hashset" lere göre yavastırlar
                     "LinkedHashSet"ler tekrarsız eleman depolamak icindir.

            3)TreeSet Class:
                     "TreeSet"ler elemanları natural order'a gore dizerler.
                     "TreeSet"ler elemanları natural order'a gore diztiktirlerinden coook yavastırlar.
                     "HashSet"lere gore yavastırlar.
                      En yavas set "TreeSet" tir.
       3)TreeSet cok yavas oldugundan mumkun oldugu kadar kullanmamaya calısırız.
     */
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Ajda");
        hs.add("Cüneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cüneyt");//tekrarlı eleman ekledigimizde hata vermez ancak elemanı sadece 1 kere ekler
        hs.add(null);//hep en basa koyar
        hs.add(null);

        System.out.println(hs);

        System.out.println(hs.hashCode());//Java her hash icin tekrarsiz bir Id belirler

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);//Burda null'ın sırasını biz belirleriz
        lhs.add(null);
        System.out.println(lhs);

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls);

        lhs.retainAll(ls);//ilk LinkedHashSet'teki farkli elemanlar silindi.
        System.out.println(lhs);
        System.out.println(ls);

        TreeSet<Character>  ts = new TreeSet<>();

        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
    //  ts.add(null); TreeSet'lere null eklenemez.
        System.out.println(ts);

        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.lower('R'));//verilen eleman "R" den onceki data'yi verir
        System.out.println(ts.lower('B'));//Var olmayan elemanlar icinde kullanılabilir.
        System.out.println(ts.lower('A'));//olmadıgından null verir.
        System.out.println(ts.higher('K'));//Verilen 'K' dan sonraki elemani verir

        System.out.println(ts.headSet('R'));//verdigimiz eleman 'R' den onceki elemanları verir.
        //parantez ici 'R' dahil degildir.
        System.out.println(ts.headSet('G', true));//Burda girdigmiz eleman
        //G yi de dahil eder. inclusive == ingilizce dahil demektir.True yaparak bunu acarız.


        System.out.println(ts.tailSet('G'));//verdigimiz eleman 'G' den sonraki elemanları verir.
        //parantez ici 'G' dahildir.
        System.out.println(ts.tailSet('G', false));//Burda normalde 'G' yi dahil ediyordu
        //Biz burda "false" yaparak 'G' nin dahil olmasını kapattık.

        System.out.println(ts.ceiling('R'));//R verir.Eleman set'in icinde varsa elemanının kendisi return eder.
        System.out.println(ts.ceiling('K'));//R verir.Eleman set'in icinde yoksa alfabetik sirada sonraki eleman return eder.

        System.out.println(ts.floor('G'));//G verir.Eleman set'in icinde varsa elemanının kendisi return eder.
        System.out.println(ts.floor('J'));//G verir.Eleman set'in icinde yoksa alfabetik sirada sonraki eleman return eder.

        System.out.println(ts.subSet('G', 'Z'));//G,R,U verir.İlk parametre dahil,ikinci haric.[) olarak calısır
        System.out.println(ts.subSet('G', false, 'Z', true));//R,U,Z


    }
}
