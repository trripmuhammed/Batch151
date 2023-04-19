package steam;

import java.util.Scanner;

public class SteamRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to Steam which processes do you want to do\nMarket \nLibary \nProfile");
        Scanner input = new Scanner(System.in);
        while(true){
        String choose = input.next().toLowerCase();
        switch (choose) {
            case "market" -> {
                Market user = new Market();
                System.out.println("Please select your procress");
                    switch (input.next().toLowerCase()) {
                        case "showwhitelist" -> user.whiteList();
                        case "addwhitelist" -> user.addWhiteList(input.next());
                        case "buy" -> user.buy(input.next());
                        case "removewhitelist" -> user.remove(input.next());
                        case "exit" -> user.exit();
                        default -> System.out.println("Invalid choose");
                    }
            }
            case "libary" -> {
                System.out.println("Please select your procress");
                Libary user2 = new Libary();
                switch (input.next().toLowerCase()) {
                    case "startgame" -> user2.startGame();
                    case "exit" -> user2.exit();
                    default -> System.out.println("Invalid choose");
                }
            }
            case "profile" -> {
                System.out.println("Please select your procress");
                Profile user3 = new Profile();
                switch (input.next().toLowerCase()) {
                    case "chancename" -> user3.nameChance(input.next());
                    case "chancepassword" -> user3.passwordChance(input.next());
                    case "firecode" -> user3.getFireCode();
                    default -> System.out.println("Invalid choice");
                }
            }
            default -> System.out.println("Unknown choice");
        }
    }}
}
