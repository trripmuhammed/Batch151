package day09KStringManipulation;

public class IfStatement2 {
    public static void main(String[] args) {
        //INTERVİEW QUESTİONS USA QA
        //String str ="abbccdc";
        //metindeki tekrarsız karakterleri ekrana yazdırınız
        String str = "aac";


        char ch = str.charAt(0);
        if(str.indexOf(ch) == str.lastIndexOf(ch)){
            System.out.println("tekrarsız");
        }
        else {
            System.out.println("tekrarlı");
        }
        char ch1 = str.charAt(1);
        if(str.indexOf(ch1) == str.lastIndexOf(ch1)){
            System.out.println("tekrarsız");
        }
        else {
            System.out.println("tekrarlı");
        }
        char ch2 = str.charAt(2);
        if(str.indexOf(ch2) == str.lastIndexOf(ch2)){
            System.out.println("tekrarsız");
        }
        else {
            System.out.println("tekrarlı");
        }
        //sayi pozitif ise ekrana pozitif yazzdıran program yazınız
        int num = 20;
        if(num>0){
            System.out.println("positive");
        }


    }
}
