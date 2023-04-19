package day23KPratice;

import java.util.Scanner;

public class day05_Pratice_LoopsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word contain 'a' and 'c'");
        String text = input.next();
        if(!(text.contains("a") && text.contains("c"))){
            System.out.println("Invalid word");
            System.exit(1);
        }
        int counter=0;
        for (int i=1; i<text.indexOf('c'); i++) {
            if(text.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
