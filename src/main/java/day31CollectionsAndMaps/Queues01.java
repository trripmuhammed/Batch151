package day31CollectionsAndMaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        //LinkedList den dolayı bizim verdigimiz sıra ile dizdi
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);

        wareHouse.remove();//ilk elemanı siler
        System.out.println(wareHouse);

        System.out.println(wareHouse.peek());//ilk elemanı yazdırır
        System.out.println(wareHouse);

        System.out.println(wareHouse.element());
        System.out.println(wareHouse);

        System.out.println(wareHouse.poll());//ilk elemanı yazdırır ve siler.
        System.out.println(wareHouse);

        wareHouse.clear();

        System.out.println(wareHouse.poll());//null

        System.out.println(wareHouse.remove());//exception



    }
}
