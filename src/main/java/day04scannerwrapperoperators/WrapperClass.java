package day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive    : char     - boolean - byte - short - ınt    - long - double
        //Wrapper Class: Character - Boolean - Byte - Short - Integer -Long - Double
        //farkları wrapper non-primitive dir (çok yer kaplar)
        int n = 12;
        Integer m = 12;
        //"n" yazıp nokta koyunca metod göremeyiz ama m yazıp koyarsak görürüz
        //çünkü int primitive Integer non-primitive dir ve method içerir.

        byte p = 13;
        Byte r = 13;
        //Ornek 1: short un sınırlarını kodla bul

        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        // Ornek 2: int in min degeri ile byte ın max degerinin toplamı
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("intMin + byteMax = " + (intMin + byteMax));
        // Ornek 3: primitive int'i wrapper Integer'a çevir (Autoboxing)(interview sorusu)
        // terside yapılabilir. (un boxing)
        int num=10;
        Integer wrapperNum = num;



    }
}
