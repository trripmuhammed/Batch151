package day18constructorsstatickeyword;
//Overload(Aşırı yükleme) interview da cıkabilir
public class MethodOverLoading {
    public static void main(String[] args) {
        /*
        1)Bir method aynı isim ve farklı parametrelerle olusturulursa buna Method Overloading denir.
        2)Method Overloading Java da iyi organizasyon için önemlidir
        3)Method Overloading yaparken parametre 3 şekilde değiştirilebilir
            1-Parametrelerin sayıları(tane) değiştirilebilir
            2-Parametrelerin data tipleri deşitirilebilir
            3-Parametrelerin data tipleri farklı ise yerleri değiştirilebilir
        4)Method Overloading bir class'ın içinde oluşur.Bu yüzden private method'lar da overload edilebilir.
        *bütün access modiffer larda kullanılabilir
        5)"static" method'lar "overload" edilebilirler.
         */
        String s="Sabir";
        //sadece method creation yaptıklarımız method degildir substring de bir method mesela
        // s.substring() 2 farklı iş yapıyor ==> tek degerle ve 2 degerle
        // s.startswith
        System.out.println(add(3, 5));
        //virgül süz sayılar java da int dir ne short ne byte
        //cok fazla method girdiğimizden java parametrelere bakar.
        //java auto wideining(büyütme örnek:byte dan int'a) 1 de olmadıgdan 1 i seçer.
    }
    private static int add(int a, int b) {
        return a+b;
    }
    private static int add(int a, int b,int c) {
        return a+b+c;
    }
    private static double add(double a, int b) {
        return a+b;
    }
    private static double add(int a, double b) {
        return a+b;
    }
}
