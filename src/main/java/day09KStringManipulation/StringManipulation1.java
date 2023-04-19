package day09KStringManipulation;

public class StringManipulation1 {
    public static void main(String[] args) {
        //Bir String data nın space haric karakter icerip icermedigini bulun
        String t = "  ";
        boolean result1 = t.replace(" ","").isEmpty();
        System.out.println(result1);
        //2.yol
        boolean result2 = t.isBlank();
        System.out.println(result2);
        //bu boşlukları saymıyor
        //3.yol length ile de yapılabilir
        // bir string de a,i,e karakterlerini ilk görünümünün indexleri toplamını ekrana yazdırınız
        String s = "java is easy to learn";
        int aIdx = s.indexOf('a');
        System.out.println("a nın indexi = " + aIdx);
        //diger indexler içinde aynısı olcak
        String s2 = "java is easy to learn to easy to";
        int idx = s.indexOf("to");
        //ilk gördüğü datanın ilk gördüğü karakterinin indexini verir
        System.out.println(idx);
        int pIdx = s.indexOf("p");
        System.out.println(pIdx);
        //olmayan karakter varsa -1 verir
        int iIdx = s.indexOf("i");
        System.out.println(iIdx);
        int aLastIdx = s2.lastIndexOf('a');
        System.out.println(aLastIdx);
        //sondan başlayıp ilk cümleye gitti


    }
}
