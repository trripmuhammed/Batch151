package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add : ");
        int numOfElements = input.nextInt();
        System.out.println("To stop adding press 'q'");
        String stdNames[] = new String[numOfElements];
        for(int i = 0; i <stdNames.length; i++) {
            System.out.println("Enter the "+(i+1)+" student name");
            String name = input.next();
            if(name.equalsIgnoreCase("q")) {
                break;
            }else {
                stdNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdNames));
    }
}
