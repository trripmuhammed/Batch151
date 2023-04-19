package day22stringbuilder;

import day23inheritance.Animal;
import day23inheritance.Cat;

public class StudentRunner extends Animal {
    public static void main(String[] args) {

        Student std1 = new Student();
        System.out.println(std1.stdName);

        System.out.println(std1.age);//aynı package oldugundan default'u burda kullanabiliyoruz

        System.out.println(std1.salary);

        Cat c2 = new Cat();

        //normalde gösteriyormus   c2.eat();
    }
}
