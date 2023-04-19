package Computer;

public class Asus extends Computer{

    @Override
    public void bios() {
        System.out.println("Welcome to asus bios");
    }
    public void safe(){
        System.out.println("Asus is safe");
    }
    public Asus(){
        start();
    }
    public Asus(String Crash){
        this();
        System.out.println("Asus is crashing while trying to start");
    }
}
