package MyApplications;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want");
        int sayi = input.nextInt();
        if(sayi<=1){
            System.out.println("Minumum 2 you can enter");
            System.exit(0);
        }
        int[] result = new int[sayi];
        for(int i=0;i<sayi;i++) {
            int numEntry = input.nextInt();
            result[i]=numEntry;
        }
        Arrays.sort(result);
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i]);
                for(int j=0;j+1<sayi;j++) {
                    if (i==j) {
                        continue;
                    }if(result[i]!=result[j]) {
                        System.out.print("<");
                    }else{
                        System.out.print("=");
                    }
                }
            }}
    }

