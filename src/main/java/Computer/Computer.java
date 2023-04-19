package Computer;

public abstract class Computer {
    public void start(){
        System.out.println("Welcome to Computer");
    }
    public void shutdown(){
        System.out.println("Computer Shutdown");
        System.exit(1);
    }
    public abstract void bios();


}
