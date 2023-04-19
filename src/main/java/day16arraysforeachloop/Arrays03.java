package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //specific bir elemenanın array'de olup olmadıgını anlamak için gereken kod
        String names[] = {"K","C","R","A","S"};
        String arananEleman="A";
        int counter=0;
        for(String w : names) {
            if(w.equals(arananEleman)) {
                counter++;
                break;//icerip icermedigini arıyoruz sayısını degil o yuzden hızlı calıssın diye yaptık
            }}
            if(counter>0){
                System.out.println("Array has the element");
            }else{
                System.out.println("Array doesn't have the element");
            }
            //2.way(daha hızlı) binarySearch() method
            Arrays.sort(names);
            //1) binarySearch() method unu sort() kullanmadan kullanmayınzız cunku bu method mantıgı sıralı elemanlar için geçerlidir
            //2) binarySearch() method varolan method o eleman için bize index ini verir
            //3) binarySearch() methodundan aldıgınız method 0 veya 0 dan buyukse o eleman vardır
            //4) - o eleman yok sayi ise olsaydı kacıncı olurdu o demek
            int result=Arrays.binarySearch(names,arananEleman);//index ini verecek
            System.out.println(result);
            //olmayan eleman girildiginde java başına - koyarak olsaydı kaçıncı eleman olurdu onu soyler
            // A  C  K  R  S binarySearch() method K yı referans alarak ya sağ yada solu eler.Böylece işlem kısalır
            //eger E girseydik -3 verirdi cunku E olsaydı A C E K R S olurdu ve 3.sırada yer alırdı
    }
}
