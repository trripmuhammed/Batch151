package day17multidimensionalarraypassbyvalue;

import java.time.LocalDate;
import java.util.Scanner;
/*
1)java passbyvalue kullanır
2)yani java method ların orjinal degeri degistirmesine müsade etmez
3)java methodlara yolladıgı deger yollarken orijinal değerin kopyasını oluşturup yollar
method kopya deger üzerinde değişiklik yapar böylece orijinal değer korunur
4)java esnek bir dil'dir.İstersek yazdığımız kodla orijinal degeri degistirebiliriz.

 */
public class passbyvalue01 {//passbyvalue orijinal değerin korunmasına denir
    public static void main(String[] args) {
        int shirtPrice=200;
        Scanner input = new Scanner(System.in);
        String type= input.next();
        System.out.println(discount(type, shirtPrice));// main method static oldugundan discount method da static olmalı
        /*shirtPrice=discount("veteran",shirtPrice);
        istersek bunu yapıp orijinal değeri değiştirede biliriz
        */
        System.out.println(shirtPrice);
        LocalDate dogumGunuTarihi = LocalDate.of(2002,5,12);
    }
    //bir method static yapmak için acess modifer ile return type arasına static yazılmalı
    public static int discount(String type,int price) {
        switch(type) {
            case "student":
                price =price-20;
                break;
            case"veteran":
                price =price-40;
                break;
            case "senior":
                price =price-30;
                break;
            default:
                price = price;
        }
        return price;
    }
}
