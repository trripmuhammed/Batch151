package day08KStringManipulation;

import java.util.Scanner;

public class StringManipulation1 {
    public static void main(String[] args) {
        /*kullanıcıdan mail alın kurallar:
        1)@gmail icermeli
        2)space olmamalı
        3)buyuk harf olmicak
        4)noktalama harfi olcak
         */
        System.out.println("Lütfen mailinizi giriniz");
        System.out.print("Mail: ");
        Scanner input = new Scanner(System.in);
        String mail = input.next();
        boolean mailControl1 = mail.contains("@gmail");
        boolean mailControl2 = !mail.contains(" ");
        boolean mailControl3 = mail.replaceAll("[^A-Z]","").length()>0;
        boolean mailControl4 = mail.replaceAll("^\\P{P}","").length()>0;
        boolean mailControl4way2 = mail.replaceAll("[a-zA-Z0-9]","").replaceAll("[\\p{Punct}]","").replaceAll(" ","").length()>0;
        //way2 düzgün çalışmadı
        System.out.println(mailControl4); // noktalama kontrol edici
        if(mailControl1 && mailControl2 && mailControl3 && mailControl4way2){
            System.out.println("Başarılı");
        }
        else{
            System.out.println("Hatalı");
        }

    }
}
