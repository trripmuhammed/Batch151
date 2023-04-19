package day06KStringManipulation;

public class StringManipulation2 {
    public static void main(String[] args) {
        // ***************** replaceAll() ********************************
        /*
        replaceAll() bir grup datayı değiştirmek için kullanılır
        Bir grup data= Regular expression (Regex) kullanılır
        en cok kullanılan regexler:
        1)tüm rakamlar ==>[0-9]
        2)tüm kücük harfler ==>[a-z]
        3)tüm büyük harfler ==>[A-Z]
        4)tüm harfler ==>[a-zA-Z]
        5)tüm harfler ve rakamlar ==>[a-zA-Z0-9]
        6)tüm sesli harfler ==>[aeiouAEIOU]
        7)tüm noktolama işaretleri ==>  \\p{Punct}
        bu işaret hepsini olumsuz kullanmamızı sağlar (^) mesela rakamlar hariç
        örnek [^0-9] [^a-z] [^A-Z]] [^a-zA-Z] [^aeiouAEIOU] \\p{Punct}         */
        String s = "Mehmet 20 yasinda QA_Developer kursundan $ dolar kazanmistir...";
        // metindeki tüm rakamları * a çeviriniz
        String sReplaceAll1 = s.replaceAll("[0-9]","*");
        System.out.println(sReplaceAll1);
        // metindeki tüm rakam ve harfleri @ e çeviriniz
        String sReplaceAll2 = s.replaceAll("[a-zA-Z0-9]","@");
        System.out.println(sReplaceAll2);
        // metindeki space dışındaki karakterleri  + ya çeviriniz
        String sReplaceAll3 = s.replaceAll("[^ ]","+");
        System.out.println(sReplaceAll3);
        // metindeki küçük harfler dışındaki karakterleri  * ya çeviriniz
        String sReplaceAll4 = s.replaceAll("[^a-z]","*");
        System.out.println(sReplaceAll4);
        // metindeki sesli harfler dışındaki karakterleri  & ya çeviriniz
        String sReplaceAll5 = s.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(sReplaceAll5);

    }
}
