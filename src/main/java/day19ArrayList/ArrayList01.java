package day19ArrayList;

import java.util.ArrayList;

/* 1)Aynı data type'ındaki coklu data'ları depolamak için Array kullanırız.
        2)Array'lerin bir negatif yönü var; içine koyacağımız eleman sayısını başta seçmeliyiz
        3)Array'ler eleman sayısında esnek değildirler,bu yüzden java "ArrayList" adlı yeni bir yapı oluşturdu
        bu yapı eleman sayısında esnektir.Hiç eleman koymassanız eleman sayısı 0 olarak ayarlar
        1000 eleman koyarsanız eleman sayısını 1000 olarak ayaralar.
        4)ArrayList yerine sadece List de diyebiliriz.
        5)Java ArrayList'leri oluşturduktan sonra array'leri iptal etmedi
                1-Arrayler cok hızlı
                2-Arrayler az yer kaplarlar
        6)Array'ler primitive data type'ları ve reference'ları depolayabildiği için az yer kaplar
        ArrayList'ler non-primitive data typle'larını depolarlar.Bu yüzden ArrayLisler, Array'lerden daha cok yer kaplar
         */
public class ArrayList01 {
    public static void main(String[] args) {
        //ArrayList nasıl olusturulur.
        ArrayList<Integer> ages = new ArrayList<>();
        //ArrayList nasıl yazdılır
        System.out.println(ages);
        //ArrayList'e eleman nasıl eklenir
        //1.way
        ages.add(12);
        ages.add(24);
        ages.add(9);
        //add method u elemanları giriş sırasına(insertion order) göre List'e yerleştirir
        System.out.println(ages);
        //2.way
        ages.add(1,99);
        //bu belirtilen index e yeni element'i yerleştirir diğerini silmez
        System.out.println(ages);

        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);
        //3.way
        ages.addAll(price);
        //bu bir list'i diğer list'in içine ekler
        System.out.println(ages);
        //4.way
        //bu bir list'i istedigimiz index'e yerleştirir
        ages.addAll(3,price);
        System.out.println(ages);

        //ArrayList'te eleman sayısı nasıl bulunur
        //size method bir list'teki eleman sayısını veir
        int numOfEl=ages.size();//number of elements
        System.out.println(numOfEl);
        //ArrayList'te specific bir eleman nasıl alınır?
        //get methodu index kullanarak istediğimiz elemanı almaya yarar
        int el1=ages.get(3);
        System.out.println(el1);
        //set varolan elemanı index e göre değiştirmeye yarar
        ages.set(6,111);
        System.out.println(ages);
        //ArrayList'te specific bir elemanın varlığını kontrol eder
        boolean r1=ages.contains(99);
        System.out.println(r1);
        //Bir ArrayList'in boş mu dolu mu olduğunu kontrol eder
        boolean r2=ages.isEmpty();
        System.out.println(r2);
        //Bir ArrayList'deki tüm elemanları siler.
        ages.clear();
        System.out.println(ages);
        boolean r3=ages.isEmpty();
        System.out.println(r3);

        //örnek 1: Bir List'in boş olup olmadığını kontrol eden kodu yazınız
        ArrayList<String> names= new ArrayList<>();
        names.add("Ajda");
        names.add("Cüneyt");
        names.add("Angelina");
        names.add("Brad");
        //1.way
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least one element");
        }
        //2.way(Recommended)
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
        System.out.println("List has at least one element");
    }
    }
}
