package day31CollectionsAndMaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {

    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();
        //Bu öncelige göre sıralar bu oncelik belirlenebilir

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);

        //Deque ==> Double ended Queue ==> iki uclu Queue
        //Deque'daki add(),get(),peek(),poll(),remove(), methodları first-last seklinde iki uclu olarak bulunur
        Deque<String>  d = new LinkedList<>();
        //2 uclu Queue dur.Hem bastan hem sondan etkilesime girilir.
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");




    }
}
