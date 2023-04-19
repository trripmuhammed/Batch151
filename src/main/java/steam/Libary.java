package steam;

import java.util.Scanner;

public class Libary extends Steam{

    @Override
    public void exit() {
        System.out.println("Your exiting from Libary");
    }
    public void startGame() {
        System.out.println("Please enter a game name to start");
        Scanner input = new Scanner(System.in);
        String gamename = input.next();
        Market m1 = new Market(gamename);
        int counter = 1;
        System.out.println(m1.buyList.size());
        for( String w : m1.buyList){
            if(w.equals(gamename)){
                System.out.println("Your game has been successfully started");
                break;
            }else if(counter==m1.buyList.size()){
                System.out.println("We couldn't found the game");
            }
            counter++;
            System.out.println("over1");
        }
        System.out.println("over2");
    }


}
