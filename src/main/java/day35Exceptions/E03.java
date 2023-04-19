package day35Exceptions;

public class E03 {
    /*
        1)try block'dan sonra coklu catch block kullanılabilir.
           catch block'lar arasında parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
           catch block'lar arasında parent-child iliskisi varsa child ustte olmalıdır.
        2)"Exception Class" tüm exception'larin parent'i dir.
           Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
            tek catch block'i "Exception Class" ile kullanabiliriz.
        3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz.
        4)"try" catch block olmadan kullanilabilir mi?
          "try + finally" kullanilabilir.
     */

    public static void main(String[] args) {

        System.out.println(convertStringToIntDivideByLength1("12412"));
        System.out.println(convertStringToIntDivideByLength1("Learn Java earn money"));
        System.out.println(convertStringToIntDivideByLength1("2"));

        System.out.println(convertStringToIntDivideByLength2(""));
        System.out.println(convertStringToIntDivideByLength2("2"));

        System.out.println(convertStringToIntDivideByLength3(""));
        System.out.println(convertStringToIntDivideByLength3("2"));


    }

    //Example 1: Bir String'i integer'a ceviren ve bu integer'i String'in length'inin 1 eksigine bolen method olusturunuz

    public static int convertStringToIntDivideByLength1(String str) {

        int result=0;
        try {
            int a = Integer.valueOf(str);

            result = a / (str.length() - 1);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Non-digit character cannot be used in valueOf()");
        }
        return result;
    }



    public static int convertStringToIntDivideByLength2(String str) {

        int result=0;
        try {
            int a = Integer.valueOf(str);

            result = a / (str.length() - 1);
        }catch (Exception e){//Tüm exception'lar icin calisir
            //Sıkıntısı tum hatalar icin ayni kodu calistirir.
            System.out.println(e.getMessage());
        }
        return result;
    }


    public static int convertStringToIntDivideByLength3(String str) {

        int result=0;
        try {
            int a = Integer.valueOf(str);

            result = a / (str.length() - 1);
        }catch (ArithmeticException e){
            System.out.println("Jump");
        }catch (Exception e){//catch class'lardaki exception arasında parent-child ilikisi varsa
            //child yukarda parent asagıda olmalıdır.Bu yüzden ArithmeticException yukarda bu asagıdadir.
            //Exception tüm exception'ların parent'ı dır.Kimin parent oldugunu genelden ozele adlandırılmasından anlayabiliriz.
            System.out.println(e.getMessage());
        }
        return result;
    }
}
