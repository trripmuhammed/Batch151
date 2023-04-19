package day12switchincrementdecrementloops;

import java.util.Scanner;

//kullanıcıdan alınan karakterin sesli harf olup olmadıgını kontrol eden kodu yazınız.
//a e i a u(UTF-8 İngiliz alfabesi)
public class switch02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the letter");
        //1.yol
        char letter= input.next().charAt(0);
        switch(letter) {
//            case 'a','e','i','o','u': (buda yapılabilir)
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                //char kullandıgımız için toLowerCase methodunu kullanamıyoruz
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter+" is a vowel");
                break;
            default:
                System.out.println(letter+" is not a vowel");
        }
        //2.yol
        System.out.println("Please enter the letter");
        String letter2 = input.next().substring(0,1).toLowerCase();

        switch(letter2) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letter2+" is a vowel");
                break;
            default:
                System.out.println(letter2+" is not a vowel");
        }
        //3.yol
        System.out.println("Please enter the letter");
        String letter3 = input.next().substring(0,1);

        switch(letter3) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(letter3+" is a vowel");
                break;
            default:
                System.out.println(letter3+" is not a vowel");
        }
    }
}
