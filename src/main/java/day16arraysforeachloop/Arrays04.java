package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //size verilen bir cümlede kaç kelime oldugunu gösteren kodu yaz
        String s = "Java is easy.Learn Java earn money";
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
        //Size verilen bir cümlede kaç harf oldugunu gosteren kodu yazınız
        String letters[]= s.replaceAll("[^a-zA-Z]","").split("");//char kullanılamaz
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);

    }
}