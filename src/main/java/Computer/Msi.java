package Computer;

public class Msi extends Computer{

    @Override
    public void bios() {
        System.out.println("Welcome to msi bios");
    }
    public void fast() {
        System.out.println("Msi is fast");
    }
    public void powerful() {
        System.out.println("Msi is powerful");
    }
    public Msi(){
        start();
    }
    public Msi(String Crash){
        super();
        System.out.println("Msi is crashing while trying to start");
    }

}
