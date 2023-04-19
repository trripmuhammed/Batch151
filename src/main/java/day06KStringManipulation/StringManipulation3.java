package day06KStringManipulation;

import java.util.Scanner;

public class StringManipulation3 {
    public static void main(String[] args) {
        /*
        Aşağıdaki kurallar göre kullanıcının girdigi password u kontrol ediniz
        1)en az 8 karakter
        2)space icermesin
        3)enaz 1 tane buyuk
        4)enaz 1 tane kucuk
        5)en az 1 tane sembol
        6)en az 1 tane rakam
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen password ünüzü giriniz");
        System.out.println("1)en az 8 karakter\n" +"2)space icermesin\n" + "3)enaz 1 tane buyuk\n" + "4)enaz 1 tane kucuk\n" + "5)en az 1 tane sembol\n" + "6)en az 1 tane rakam");
        System.out.print("Şifre : ");
        String password = input.next();
        boolean first = password.length()>7;;
        //password.length()>=8 (bu daha yavaş)
        boolean second = !password.contains(" ");
        boolean third = password.replaceAll("[^A-Z]","").length()>0;
        boolean fourth = password.replaceAll("[^a-z]","").length()>0;
        boolean fifth = password.replaceAll("[a-zA-Z0-9]","").length()>0;
        boolean sixth = password.replaceAll("[^0-9]","").length()>0;
        // System.out.println("değerlerimiz = " + first +"\t"+ second +"\t"+ third +"\t"+ fourth+"\t" + fifth+"\t" + sixth);
        if(first && second && third && fourth && fifth && sixth){
            System.out.println("Başarılı");
        }
        else{
            System.out.println("Bu şifreyi kullanamassınız tekrar deneyin");
        }
        //methodları aynı satırda yanyana yazmaya method chain (method zinciri) denir.

    }
}
