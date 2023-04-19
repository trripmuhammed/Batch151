package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args){
        // methodları istersen sonuçlara atamadanda yazdırırız
        System.out.println("sonuçlar");
        int a=4,b=7; // buda yapılabilir
        int sonuc= toplama(3,5);
        System.out.println(sonuc);

        long sonuc2= carpma(6,9);
        System.out.println(sonuc2);

        long sonuc3= islem(5,7,4);
        System.out.println(sonuc3);

        System.out.println(usalma(9));

        yazdır("Hello World");
    }
    public static int toplama(int a,int b){
        return a+b;
    }
    protected static long carpma(int a,int b){
        return a*b;
    }
    private static long islem(int a,int b,int c){
        return (a*b)+c;
    }
    // ACCESS MODIFIER ı default yapmak icin access modifier yazma
    static double usalma(double a){
        return a*a*a;
    }
    public static void yazdır(String str1){
        System.out.println(str1);
    }
}
