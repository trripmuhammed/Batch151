package day12practice;

public class basamaklaraAyirma {
    public static void main(String[] args) {
        //12345 sayısının rakamları toplamı
        int sayi=12345;
        int birler = sayi%10;
        int onlar = (sayi/10)%10;
        int yüzler = (sayi/100)%10;
        int binler = (sayi/1000)%10;
        int onbinler = (sayi/10000)%10;
        System.out.println(birler+onlar+yüzler+binler+onbinler);
    }
}
