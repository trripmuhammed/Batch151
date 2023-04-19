package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Please enter an integer");
            int n=input.nextInt();
            if(n<100){
                System.out.println("Won");
            }else{
                System.out.println("Lost");
                break;
            }
        }while(true); // do nun mantıgı once calısır sonra while a bakar
        //do en az 1 kere çalışır
    //kullanıcıdan alınan cümlenin büyük harfle başlayıp "." ile bittiğini kontrol eden kodu yazınız

        do{
            System.out.println("Please enter a word");
            String s = input.next();
            if(s.endsWith(".") && (s.charAt(0)>='a' && s.charAt(0)<='z')){
                System.out.println("Your sentence is correct grammatically");
            }else{
                System.out.println("Your sentence has grammatically mistake");
                break;
            }
        }while(true);
    }
}
