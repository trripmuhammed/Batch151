package day11NestediftTernaryswitch;

import java.util.Objects;
import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
        System.out.println("Please enter an Integer");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //Object String gibi bir veri tipi ve Bütün data ların atasıdır(hepsi için geçerli)
        //Bunun gibi farklı tiplerde data elde ettiğimizde bunu kullanırız
        //Object bir class dır. Aynı zamanda üstünde bişey olmayan tek class dır.(babası olmayan)(java da class lar arasında baba oğul ilişkisi vardır)
        Object result = number%2==0 ? number/2 : "Bu sayı ikiye bölünemez";
        System.out.println(result);
    }
}
