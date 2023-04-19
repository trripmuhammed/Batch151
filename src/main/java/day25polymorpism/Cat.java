package day25polymorpism;

public class Cat extends Animal{

    @Override
    public void move() {
        System.out.println("Cats move");
    }

    @Override
    protected int add(int a, int b) {
        return super.add(a, b);
    }
    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return 2*(a + b);
    }

    /*@Override
    public double circleArea(double r) {
        return 3.14*r*r;
    } interview sorusu */
}
