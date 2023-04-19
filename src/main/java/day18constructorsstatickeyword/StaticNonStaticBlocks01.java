package day18constructorsstatickeyword;

import java.time.LocalDate;

/*
    1) Static block lar static veriable'lara ilk değerlerini atamak(initialize(başlatmak)) için kullanılır
    2)static blocklar main den önce başlatılır.
    3)static bir veriable'a deger atamak icin yazılan kod main'e de yazılabilir ancak
    static icine yazılana daha önce çalışır
    4)Bir class da 1 den fazla static block varsa üsteki önce çalışır
 */
public class StaticNonStaticBlocks01 {
    public static void main(String[] args) {
        System.out.println("HEY I AM MAİN BLOCK");
    }
    public static double pi=3.14;
    //static veriable'lar static block kullanılmadan da initialize edilebilirler
    public static double price;
    static{
        System.out.println("HEY I AM STATİC BLOCK");
        LocalDate d =LocalDate.now();
        if (d.getMonthValue()==3) {
            price = 1000;
        }else{
            price=1200;
        }
    }//static block bir veriable a kodla deger vereceksek kullanılır
    static{
        System.out.println("I AM STATİC BLOCK 2");
    }
}
