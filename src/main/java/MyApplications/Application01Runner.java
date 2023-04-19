package MyApplications;

import java.util.Scanner;

public class Application01Runner {
    public static void main(String[] args) {
        Application01 person = new Application01();
        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz vücut kitle endeksinizi hesaplamanız için lütfen boy ve kilonuzu giriniz");
        System.out.print("boy :");
        double length = input.nextDouble();
        System.out.print("kilo :");
        double size = input.nextDouble();
        double vke = size/(length*length);
        System.out.println("vücut kitle endeksiniz = " + vke + "\t dir");
        if(vke<18.9){
            person.weightWeak();
        }
        if(18.9<=vke && vke<=24.9){
            person.weightNormal();
        }
        if(vke>24.9){
            person.weightHeavy();
        }


    }
}
