package day03scanner;

import java.util.Scanner;
public class Scanner4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        System.out.println("4 işlemin sırasıyla sonucları");
        System.out.println("toplama =" + sayi1+sayi2);
        System.out.print("çıkartma =");
        System.out.println( sayi1 - sayi2);
        System.out.println("çarpma =" + sayi1*sayi2);
        System.out.println("bölme =" + sayi1/sayi2);

    }
}
