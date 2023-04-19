package day03scanner;

import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adresinizi yazınız");
        //next() metodu kullanıcıdan tek kelimeli String'i almak için kullanılır.
        //nextLine() metod'u kullanıcıdan çok kelimeli String'i almak için kullanılır.
        String address = input.nextLine();
        System.out.println(address);

    }
}
