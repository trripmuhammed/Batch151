package day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        //String'i ters çevirmeye yarar
        sb1.reverse();//String'in ters çevrilmesi loop'lar ile de yapılır bu kısa bir yoldur
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//verilen index'deki karakteri siler
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7);// [4,7) " s " yi siler.Başlangıç index'inden(dahil) bitiş index'ine(dahil değil) kadar olan karakterleri siler
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5,"X");//[2,5) 2 dahil 5 hariç ==> index 2,3,4 deki characterler yerine x koyar
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3,"2023");//offset index degil karakter sayısı gibi offset kadar character geçildikten sonra istediğimizi yazdırır
        System.out.println(sb1);//ysX2023vaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1=sb2.compareTo(sb3);
        System.out.println(r1);//0==> 2 string alfabetik olarak aynı sırada
                               //Sonuc -3 ise sb1,sb2 den alfabetik olarak 3 önde demektir
                               //Sonuc 3 ise sb1,sb2 den alfabetik olarak 3 sonra demektir
        //StringBuilder'ı nasıl string'e çeviririz
        String str = sb2.toString().toUpperCase();
        System.out.println(str);

        //String nasıl StringBuilder'a çeviririz
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);


    }
}
