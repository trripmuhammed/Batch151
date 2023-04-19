package day24inheritancepolymorphism;

public class CarRunner {
    public static void main(String[] args) {

        toyota t1 = new toyota();//icine string bir karakter yazsaydıdk ikinci constructor ı kullanırdı
//      t1.model="Prius";
//      System.out.println(t1.model);
        Honda h1 = new Honda();

        Volvo v1 = new Volvo();
        v1.move();


    }
}
