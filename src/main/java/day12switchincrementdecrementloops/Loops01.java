package day12switchincrementdecrementloops;

public class Loops01 {
    public static void main(String[] args) {
        //ekrana 5 kere hi yazdır
        //4 tane loop yapısı vardır.for-loop while-loop
        // do-while-loop for-each-loop
        for(int i=0;i<5;i++) {
            System.out.println("Hi");
        }
        for(int i=33;i>10;i--) {
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }
    }
}
