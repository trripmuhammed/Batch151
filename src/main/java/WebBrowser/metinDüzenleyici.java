package WebBrowser;

import com.sun.source.tree.ArrayTypeTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class metinDüzenleyici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter How many keyword you want next enter the keywords");
        List<String> keyword = new ArrayList<>();
        int keySize = input.nextInt();
        for(int i=0;i<keySize;i++) {
        keyword.add(input.next());
        }
        System.out.println("Please enter the text");
        input.nextLine();
        StringBuilder text = new StringBuilder(input.nextLine());
        System.out.println(text);
        String selections[] ={"add","remove","chance","removeLine","showsize","cleartext","indexfounder","exit"};
        System.out.println("Please select the your process \n" + Arrays.toString(selections));

        do{
            String choose = input.next().toLowerCase();
            switch (choose){
            case "exit":
                System.exit(0);
            case "add":
                System.out.println("Please enter the row number and keyword word");
                text.insert(input.nextInt(),input.next());
                System.out.println(text);
                break;
            case "remove":
                System.out.println("Please enter the keyword");
                String keyword1 = input.next();
                int idx1 = text.indexOf(keyword1);
                text.delete(idx1,idx1+keyword1.length());
                System.out.println(text);
                break;
            case "chance":
                System.out.println("Please enter the keyword and the String");
                String keyword2 = input.next();
                int idx2 = text.indexOf(keyword2);
                input.nextLine();
                String keyword21 = input.nextLine();
                text.replace(idx2,idx2+keyword2.length(),keyword21);
                System.out.println(text);
                break;
            case "removeline":
                System.out.println("Please enter the start and end row of the Line");
                text.delete(input.nextInt()-1,input.nextInt()-1);
                break;
            case "cleartext":
                text.delete(0,text.length());
                System.out.println(text);
                break;
            case "indexfounder":
                System.out.println("Please enter the keyword");
                String keyword3 = input.next();
                System.out.println("Start Index of keyword : " + text.indexOf(keyword3));
                break;
            case "showsize":
                System.out.println(text.length());
            default:
                System.out.println("Invalid process");
        }
        }while(true);
    }
}
