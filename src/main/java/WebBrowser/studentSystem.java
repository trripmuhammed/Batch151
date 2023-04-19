package WebBrowser;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class studentSystem {
    public static void StudentEnter() {
        System.out.println("Öğrenci sistemine hoş geldiniz\n Lütfen ilk adınızı ve şifrenizi giriniz(boşluk içermesin)");
        Scanner input = new Scanner(System.in);
        do{
            String name = input.next();
            String nameTrim=name.trim();
            boolean nameCharcterControl= nameTrim.replaceAll("[a-zA-Z]","").length()>0;//dogru olması için fasle vermeki
            if(nameCharcterControl==true){
                System.out.println("İsminizde harf harici karakter olamaz.Lütfen tekrar deneyin");
                continue;
            }String password= input.next();
            boolean passwordCharcterControl1= password.replaceAll("[^a-z]","").length()>0;
            boolean passwordCharcterControl2= password.replaceAll("[^A-Z]","").length()>0;
            boolean passwordCharcterControl3= password.replaceAll("[^0-9]","").length()>0;
            boolean passwordCharcterControl4= password.replaceAll("^\\P{P}","").length()>0;
            if((passwordCharcterControl1 && passwordCharcterControl2 && passwordCharcterControl3 && passwordCharcterControl4)){
                System.out.println("Sisteme hoş geldiniz");
                break;
            }else{
                System.out.println("Yanlış şifre,Lütfen adınızdan başlayarak tekrar deneyiniz.");
            }
    }while(true);
    }
    public static void StudentProcess(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hiçbir öğrenci kaydı olmadığını görüyoruz.Öğrenci kayıda yönlendiriliyorsunuz\n lütfen kaç öğrenci oldugunu giriniz");
        short numOfStudent=input.nextByte();
        String names[]=new String[numOfStudent];
        String namesAndNumbers[][]= new String[numOfStudent][2];
        System.out.println("Lütfen öğrenci isimlerini sırasıyla giriniz");
        int i=0;
        for(String w : names){
            w=input.next();
            namesAndNumbers[i][0]=w;
            String a= "2000"+"459"+"00"+(i+1);
            if(i>=10){
                a="0"+i+1;
            }
            namesAndNumbers[i][1]=a;
            i++;
        }
        System.out.println("Öğrenci listeniz şudur\n"+Arrays.deepToString(namesAndNumbers));
    }
}
