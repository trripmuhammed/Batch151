package WebBrowser;

import MyApplications.Application02;

import java.util.Scanner;

import static MyApplications.Application02.MetinRegulator;
import static WebBrowser.studentSystem.StudentEnter;
import static WebBrowser.studentSystem.StudentProcess;

public class WebBrowserRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to Browser,Please enter a site name");
        System.out.println("Site names: Metin düzenleyici \n öğrenci sistem \n araba satınal" );
        Scanner input = new Scanner(System.in);
        String choose= input.nextLine().toLowerCase();
        switch(choose){
            case "metin düzenleyici":
                MetinRegulator();
                break;
            case "öğrenci sistem":
                StudentEnter();
                StudentProcess();
                break;
            case "araba satınal":

                break;
            default:
                System.out.println("Invalid choose them");
        }
    }
}
