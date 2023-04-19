package day11NestediftTernaryswitch;

import java.util.Scanner;
/*
1) if içinde if kullanımına "Nested if" denir
2) Bu java yı yavaşlatır bundan dolayı mecbur olmadıkça kullanılmaz
3) bunun gibi java yı yavaşlatan programlara Time Consuming denir
 */
public class Nestedif01 {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner input = new Scanner(System.in);
        byte age = input.nextByte();
        System.out.println("Please enter your gender");
        String gender = input.next();
        if(0>age || age>120){
            System.out.println("Negative ages or ages greater than 120 are invalid");
        }else if(gender.equalsIgnoreCase("male")){
            if(age>65){
                System.out.println("Can be retired");
            }
            else {
                System.out.println("Should work");
            }
        }
        else if(gender.equalsIgnoreCase("female")){
            if(age>60){
                System.out.println("Can be retired");
            }
            else {
                System.out.println("Should work");
            }
        }
        else{
            System.out.println("Undefined gender");
        }
    }
}
