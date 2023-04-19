package day03scanner;

import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ad ve soyadınızı giriniz");
        String firstName = input.next();
        String lastName = input.next();
        System.out.println(firstName +"\t"+ lastName);

    }
}
