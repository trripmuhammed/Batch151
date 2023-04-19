package steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market extends Steam{

    @Override
    public void exit() {
        System.out.println("Your exiting from Market");
    }

    public Market(){
        System.out.println("Welcome to Steam Market");
    }

    public Market(String nameCorrect){
        System.out.println("The game is checking  " + nameCorrect);
    }
    public static List<String> whiteListMemory = new ArrayList<>();
    public void addWhiteList(String addgame){
        whiteListMemory.add(addgame);
        System.out.println("Your selections added to the whitelist");
        System.out.println(whiteListMemory);
    }
    public void whiteList(){
        System.out.println("White List :");
        System.out.println(whiteListMemory);
    }
    public List<String> buyList = new ArrayList<>();
    public void buy(String game){
        if(whiteListMemory.contains(game)) {
            buyList.add(game);
            System.out.println("Successfully buy");
        }else {
            System.out.println("Game isn't found");
        }
    }
    public void remove(String game){
        System.out.println("Which game you want to remove");
        whiteListMemory.remove(game);
        System.out.println("Successfully remove");
    }


}
