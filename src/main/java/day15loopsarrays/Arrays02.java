package day15loopsarrays;

import java.util.Arrays;
//application'larda data ile bunları isleyen kod'lar(logic) vardır ve bunlar ayrılır.
//logic data ya bağımlı olmamalıdır.Eğer yazılırsa bunlara "hard code" denir
//Bu kod hatalı kod demektir
//asagıdaki arrey de son elemanı almak için 4 veya grades.length-1 kullanılabilir
//ama 4 kullanılırsa array'e elaman eklenirse kod yanlıs calısır ve hardcode olur
public class Arrays02 {
    public static void main(String[] args) {
        //array deki en kucuk ve en buyuk sayıların toplamını yazdır
        //data ile logic kısmı dayma ayrılır data bozulsa da logic bozulmamalıdır
        //asceding + alphabetically==> Natural Order
        int grades[]={67,98,100,34,76};
        //logic
        Arrays.sort(grades);//sayıları küçükten buyuge dizer(ascending)
        System.out.println(Arrays.toString(grades));
        System.out.println(grades[0]+grades[grades.length-1]);
        //Size verilen bir String array'deki isimlerden 5 karakter'den az karakter içerenleri yazdır
        String names[]= {"Ajda","Ahmet","Mehmet","Cuneyt","Tom"};
        for(String w : names){
            if(w.length()<5){
                System.out.println(w);
            }}
        //Size verilen bir String array'deki isimleri alfabetik sıraya koyduktan sonra f ile başlayan
            //isimlerden onceki isimleri yazdır
            Arrays.sort(names);//bu alfabetik sıraya koyar(alphabetically)
            for(String k : names){
                if(k.startsWith("F")) {
                break;}
                System.out.println(k);}
                //Size verilen bir String array'deki isimleri alfabetik sıraya koyduktan sonra f ile başlayan
                //isimlerden onceki isimleri ve f ile başlayanları yazdır
                Arrays.sort(names);
                for(String k : names){
                    System.out.println(k);
                    if(k.startsWith("F")) {
                        break;}
                }
        //Size verilen bir String array'deki isimleri alfabetik sıraya koyduktan sonra f ile başlayan
        //isimlerden f ile başlayanlar hariç yazdır
        Arrays.sort(names);
                for(String k : names){
                    System.out.println(k);
                    if(k.startsWith("F")) {//bir datayı barındırmasını istemiyorsak
                        //continue kullanılır
                        continue;}else {
                        System.out.println(k);
                    }
                }
    }
}
