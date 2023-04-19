package day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02(){
        System.out.println("Constructor 1");
    }
    public StaticNonStaticBlocks02(int price){
        System.out.println("Constructor 2");
    }
    public StaticNonStaticBlocks02(String name){
        System.out.println("Constructor 3");
    }
    public StaticNonStaticBlocks02(boolean isOld){
        System.out.println("Constructor 4");
    }
    /*
    non-static block constructor'larda calıştırılmas gereken ortak kodları içerir
    non-static block içine yazılan kodlar her contractor için çalışır
    1 den fazla non-static block varsa üsteki önce çalışır
     */
    {
        System.out.println("I am Constructor - ilk");
    }//non-static code block
    {
        System.out.println("I am Constructor - ikinci");
    }
     public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);
    }
}
