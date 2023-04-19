package day14loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        //3den 8e tam sayıları yazdır
        for (int i = 3; i<9; i++) {
            System.out.println(i+" ");
        }
        //2.way
        int i =3;
        while(i<9){
            System.out.println(i+" ");
            i++;
        }
        int j=1;
        Scanner input = new Scanner(System.in);
        int number2= input.nextInt();
        while(j<11){
            System.out.println(number2+"x"+j+"="+number2*j);
            j++;
        }
    }
}
