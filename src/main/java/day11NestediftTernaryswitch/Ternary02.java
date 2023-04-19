package day11NestediftTernaryswitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayı giriniz");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String result = number>0 ? "Positive" : "Not Positive";
        // : else demek
        System.out.println("result = " + result);
    }
}
