package day35Exceptions;

public class E01 {
    public static void main(String[] args) {

        System.out.println(convertStringToInt("123") + 2 );//123 + 2 = 125

        System.out.println(convertStringToInt("12ab"));


    }

    //Bir String'i Integer'a ceviren method olusturunuz.
    public static int convertStringToInt(String str){

        try{
            return Integer.parseInt(str);
        }catch(NumberFormatException e){//NumberFormatExceptionValueOf() method'u non-digit character iceren bir String ile kullanıldıgında atılır.
            System.out.println("Don't use non-digit characters");
            str = str.replaceAll("[^0-9]","");
            return Integer.parseInt(str);
        }

    }
}
