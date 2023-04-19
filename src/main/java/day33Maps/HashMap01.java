package day33Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {
    public static void main(String[] args) {

        String s1 = "Hello Henry!";
        String s2 = "bbbacc";

        System.out.println(getTheNumOfOccurrenceOfLetters(s1));
    }

    //Example 1: Verilen bir String'de hangi harfin kac defa kullanıldıgını veren method olusturunuz
    // H=2, e=2, l=2, o=1, n=1, r=1, y=1
    public static TreeMap<String, Integer> getTheNumOfOccurrenceOfLetters(String text){
        text = text.replaceAll("[^a-zA-Z]","");
        String[] letters = text.split("");

        TreeMap<String, Integer> numOfOccurrence = new TreeMap<>();

        for(String w : letters){

            Integer numOfOcc = numOfOccurrence.get(w);



            if(numOfOcc == null){
                numOfOccurrence.put(w,1);
            }else{
                numOfOccurrence.replace(w,numOfOcc+1);
            }

        }

        return numOfOccurrence;
    }
}
