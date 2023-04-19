package day41Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));
        System.out.println(getTheSumOfSquareOfOdds4(nums));
        System.out.println(getTheSumOfSquareOfOdds5(nums));

        System.out.println(getMultiplicationOfSqueareOfEvens(nums));

        System.out.println(getTheSumOfEvenMaxAndOddMin(nums));

        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(nums));
    }

    //Example 1: Verilan bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums){

        return  nums.
                stream().
                filter(t -> t%2!=0).
                map(t -> t*t).
                reduce(0,(t,u)->t+u);
    }

    public static int getTheSumOfSquareOfOdds2(List<Integer> nums){

        return  nums.
                stream().
                filter(t -> t%2!=0).
                map(t -> t*t).
                reduce(0, Math::addExact);//Class ismi :: Method ismi ==> Method Reference
        //(bir seyin birkac yontemi(method referencesi) olabilir)
    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums){

        return  nums.
                stream().
                filter(t -> t%2!=0).
                map(t -> t*t).
                reduce(Math::addExact).//orda "0" i tutma sebebimiz int olmamasiydi. "get()" ile bunu giderdik.
                get();//Class ismi :: Method ismi ==> Method Reference
        //(bir seyin birkac yontemi(method referencesi) olabilir)
    }

    public static int getTheSumOfSquareOfOdds4(List<Integer> nums){

        return  nums.
                stream().
                filter(t -> t%2!=0).
                map(Utils::getSquare).//ihtiyaciniz olan method Java Class'larda yoksa
                //Utils Class olusturup icine ihtiyaciniz olan method'u olusturunuz ve method reference kullaniniz.
                        reduce(Math::addExact).
                get();
    }
    public static int getTheSumOfSquareOfOdds5(List<Integer> nums){

        return  nums.
                stream().
                filter(Utils::isOdd).//Bunuda Utils de yaptik
                map(Utils::getSquare).//ihtiyaciniz olan method Java Class'larda yoksa
                //Utils Class olusturup icine ihtiyaciniz olan method'u olusturunuz ve method reference kullaniniz.
                reduce(Math::addExact).
                        get();//get() method'u Optional<Integer> i Integer'a cevirir
    }

    //Example 2: Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz
    public static int getMultiplicationOfSqueareOfEvens(List<Integer> nums){

        return nums.
                stream().
                filter(t -> t%2==0).
                map(t -> t*t).
                distinct().//burda kullanmamizin sebebi sayinin "-"(negatif) olma ihtimalidir
                reduce(1,(t,u)->t*u);
    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minumum degerinin
    //toplamini hesaplayan method olusturunuz

    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums){

        int maxEven = nums.
                stream().
                distinct().
                filter(t -> t%2==0).
                reduce((t,u) -> t>u ? t : u).
                get();//Optinal<Integer> ı normal int e cevirdik

        int minOdd = nums.
                stream().
                distinct().
                filter(t -> t%2!=0).
                reduce((t,u) -> t<u ? t : u).
                get();

        return maxEven + minOdd;
    }

    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri ile tek sayi olan elemanlarin
    //8 den buyuk minumum degerinin toplamini hesaplayan method olusturunuz
    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){

        int maxEven = nums.
                stream().
                distinct().
                filter(t -> t%2==0 && t<7).
                reduce((t,u) -> t>u ? t : u).
                get();

        int minOdd = nums.
                stream().
                distinct().
                filter(t -> t%2!=0 && t>8).
                reduce((t,u) -> t<u ? t : u).
                get();

        return maxEven + minOdd;
    }


}
