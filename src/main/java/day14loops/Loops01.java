package day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //tekrarsız sayıların toplamı (interview sorusu)(indexOf ve lastIndexOf un mantığı)
        System.out.print("Please enter a integer: ");
        String number = input.next();
        int result=0;
        for(int i = 0;i<number.length();i++) {
            String d= number.substring(i,i+1);
            if(number.indexOf(d)==number.lastIndexOf(d)){
                result+=Integer.valueOf(d);
        }}
        System.out.println(result);
        //Alala tekrarlıları yazdırınız
        String t="Alala";
        String result2="";
        for(int i = 0;i<t.length();i++) {
            char ch=t.charAt(i);
            if((t.indexOf(ch)!=t.lastIndexOf(ch)) && !result2.contains(""+ch)){//lala yerine la yazması için
                result2+=ch;
            }
    } System.out.println(result2);
    }}
