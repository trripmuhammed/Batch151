package day11NestediftTernaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter two integers");
        int first = input.nextInt();
        int second = input.nextInt();
/*1.yol*/        if(first<second){System.out.println(first);}else{System.out.println(second);}
/*2.yol (Ternary)*/ int result = first<second ? first : second;
// dogruysa 1.ciyi yanlıssa 2.ciyi cevap olarak alıcaz
        System.out.println(result);
    }
}
