package day24inheritancepolymorphism;

public class toyota extends Car{
    public void hybrid(){
        System.out.println("Toyota ");
    }
    public toyota(){
        this("Pirius");//2.Toyota constructor'a geçişimizi sağladı
        //this aynı class constructorlar icin super se parentlar için
        System.out.println("Toyota constructor 1");
    }
    public toyota(String s){
        super(7);
        //super(5); //2.Car Constructor'ın icine int tanımlamıstık bunu kullanarak
        //2.Car Constructor'ını calıstırıyoruz
        //eger bunu parametresiz constructor a yazsaydık Car Construct 1 i kullanırdı toyotanınsa ikisini kullandıgından burdaki calısır ve 1 i kullanır
        //super() bu bizi parent ı varsa ona götürür.Bu yüzden parent'ı varsa
        //once parent'ın contructor'ı çalışır.Bu gizlidir ve her constructer da vardır
        System.out.println("Toyota constructor 2");
    }

}
