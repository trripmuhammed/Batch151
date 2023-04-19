package day34exceptions;

public class E01 {
    /*
        1)"Exception" beklenmedik problem demektir.
        2)"Exception"ları halledebilmek icin iki temel yol vardır.
            1)"Exception" a uygun çözümler üretebiliriz. Buna "Exception Handling" denir.
            2)"Exception" olustugunda bunu ilan eder ve geri cekilirsiniz.Buna da "Throw Exception" denir.
        3)"Exception" a uygun cozumler uretmede "try-catch" kullanılır.
            "try block" da yapılması gereken islemi Java'dan yapması istenir.
            Java islemi problemsiz bir sekilde yaparsa catch block Java tarafından
            okunmaz. "try block" da islem yapılırken Exception olusursa "catch block"
            devreye girer ve "catch block" icindeki kodlar calısır.
       4)"try block" calısırsa ondan sonraki kodlar calısmaz ve direkt "catch block" a gecilir
     */
    public static void main(String[] args) {

        System.out.println(divide1(12, 3));
        System.out.println(divide1(6, 0));

        System.out.println(divide2(12, 3));
        System.out.println(divide2(6,0));

    }
    //1.way Exception'ı handle etmede ilk ve igrenc yol
    public static int divide1(int a, int b){
        if(b==0){
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way Exception'ı handle etmede harika yol
    public static int divide2(int a, int b){

        int result = 0;

        try{
            result = a/b;
            //Eger burda calismayacak bir durum varsa ==> b nin sıfır olması
            //Ondan sonraki kodlar calısmaz
            System.out.println("I am here");

        } catch (ArithmeticException e) {//ArithmeticException matematik ile ilgili herhangi bir kural ihlali yapıldıgında atılır.
            System.out.println("There is an issue in division");
        }
        return result;
    }
}
