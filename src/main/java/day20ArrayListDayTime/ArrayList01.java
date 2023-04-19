package day20ArrayListDayTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {/*
1)String class kullanmak tercih edilir çünkü string class method açısından cok zengindir
2)List.of kullanarak kısa yoldan list olusturabiliriz ancak bu list'lerin elemanları değiştirilemezler
3)Bu list'lere yeni eleman eklenemez
4)Bu list'lerden eleman silinemez
*/
    public static void main(String[] args) {
        //Example 1: Kullanıcının girdiği harf list'te var ise o harfi "Buldum!" a çevirin
        //yoksa o harfi list'e ekleyin
        Scanner input = new Scanner(System.in);
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("H");
        letters.add("J");
        letters.add("K");
        letters.add("K");
        int size= letters.size();
        int counter=0;
        do{

            if(counter==size){
                System.out.println(letters);
                break;
            }
            System.out.println("Please enter a letter");
            String letter = input.next().substring(0, 1).toUpperCase();

            if (letters.contains(letter)) {
                letters.set(letters.indexOf(letter), "Buldum!");
            } else {
                letters.add(letter);
            }

            counter++;
        }while (true);

    }
}
