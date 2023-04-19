package day18constructorsstatickeyword;

public class StudentStatic {
    //static de degisimi herkes fark eder(hepsi için değişir)
    /*
    1)"static" "class member'lar(veriable + method + constructor + code blocks) tum object'ler tarafından paylaşılır
    2)"static" "class member'lardaki degisiklikler tüm object'ler tarafından otomatik olarak görülür"
    3)"static" "class member'lar gokteki ay'in dunyaya baglı oldugu gibi class a baglıdırlar."
    Bu yüzden "ststşc veriable'lara "class veriable" da denir.
    4)static cagrılırken obje gerekmez tavsiye de edilmez sadece class ismi yeter
    method içinde geçerlidir
     */
    public static int numOfRegisteredStd=0;
    public int num=0;
    public StudentStatic() {
        num++;
        numOfRegisteredStd++;
    }
    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic();
        StudentStatic s2 = new StudentStatic();
        StudentStatic s3 = new StudentStatic();
        System.out.println(s1.num);//istedigimiz s i yazalım num hep 1
        System.out.println(s1.numOfRegisteredStd);//static oldugu icin 3 tane obje yazdıgımızda 3 kere artar
    }
}
