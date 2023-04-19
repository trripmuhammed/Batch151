package day06KStringManipulation;

public class StringManipulation1 {
    public static void main(String[] args) {
        String s = "Learn java earn money";
        boolean sContain = s.contains("money");
        System.out.println(sContain);
        boolean sEnd = s.endsWith("money");
        System.out.println(sEnd);
        // s stringindeki money kelimesi ile dollar kelimesiyle yer değiştirelim
        String sReplace = s.replace("money","dollar");
        //ilk giriğinizin yerine ikinciyi koyar
        System.out.println(sReplace);
        String sReplace2 = s.replace("earn","win");
        System.out.println(sReplace2);
        //earn bitişik olduğu için Learn yazısı da değişti
        String sReplace3 = s.replace('a','*');
        System.out.println(sReplace3);
        //Değiştirmek istediğimiz "a" yı (String'i) karakter olan '*' a (char'a) dönüştüremeyiz
        String sReplace4 = s.replace("L","***");
        // tek tırnak (') daha mantıklı çünkü daha az yer kaplar ve daha hızlı çalışır
        System.out.println(sReplace4);
        String sReplace5 = s.replace("e","");
        //karakter silmek istiyorsak çift tırnak kullanırız("") içinde space dahi olmamalı
        System.out.println(sReplace5);
        String sReplace6 = s.replace("earn","");
        System.out.println(sReplace6);
        String s2 = "Dolma Kalem";
        String s2Replace = s2.replace("Kalem","Biber");
        System.out.println(s2Replace);


    }
}
