package test1;

import java.util.Scanner;
public class Scannert1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Lütfen maasınızı giriniz");

     //   int salary = input.nextInt();

    //    System.out.println("salary = " + salary);
        Name Arda = new Name();
        System.out.println("Arda.firstName = " + Arda.firstName);
        System.out.println("Arda.secondName = " + Arda.secondName);
        System.out.println("Arda.Address = " + Arda.Address);
        Arda.sevgi();


    }
}
