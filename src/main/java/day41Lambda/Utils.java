package day41Lambda;

public class Utils {//Utils ==> sık kullanilan,faydali method'larin depolandigi Class'dir

    public static int getSquare(int a){
        return a*a;
    }
    public static boolean isOdd(int a){
        return a%2!=0;
    }
    //Bir method'u tekrar tekrar kullanmayacaksak olusturmanin anlami yok


    //baska package e koyulur genelde baskasına koyup import yaparim biz burda
    //Class icinde dursun diye buraya koyduk

    //day42 icin
    public static int getSumOfDigits(int a){
        int sum=0;

        while(a>0){

            sum+= a%10;

            a=a/10;
        }
        return sum;
    }


}
