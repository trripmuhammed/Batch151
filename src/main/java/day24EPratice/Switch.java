package day24EPratice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year and month number");
        int year = input.nextInt();
        int month = input.nextInt();
        switch (month){
            case 1,3,5,7,8,19,12:
                System.out.println("Ayınız 31 gun ceker");
                break;
            case 4,6,9,11:
                System.out.println("Ayınız 30 gun ceker");
                break;
            case 2:
                if(year%4==0){
                    System.out.println("Ayınız 29 gun ceker");
                }else{
                    System.out.println("Ayınız 28 gun ceker");
                }
            break;
            default:
                System.out.println("Invalid month number");
        }

    }
}
