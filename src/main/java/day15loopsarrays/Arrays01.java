package day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
       /* int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(Arrays.toString(arr));*/
        /*
        array'ler primitive data tipleri veya reference'ler(String in calısma sebebi budur) ile çalışır
        Mesela Ahmet in referans adresini array in icine koyar.
        array primitive ile hızlı(memory de az yer kaplar) oldugu icin öyle yapılmış
        array kullanımı tercih edilir(hızlıdır) ama bazen collection kullanmamız gerekecek
         */
        String stdName[] = new String[5];//array nasıl olusturulur
        //array nasıl yazdılır
        System.out.println(Arrays.toString(stdName));
        //array'e nasıl eleman eklenir
        stdName[0] = "Ahmet";
        stdName[3]= "Osman";
        stdName[4]= "Ayhan";
        stdName[2]= "Adana";
        stdName[1]= "Busra";
        System.out.println(Arrays.toString(stdName));
        //stdName array indeki her ismin sonunda * ekle ve yazdır
        for (int i = 0; i < stdName.length; i++) {//length stringlerde parantezli, arraylerde parantessiz kullanılır
            // () method ifade eder.Burda ise bizim yazdıgımız 5i java olustudugu length in içine koydu
            stdName[i]+="*";
            System.out.println(stdName[i]);
        }
        //2.way fore-each loop==> Enhanced(Zenginleştirilmiş) mümkünse bunu kullan
        for (String w : stdName) {//veriable ın içerdigi veri tipi + verdigimiz ad :  veri tipi ismi
          //sıkıntısı baştan sona kadar gider digerinde bunu biz seceriz
            //genelde array lerde kullanılır
            System.out.println(w+"*");
        }
        //bir int array olustur 5 eleman ekle ve elemanların toplamını bul
        int a[]={12,23,9,27,38};
        int result=0;
        for(int w : a) {
            result += w;
        }
        System.out.println(result);
        //3 eleman biz arrayin icine ekle ve onları carp
        char initials[]={'J','P','A'};
        int result2=1;
        for(char w : initials) {
            result2 *= w;//char lar matamatiksel işlemlerde ascıı degerleri ile çalışır
        }
        System.out.println(result2);

    }
}
