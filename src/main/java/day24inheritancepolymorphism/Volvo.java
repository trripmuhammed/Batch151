package day24inheritancepolymorphism;

public class Volvo extends Car{

    public void secure(){
        System.out.println("Volvo is the most secure car in the world");
    }

    @Override//Bu bir "annotation" dır .Bu @Override annotation'ı Override kurallarını konrtol eder.Kural ihlalinde söyler.İsteğe bağlıdır.
    //bunu yazmassak mesela method ismini degistirirsek veya farklı parametreler girersek uyarı vermez ama yanlıs yazım olur.
    public void move() {
        //super.move(); Java'nın bunu otomatik koymasının nedeni belki olan method'un üzerine ekleme yapma ihtimalimizdir.
        System.out.println("Volvo moves");
    }//methodu class'a göre özelleştirdik

}
