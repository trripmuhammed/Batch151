package day32Maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        /*
        Example 1: Type code to print the number of occurrences of words in a sentence
        Kelimlerin görünüm sayısını veren kodu yaz
        "I like you you, like like!" => I=1, like=3, you=1
         */

        String text = "I like you you, like like!";
        System.out.println(text);
        text = text.replaceAll("\\p{Punct}","");
        System.out.println(text);

        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occ = new HashMap<>();

        for(String w : words){

            Integer numOfOccurrences = occ.get(w);
            //Eger Map'te keyin value'si varsa onu verecek

            if(numOfOccurrences==null){
                occ.put(w,1);

            }else{
                occ.replace(w,numOfOccurrences+1);
            }
        }

        System.out.println(occ);


    }
}
