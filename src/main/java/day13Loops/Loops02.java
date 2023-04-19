package day13Loops;

import static java.lang.Math.pow;



public class Loops02 {
    public static void main(String[] args) {
        String a="Pwd12?Ab";
        for(int i = 0; i <a.length();i++ ){
           char ch=a.charAt(i);
           if(ch>='a' && ch<='z'){
               continue;
           }else{
               System.out.print(ch);
           }
        }
        //break ile continue arasındaki fark
        //break switch in dısına cıkmak veya loop u kırmak için kullanılırken
        //continue ise loop yaparken bazı elemanları işleme sokmamak için kullanılır

        //Bir String i ters çeviren kodu yaz
        System.out.println("");
        String b="Java";
        String ters="";
        for(int i=b.length()-1;i>=0;i--) {
            ters=ters+b.substring(i,i+1);
            }
        System.out.println(ters);
        //2.way
        String u="Java";
        String ters2="";
        for(int i=u.length()-1;i>=0;i--) {
            ters2=ters2+u.charAt(i);
            }
        System.out.println(u);
        System.out.println(ters2);
        //bir tamsayının rakamlarının toplamını veren kodu yaz
        int c=-578;
        c=Math.abs(c);//negatif sayıyi pozitif'e cevirir
        int result=0;
        for(int i=0;i<3;i++,c/=10) {//veya i yerine 578 yazarak da yapabiliriz
            result+=c%10;
        }
        System.out.println(result);
    }
    }

