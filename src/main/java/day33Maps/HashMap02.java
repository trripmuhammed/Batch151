package day33Maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //HashMap arkasında calısan mekanizma nasıl calısır?

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("USA", "Washington");

        capitals.get("USA");

        capitals.put("Italy", "Roma");

        capitals.put("Turkiye", "Ankara");

        capitals.put("Turkiye", "Izmir");

        /*
        Java 16 tane bucket(kutu) olusturur 0 dan baslarak bunları indexler
        daha sonra Java her Map'in icine ekledigimiz her key icin HashCode olusturur
        Bu sayıların 16 ya bolumunden kalanı alır ve kalan ne ise ona gore o index'deki
        kutuya key'i value'yi ve HashCode'u koyar ve gerektiginde ordan alır.
        1 kutuya 1 den fazla entry koyulabilir.Ama onunda sınırı vardır.
        Eger bucket'ın ici cok dolarsa Java yeni bir 16'lık uretir.Bundan sonra
        HashCode'lar 32 ye bolunur.Eger yeni 16'lık olusturmasaydı.Islem yavaslardı
        Cunku LinkedList kullanıyor.
         */
    }
}
