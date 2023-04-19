package day05KStringManipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String a = "Bizim Takım Dün Gece Maçı Farklı Kazandı";
        String aUpper = a.toUpperCase();
        System.out.println("harfler büyük = " + aUpper);
        //harflerin hepsini büyütür
        String aLower = a.toLowerCase();
        System.out.println("harfler küçük = " + aLower);
        //harflerin hepsini küçültür
        char aFirst = a.charAt(0);
        System.out.println("First character = " + aFirst);
        //istediğimiz sıradaki karakteri alırız
        System.out.println("uzunluk = " + a.length());
        //Data'daki karakter sayısını belirler
        System.out.println("a.substring() = " + a.substring(0,7));
        //bunu sadece başlangıç noktasını belirleyerek (virgül koymadan) yaparsak
        //o kadar karakter geçecektir.Biz şuan aralık belirledik.
        //[0,4) burda 4.karakteri almaz
        System.out.println("a.substring() = " + a.substring(16,20));//Gece yi aldık
        System.out.println("a.substring(3) = " + a.substring(3));
        //a Stringinde bim kelimesinin olup olmadıgını kontrol ediniz
        System.out.println("a.contains(\"bim\") = " + a.contains("zim"));
        //icine girilen karakteri icerip icermedigini soyler
        System.out.println("a.isEmpty() = " + a.isEmpty());

        System.out.println("a.startsWith(\"B\") = " + a.startsWith("B"));
        // a Stringinin B harfiyle başlayıp başlamadıgını kontrol ettik
        // büyük küçük harf fark eder
        System.out.println("a.startsWith(\"Dün\",6) = " + a.startsWith("Dün", 12));
        //bu ilk 3 karakteri atar ondan sonraki için seçilen karakterle başladıysa true verir
        //Universite numaraları yıl+BölümKodu+GirişSırası kişinin hukuk okuyup okumadıgını
        //kontrol eden programı yap
        //sınıf 22 hukuk 33 pc 44 eczacılık 55 maliye 66
        String str = "20105501";
        System.out.println("hukuk bölümü okuyor mu = " + str.startsWith("33", 4));;


    }
}
