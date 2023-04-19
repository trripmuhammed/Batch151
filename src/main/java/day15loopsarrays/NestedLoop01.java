package day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
        int k=1;
        Scanner input = new Scanner(System.in);
        /*
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < k;j++) {
                if (k==10){
                    System.exit(0);
                }
                System.out.print("*");
            }
            k++;
            System.out.println();
        }*/
        //3.örnek
        System.out.println("Please enter row number");//satır sayısı gir
        int row =input.nextInt();
        for(int m=1;m<=row;m++) {
            for(int n=1;n<=m;n++) {
                System.out.print(n);
            }
            System.out.println();
        }

    }
}
