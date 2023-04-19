package day15loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        //kullanıcının coklu data'yı bir arrey'e yerlestirebilmesi icin gereken kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many names to enter");
        int amount = input.nextInt();
        String name[]= new String[amount];
        System.out.println("Uygulama çıkış kodu 112");
        for (int i=0; i<amount; i++) {
            System.out.print("İsim giriniz: ");
            name[i] = input.next();
            if(name[i].equals("112")){
                System.exit(0);
            }
        }
        System.out.println(Arrays.toString(name));
    }
}
