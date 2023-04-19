package day03scanner;

public class Runner {
    public static void main(String[] args) {
        //new keyword u sıfırdan object olusuturur
        // Constructor nesne olusturmak icin kullanılır
        // Class ismi + Object = new Constructor
        Car myCar = new Car();

        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket(); //zaten içi print oldugundan sout icine yazmayız
        myCar.dur();
        //
        Student  jack  = new Student();
        System.out.println("Jack.grade = " + jack.grade);
        System.out.println("Jack.address = " + jack.address);
        System.out.println("jack.name = " + jack.name);

        jack.feed();
        jack.study();
    }
}
