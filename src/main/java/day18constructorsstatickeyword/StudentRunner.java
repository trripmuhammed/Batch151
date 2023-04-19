package day18constructorsstatickeyword;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {
        //static olan numOfRegistered veriable'ını çağırmak için sadece class ismini kullandık
        //!!obje oluşturmadık
        System.out.println(StudentStatic.numOfRegisteredStd);
        //static olmayan num veriable'ını çağırmak için obje oluşturduk
        StudentStatic s1 = new StudentStatic();
        System.out.println(s1.num);

    }
}
