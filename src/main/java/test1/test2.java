package test1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen öğrenci sayısını giriniz");
        int ogrSayi;
        ogrSayi=input.nextInt();
        System.out.println("lütfen vize ve final notlarını giriniz");
        short Vize,Final;
        Vize=input.nextShort();
        Final=input.nextShort();
        System.out.print("Öğrencinin Ortalaması : ");
        System.out.println(ortHesap(Vize,Final));

    }
    public static double ortHesap(short Vize,short Final){
        double ort;
        ort=(Vize*0.4)+(Final*0.6);
        return ort;
    }
}
