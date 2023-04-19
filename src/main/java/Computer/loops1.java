package Computer;

import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        System.out.println("Kaç satır istediğinizi giriniz");
        Scanner input = new Scanner(System.in);
        int stun = 2;
        int rows= input.nextInt();
        if(rows==1){
            System.out.println("1 satırla ucgen yapamassın");
            System.exit(0);
        }
        for (int i=1; i<= rows ; i++)
        {
            for (int j= i; j < rows ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i -1) ;k++)
            {
                if(k==1 || i == rows || k==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
