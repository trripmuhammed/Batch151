package day18constructorsstatickeyword;

public class CarRunner {
    public static void main(String[] args) {
        Car c1= new Car();
        Car c2= new Car("Mercedes","C300",2023,300000);
        Car c3= new Car("Audi","R8",2023,500000);
        Car c4= new Car("BMW");
        System.out.println(c2.model);
        System.out.println(c2.price);/*mesela Car class ındaki this.price=price;
        silersek ilk başta price a 10000 verdiğimizden bize 10000 verir.Fakat yazarsak
        burda giriğimiz değeri alırız
        */
    }
}
