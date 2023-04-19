package day38Enumsiterators;

import java.util.*;

public class Iterators01 {
    /*
        1)Iterator'lar loop'larin yaptigi ayni isi yapar.
        2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
        3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
        4)Iterator'lar bir collection'dan eleman silme
         ve bir collection'daki elemani degistirme konusunda daha basarilidir.
        5)İki tip iterator var;
            1)Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veya
            elemani degistirmek mumkun degildir.
            2)ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.
            Note: "Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
            "ListIterator" ise iki yonlu calisabilir.
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);

        //"Iterator" kullanalim
        Iterator<String> myItr = myList.iterator();//bunu kullandıgımızda pointer ilk indexdedir.
        //ilk pointer bosluk'da dir.
        while(myItr.hasNext()){
            //hasNext() pointer'a "Senden sonra eleman var mi?" diye sorar.
            //Eleman varsa true yoksa false return eder.

            //next() method'u pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
            myItr.next();//istersek veriable icine koyabiliriz.

            myItr.remove();//next() method'unun return ettigi elemani siler.
        }
        System.out.println(myList);

        //ListIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        while(yourListItr.hasNext()){

            String el = yourListItr.next();

            yourListItr.set(el + "!");//set() method list'i update etmeye yarar.

        }
        System.out.println(yourList);

        //hasPrevious() ve previous() nasil kullanilir.
        while(yourListItr.hasPrevious()){

            String el = yourListItr.previous();

            yourListItr.set("?" + el);
        }

        System.out.println(yourList);

        //En sondan en basa nasil iterate edebiliriz
        LinkedList<String> ourList = new LinkedList<>();
        //descending i kullanmak icin LinkedList kullanmaliyiz.
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);


        //descending => azalan sıralama demek (en sondan baslicak)
        Iterator<String> ourListIterator = ourList.descendingIterator();

        while(ourListIterator.hasNext()){

            String el = ourListIterator.next();

            System.out.println(el);


        }


    }
}
