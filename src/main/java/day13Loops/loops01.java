package day13Loops;

public class loops01 {
    public static void main(String[] args) {
        for(int i=21;i<181;i++) {
            if(i%4==0 && i%6==0)
                System.out.print(i+" ");
        }
        System.out.println("");
        String a="miami";
        for(int i=0;i<a.length();i++) {
            String ch=a.substring(i,i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
        }
        System.out.println("");
        String b="Hello Java";
        for(int i=0;i<b.length();i++) {
            char ch=b.charAt(i);
            if(ch=='a'){
                break;
            }else{
                System.out.print(ch);
            }
        }
        /*2.yol(benim yolum)
        int b1=b.indexOf('a');
        String b2=b.substring(0,b1);
        System.out.println(b2);*/

    }
}
