package Computer;

public class acer extends Computer {
    @Override
    public void bios() {
        System.out.println("Welcome to acer bios");
    }
    public void slow(){
        System.out.println("Acer is slow");
    }

    public acer() {
        start();
    }
    public acer(String Crash){
        super();
        System.out.println("Acer is crashing while trying to start");
    }
}
