package day20ArrayListDayTime;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    /*
    Example 1:  Bir integer List'teli birbirine en yakın iki elemanı bulunuz
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        //Collections.sort methodu natural order(kücükten büyüge sıralama) yapar.
        Collections.sort(nums);
        System.out.println(nums);

        int minDiff=nums.get(1)-nums.get(0);
        for(int i=1;i<nums.size();i++){
            minDiff=Math.min(minDiff,nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);
        for(int i=1;i<nums.size();i++){
           if(minDiff==nums.get(i)-nums.get(i-1)){
            System.out.println(nums.get(i) + " and "+ nums.get(i-1));
        }
        }
    }
}
