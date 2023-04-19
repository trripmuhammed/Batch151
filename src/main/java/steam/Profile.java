package steam;

import java.util.Random;

public class Profile extends Steam{
    @Override
    public void exit() {
        System.out.println("Your exiting from Profile");
    }
    private String name = "Steam";

    public void nameChance(String name) {
        System.out.println("Pleas enter a name" + name);
        this.name = name;
    }
    private String password = "12345678";
    public void passwordChance(String password) {
        this.password = password;
        System.out.println("Pleas enter a password" + password);
    }

    private int fireCode = 0;
    private void fireCodeGenerator() {
        Random rand = new Random();
        fireCode = rand.nextInt(0,100000000);
    }
    public int getFireCode() {
        return fireCode;
    }

}
