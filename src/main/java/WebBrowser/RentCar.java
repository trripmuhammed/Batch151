package WebBrowser;

import java.util.List;
import java.util.Scanner;

public class RentCar {
    public static void CarList(){
        List<String> cars =List.of("BMW","AUDİ","MERCEDES","TOFAŞ","PORSCHE","HONDA");
        List<Integer> prices = List.of(20000,350000,500000,45000,14000);
    }
    public static void CarBegin(){
        System.out.println("Welcome to RentCar,Please select a car model\n BMW,AUDİ,MERCESED,TOFAŞ,PORSCHE,HONDA");
        Scanner input = new Scanner(System.in);
        String choose = input.next().toLowerCase();
        switch (choose){
            case "bmw":
                System.out.println();
                break;
            case "audi":
                break;
            case "mercedes":
                break;
            case "tofaş":
                break;
            case "porsche":
                break;
            case "honda":
                break;
            default:
                System.out.println("Invalid cars model name");
        }
    }
}
