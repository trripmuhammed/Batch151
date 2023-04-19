package day11NestediftTernaryswitch;

import java.util.Scanner;
//yılın artık yıl olup olmadıgını bulunuz ==> 100 ve 400 e yada 100 e bölünmüyecek 4 e bölünecek
public class Ternary03 {
    public static void main(String[] args) {
        System.out.println("Please enter a year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        String result = year%100==0 ? (year%400==0 ? "Leap Year" : "Not Leap Year") : (year%4==0 ? "Leap Year" : "Not Leap Year");
        //2.yol
        if(year%100==0) {
            if(year%400==0) {
                result = "Leap Year";
            } else {
                result = "Not Leap Year";
            }}
        else if(year%4==0) {
            result = "Leap Year";
        } else {
            result = "Not Leap Year";
        }
        System.out.println("result = " + result);
    }
}
