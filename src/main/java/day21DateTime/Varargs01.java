package day21DateTime;

import java.util.Scanner;

public class Varargs01 {
    public static void main(String[] args) {
        System.out.println(add(5,2,4,3));
        getInitials("Ali Can");

    }
    //Example 1:Toplama işlemi yapan bir method
    //Aşağıdaki gibi farklı method'lar oluşturark iş yapamayız çünkü kullanıcı farklı sayıdaki sayiları toplamak isteyebilir
   /* public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b,int c){
        return a + b + c;
    }
    public int add(int a, int b,int c,int d){
        return a + b + c + d;
    }*/
    //Java farklı sayidaki parametrelerin hepsini kabul eden bir yapı oluşturdu
    //Bu yapıya "Varargs" deniir.
    //"Varargs" arkada array yapısını kullanır o yüzden biz "Varargs" kullandığımızda array kullanıyormus gibi calısabiliriz
    /*
    1)Bir method parantezinin içinde bir'den fazla "Varargs" kullanılamaz
    2)Bir method parantezinde birden fazla parametre kullanılacaksa "Varargs" en sonda olmalıdır
     */
    public static int add(int b,int... a){
        int sum=0;
        for(int w : a){
            sum += w;
        }
        return sum;
    }
    //Example 2:Verilen isimlerin ilk harflerini consol'a yazdıran methodu oluşturunuz
    public static void getInitials(String... s){
        String initials="";
        for(String w : s){
        initials=initials + w.charAt(0)+w.split(" ")[1].charAt(0);
        System.out.println(initials);
        initials="";
        }
    }
}
