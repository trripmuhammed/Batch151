package day22stringbuilder;

public class Sb01 {
    /*
    1)"StringBuilder" String üreten bir class'dır
    2)"String" Class kullanarak String üretiriz Java niçin "StringBuilder" Class oluşşturdu?
        "String" Class "Immutable"(değiştirilemez) string üretir."StringBuilder" Class "mutable"(değiştirilebilir) string ütetir
    3)  immutable olmak demek orjinal değerin korunması(değiştirilemez olması) demektir.
        mutable olmak orjinal değerin değiştirilebilir olması demektir.
    4)"capacity" Java'nın bize verdiği data depolama yer sayısıdır.
      Length ise bize verilen data depolama yerinin kullanılan kısmıdır
    5)Java başlangıç olarak bize kapasiteyi 16 olarak verir.
      Biz verilen kapasiteyi aşarsanız java yeni  kapasiteyi varolanın 2 katının 2 fazlası olacak şekilde değiştirir

    */
    public static void main(String[] args) {

        String s="Java";

        s=s+'!';

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        //StringBuilder nasıl oluşturulur?

        //1.way
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);

        //StringBuilder'lara nasıl ekleme yapılır
        t.append("!").append("...");
        System.out.println(t);

        //2.way
        StringBuilder r = new StringBuilder();
        System.out.println(r);
        r.append('c');
        System.out.println(r);

        //capacity ve length arasındaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        int capacity=sb1.capacity();
        System.out.println(capacity);
        int length=sb1.length();
        System.out.println(length);

        sb1.append("!").append(".................");//kapasite arttırırken varolan kadar ekleyip 2 attırır
        int c = sb1.capacity();
        System.out.println(c);

        int ln = sb1.length();
        System.out.println(ln);

        //default capacity'yi değiştirebilirmiyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());

        sb2.append("...");
        System.out.println(sb2.capacity());
    }
}
