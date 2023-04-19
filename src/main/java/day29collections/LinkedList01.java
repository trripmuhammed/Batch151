package day29collections;

import java.util.LinkedList;
import java.util.List;

/*
    1)LinkedList'ler node silme ve ekleme de cok basarılı oldukları icin
    silme ve ekleme islemlerini coklukla yapacagımız zaman LinkedList kullanırız
    2)ArrayList'ler indexleri adres gibi kullanır bu yüzden ArrayList'ler "search"
    islemlerinde cok basarılıdırlar.
    Note: ihtiyacınız olan collection cogunlukla silme vve ekleme islemleri yapacaksa
    (Müze ziyaretçileri gibi) LinkedList, Search(Eyaletler) islemleri yapacaksa ArrayList kullanılır

    ArrayList'ler eleman ekleme ve silme de tekrar indexleme yapmak zorunda olduklarından
    eleman ekleme ve silme de başarısızdırlar(Yavaş çalışır).
    LinkedList'ler index kullanmazlar bu yüzden node(pointer ve karakterin oldugu kutucuk) ekleme ve silme
    islemlerinde tekrar indexleme yapılmaz.
    LinkedList'lerde node ekleme ve silme islemleri yaparken sadece pointer'ları degistirir
 */
public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();

        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Müge");
        s.add("Cüneyt");
        s.add("Esra");
        //aslında arkada index kullanmaz(kolaylık olsun diye Java index yazar)
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");


        s.remove(2);

        System.out.println(s);

        s.remove("Ajdar");

        System.out.println(s);

        s.remove();//ilk elemanı siler s.removeFirst() de aynı isi yapar

        System.out.println(s);

        s.removeFirstOccurrence("Esra"); // bastaki girdigimiz karakteri siler

        System.out.println(s);

        s.removeLastOccurrence("Esra");//sondaki girdigimi karakteri siler

        System.out.println(s);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty(eger list bossa null döndürür)
         */
        String r1 = s.peek();//ilk elemanı bize list'den silmeden getirir(copy-paste)
        System.out.println(r1);
        System.out.println(s);

        /*
        Retrieves and removes the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
         */
        String r2 = s.poll();//ilk elemanı bize verir ve list'den siler(cut-paste)
        System.out.println(r2);
        System.out.println(s);

        /*
     * Retrieves, but does not remove, the head (first element) of this list.
     * @return the head of this list
     * @throws NoSuchElementException if this list is empty(eger list bossa hata verir)
       Note:peek() ile element() ikiside ilk elemani silmeden bize verir ama
       peek() list bos oldugunda bize null verir element() ise hata verir.
         */
        String r3 = s.element();//ilk elemanı silmeden bize verir.
        System.out.println(r3);
        System.out.println(s);
        /*
        Removes and returns the first element of this list.
        This method is equivalent to removeFirst().
        Returns:the element at the front of this list (which is the top of the stack represented by this list)
        Throws:NoSuchElementException – if this list is empty
        Note:pool() ile pop() ikiside ilk elemani siler ve bize verir ama
       pool() list bos oldugunda bize null verir pop() ise hata verir.
        */
        String r4 = s.pop();
        System.out.println(r4);
        System.out.println(s);



    }
}
