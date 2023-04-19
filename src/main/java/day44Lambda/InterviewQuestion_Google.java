package day44Lambda;

import java.util.*;

public class InterviewQuestion_Google {

    public static void main(String[] args) {


    //Example 1: Size verilen bir array'in "Mountain Array" olup olmadigini gosteren kodu yaziniz.
    //Mountain Array -> [0,2,5,3,1,-1]
    int[] arr = {0,2,5,3,1,-1};

    //Array'i list'e cevirelim cunku List'i kullanmak daha kolay
    List<Integer> myList = new ArrayList<>();
    Arrays.stream(arr).forEach(myList::add);
    System.out.println(myList);

    //List'teki max elemani bulalim
    int max = myList.stream().reduce(Math::max).get();
    System.out.println(max);

    //List'teki max elemanin index'ini bulalim
    int idxOfMax = myList.indexOf(max);
    System.out.println(idxOfMax);

    //Maximum elemana kadarki tüm elemanlari bir list'in icine koy
    List<Integer> firstList = new ArrayList<>();
    myList.stream().filter(t-> myList.indexOf(t)<=idxOfMax).forEach(firstList::add);
    System.out.println(firstList);

    //FirstList'in copy'sini olustur
    List<Integer> firstListCopy = new ArrayList<>();
    firstList.stream().forEach(t-> firstListCopy.add(t));
    System.out.println(firstListCopy);

    //Copy'sini sort et
    Collections.sort(firstListCopy);

    //FirstList ile firstListCopy'nin ayni olup olmadigini kontrol et
    boolean rule1 = firstList.equals(firstListCopy);
    System.out.println(rule1);


    List<Integer> secondList = new ArrayList<>();
    myList.stream().filter(t-> myList.indexOf(t)>=idxOfMax).forEach(secondList::add);
    System.out.println(secondList);

    List<Integer> secondListCopy = new ArrayList<>();
    secondList.stream().forEach(t-> secondListCopy.add(t));
    System.out.println(secondListCopy);

    Collections.sort(secondListCopy);
    Collections.reverse(secondListCopy);
    System.out.println(secondListCopy);

    boolean rule2 = secondList.equals(secondListCopy);
    System.out.println(rule2);

    System.out.println("Is the array mountain array? " + (rule1 && rule2));

    }

}
