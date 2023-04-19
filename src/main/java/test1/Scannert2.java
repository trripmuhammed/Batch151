package test1;

import java.util.Scanner;

public class Scannert2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // sayının ilk ve son rakamlarının toplamını yazdıran program
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz");
        // % ==> Moduls operatörü sayının bölümünden kalan sayıyı verir
        int sayi = input.nextInt();
        int ilkRakam=sayi/1000;
        int sonRakam=sayi%10;
        System.out.println(ilkRakam);
        System.out.println(sonRakam);
        System.out.println("IlkRakam + SonRakam =" + (ilkRakam+sonRakam));
        // eger toplamayı paranteze almasaydık ordaki + onları sadece bitişik yazdırırdı.
        //oncesinde String kullandıgımız için

    }
}
