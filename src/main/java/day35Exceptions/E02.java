package day35Exceptions;

public class E02 {

    public static void main(String[] args) {

        System.out.println(getCharFromString("Java", 2));

        System.out.println(getCharFromString("Java", 8));
    }

    //Example 1: Bir String'deki karakteri index kullanarak alan bir method olusturunuz

    public static char getCharFromString(String str,int index) {

        try {
            return str.charAt(index);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            index = Math.abs(index);

            index = index % str.length();

            return str.charAt(index);
        }

    }
}
