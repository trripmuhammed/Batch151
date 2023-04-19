package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        String names[][] = new String[3][2];
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";
        System.out.println(Arrays.deepToString(names));
        //Multidimensional array leri yazdırmak için deepToString kullanılır

        //multidimensionalarray in icindeki bir array i(1 satırı) yazdır
        System.out.println(Arrays.deepToString(names[0]));
        //kısa yoldan multidimensionalarray oluşturma
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        //yukarıdaki students array'inde toplam kaç isim olduğunu bulunuz
        int result =0;
        for(String[] w : students){//1 tane [] koymamızın sebebi 2 boyutlu array de aldıgımız ilk satırın veriable ının array olması
            result+= w.length;
        }
        System.out.println(result);
        //students array'inde icinde "m" olan isimleri yazdır
        for(String[] w : students){
            for(String k : w){
                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }
        int result2 =1;
        //bir integer muitidimensionalarray olusturunuz.Tüm elemanların carpımını hesaplayınız
        int nums[][]={{5,4},{2,3,2},{7}};
        for(int[] w : nums){
            for(int k : w){
                result2*=k;
            }
        }
        System.out.println(result2);
        //2 boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][]={{5,4},{2,3,2},{7}};
        int result3=0;
        for(int[] w : numbers){
            result3+=w.length;
        }
        int numbers2[] = new int[result3];
        int idx=0;
        for(int[] w : numbers){
            for(int k : w){
                numbers2[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(numbers2));
        //bir integer 2 boyutlu array'deki en kucuk ve en buyuk elemanların toplamını bulunuz
        int ages[][]={{15,4},{12,43,21},{7}};
        int small=ages[0][0];//referans olarak aldık
        int big=ages[0][0];//referans olarak
        for(int[] w: ages){
            for (int k : w){
             small=Math.min(small,k);
             big=Math.max(big,k);
            }
        }
        System.out.println(big+small);
    }
}