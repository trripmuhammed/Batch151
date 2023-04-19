package day34exceptions;

public class E03 {
    public static void main(String[] args) {

        System.out.println(getNumOfChar("Java"));
        System.out.println(getNumOfChar("Money"));
        System.out.println(getNumOfChar(""));

        System.out.println(getNumOfChar(null));

    }

    //Bir String'deki karakter sayisini veren method olusturunuz

    public static int getNumOfChar(String s){

        int result= 0;
        try {

            result= s.length();
        }catch (NullPointerException e) {//NullPointerException String class'da null ile uyumlu olmayan method'lar kullanıldıgında atılır
            //Başka durumlarda da kullanılır bu bir örnektir.Interview da örnek olarak kullanılabilir.

            System.out.println("Some String methods do not work with null...");

            System.out.println(e.getMessage());//Java'nın kendi teknik mesajı

        }

        return result;
    }
}
