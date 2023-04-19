package day26Abstraction;
/*
    1)Bazen parent class'daki method'un body'si hicbir child tarafından kullanılmaz
    Bu durumda parent'daki method'a body yazmak hic kullanılmadıgından mantıklı değildir.
    Bizde o method'a body yazmayız.
    2)Body'si yazılmayan method'a abstract method denir.
    Abstract ingilizce'de vücutsuz veya soyut demektir
    3)Method'un body sini yazmayınca Java hata verir.Bizde abstract keyword'unu kullanarak Java'ya
    bu method'un body'si olmayacak deriz.
    4)Abstract keyword'unu kullanınca elde ettigimiz abstract method normal class'lara konulamaz
    Bu yüzden class'ıda abstract yaparız.
    5)Parent'taki method abstract ise tüm child class'lar o method'u Override etmek zorundadır
    Bu yüzden tüm child'lar icin mecburi olmasını istediğimiz fonksiyonları abstract yapmak mantıklıdır.
    6)Body'si olan method'lar(Concrete(Somut) Method) abstract class'ların icine yazılabilir
    abstract method'lar concrete class'ların icine yazılamazlar.
    7)Abstract keyword ile method body bir method'da aynanda kullanılamaz.
    8)Abstract class'ların icinde abstract method'lar olur.Abstract method'lar body'si olmadıgından eksik method'lar
    gibi düşünülebilir.Yani abstract class icinde eksik bir yapı barindirir.Biz abstract class'da object üretirsek
    abstract class icindeki eksiklik object'e yansir ve object eksigi olan bir object olur
    Java bunu istemez cünkü eksik object eksik is yapar.
    Buda application'un yanlıs calısmasına sebep olur.Java application'ı korkumak icin abstract class'lardan
    object uretilmesini engellemistir
    9)Abstract class'ların construct'ı vardır ancak object olusturamazlar.
   10)"final" method'lar "abstract" olamazlar.
   11)private method'lar "abstract" olamazlar.
   12)Abstract class'ın abstract child'i veya concrete child'i olabilir.
 */
/*
    (meshur interview sorusu) "final" keyword'u acıklarmısınız?
    "final" keyword 1)Veriable'larda 2)method'larda 3)class'larda kullanılır.

    1)Veriable'larda kullanıldıgında a)O veriable'a kesinlikle deger ataması yapılmalıdır.
                                     b)ilk atanan değer değiştirilemez.

    2)Method'larda kullanıldıgında  a)O method'un body'si degistirilemez
                                    b)O method Override edilemez

    3)Class'larda kullanıldıgında a)O class'ın child class'i olamaz.Ama kendisi child olabilir.


 */
public abstract class Courses {
    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }

    /*private abstract void sum(); */

    public final /* abstract */ void multiply(){
        System.out.println("Do multiplication");
    }
}
