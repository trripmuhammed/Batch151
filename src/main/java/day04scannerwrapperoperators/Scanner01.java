package day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz");
        int number = input.nextInt();
        int digit5 = number%10;
        int digit4 = number/10000;
        int digit2 = (number/1000)-((number/10000)*10);
        int digit1 = ((number%100)-(number%10))/10;
        System.out.println("number1 = " + digit1);
        System.out.println("number2 = " + digit2);
        System.out.println("number4 = " + digit4);
        System.out.println("number5 = " + digit5);
        /*
        Bu matematiksel işlemlerle uğraşmak istemiyorsak sürekli ana sayıyı
        10 a bölüp son rakamıda alaiblir
        örn ilkSayi=number%10 ==> number/10 ==> ikinciSayi=nuber%10
         */
    }
}
