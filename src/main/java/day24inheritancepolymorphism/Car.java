package day24inheritancepolymorphism;
/*
    1)Inheritance'da object olustururken constructor'lar yukarıdan(parent)
    asagıya(child) a dogru calısır
    2)Parent ve super eş anlamlaıdır child ve Sub eş anlamlıdır
    3)Super() her constructer'ın ilk satırında görünmez olarak bulunur
        isterseniz görünür şekildede yazabilirsiniz
    4)Super() sizi parent class'daki constructor'a tasır.
    5)this() sizi aynı class icindeki constructor lar arasında gezdirir
    6)"this" icinde bulundugunuz class'daki veriable'ları cagırmaya yarar
      "super" parent class'daki veriable'ları cagırmaya yarar
    7)Eger data type'ları arasında "IS-A" VE "HAS-A" iliskisi varsa bu data type'larına "COVARIANT" denir.
 */
/*
    1)Polymorphism ==> Coklu sekil
        Yani bir method'un farklı sekillerde karsımıza cıkması demektir
        Polymorphism = Overloading + Overriding
    2)Overriding parent class'daki method'u child class'in ihtiyaçlarına göre özelleştirerek kullanmak demektir.
    3)Overriding'de method'un body'si degistirilir.
    4)Overriding'de method signature'a( method ismi ve parametreler ) dokunulmaz.Dokunursanız Java hata verir.
 */
public class Car {

    public void move(){
        System.out.println("Cars move");
    }
    public void getBreak(){
        System.out.println("Cars break");
    }
    public void engine(){
        System.out.println("Cars have engine");
    }
    public String model = "Car";
    public int price = 0;

    public Car() {
        //super(); //gizlidir fakat istersek görünür yapabiliriz
        //super() bu bizi parent ı varsa ona götürür
        System.out.println("Car constructor 1");
    }
    public Car(int i){
        this();
        //super();
        System.out.println("Car constructor 2");
    }


}
