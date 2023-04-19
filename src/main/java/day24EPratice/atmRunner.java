package day24EPratice;

import java.util.Scanner;

public class atmRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select a process");
        int process = input.nextInt();
        atm user = new atm();
        switch (process) {
            case 1:
                System.out.println("Bakiyeniz: " + user.bakiye);
                break;
            case 2:
        }
    }
}
