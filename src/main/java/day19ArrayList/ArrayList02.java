package day19ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
Bir şeyi öğrenirken aşağıdaki 3 şeyi öğrenin
1-
2-
3-
 */
public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);
        //ArrayList'te bir elemanın ilk görünümü nasıl silinir?
        System.out.println(cities.remove("Miami"));
        System.out.println(cities);
        //ArrayList'te bir eleman index kullanarak nasıl silinir?
        //index kullanılarak silinen elemanın hangisi olduğu String olarak return edilir.
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //ArrayList oluştururken baştaki ArrayList yerine List'te yazılabilir.Sebebi collections da bakılacak
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);
        ages.remove((Integer)12);//boxing yaptık çünkü normal yazarsak int olduğundan index olarak alıyor
        System.out.println(ages);

        //Bir ArrayList'teki bir elemanın tüm görünümlerini silme
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");
        System.out.println(cities.removeAll(citiesToRemove));
        System.out.println(cities);

        //Kısa yoldan bir List oluşturmak için List.of methodu kullanılır
        //ArrayList kullansaydık ArrayList.of kullanmalıydık
        List<Character> initials =List.of('a','k','c','d','k');
        System.out.println(initials);

        List<Character> letters = List.of('a','k','c','d','k');
        System.out.println(letters);
        //İki ArrayList'in birbirine eşit olup olmadığını kontrol etme
        //equals methodu aynı elemanlar aynı index'de olduğu sürece true verir
        boolean r1=initials.equals(letters);
        System.out.println(r1);//true

        //k nın ilk görünümünün index'ini verir
        int r2=initials.indexOf('k');//1
        System.out.println(r2);
        //k nın son görünümünün index'ini verir
        int r3=initials.lastIndexOf('k');
        System.out.println(r3);
        //Example 1: Bir List'teki tekrarsız elemanları konsola yazdıran kodu yazınız
        List<Double> prices = List.of(2.5,1.25,2.5,3.75,1.25,4.5);
        for(Double w : prices){
            if(prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w + " ");
            }
        }
        //Example 2: Bir List'te tekrarlı eleman olup olmadığını gösteren kodu yazınız
        List<Double> heights = List.of(2.5,1.25,2.5,3.75,1.25,4.5);
        int counter=0;
        for(Double w : prices){
            if(heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
            if(counter==0){
                System.out.println("All elements are unique in the list");
            }else{
                System.out.println("At least one elements is not unique in the list");
            }
        }
    }
}
