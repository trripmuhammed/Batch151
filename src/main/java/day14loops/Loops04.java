package day14loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {
        //kullanıcı username ve password girdin
        //3 kereden fazla yanlış girerse "Your account has blocked" yazısı alsın
        //3 kereye kadar yanlış girerse "Invalid username or password,try again" mesajı alsın
        //dogru girerse "Welcome to your account" mesajı alsın
        Scanner input = new Scanner(System.in);
        String validUserName = "techpro123";
        String validPassword = "Education12?";
        int counter=0;
        do{
            if (counter == 3) {
                System.out.println("Your account has blocked");
                break;
            }
            System.out.println("Please enter your username");
            String username = input.next();

            System.out.println("Please enter your password");
            String password = input.next();
            counter++;
            if(username.equals(validUserName) && password.equals(validPassword)){
                System.out.println("Welcome to your account");
                break;
            }else {
                System.out.println("Invalid username or password,try again");
                System.out.println((3-counter)+"right left");
            }
        }while(true);
                        double turkishLira=17948;
                        double dollar=953.9;
                        double sterlin=792.58;
                        String choose1;
                do{
                    System.out.println("Please choose the rate you want\nDollar \t Turkish Lira \t Sterlin \nif you want exit the program enter 112");
                    String rate = input.next();

                    switch(rate){
                        case "112":
                            System.out.println("Exiting");
                            System.exit(0);
                            break;

                        case "dollar":
                            System.out.println("Welcome again,Please choose your process\nwithdraw money \t deposit money \t balance inquiry");
                            input.nextLine();
                            String process = input.nextLine().toLowerCase();
                            switch(process){
                                case "112":
                                    System.out.println("Exiting");
                                    System.exit(2);
                                    break;
                                case "withdraw money":
                                    System.out.println("Please enter the amount you want to withdraw");
                                    double amount = input.nextDouble();
                                    if(amount%5!=0){
                                        System.out.println("Our machine does not issue coins,Please try again");
                                        break;}
                                    if(amount>dollar || amount<=0){
                                        System.out.println("Invalid amount detected,Please try again");
                                        break;
                                    }else{
                                        System.out.println("You have successfully withdrawn "+amount+" dollar\n Do you want any processing?(if you want enter yes)");
                                        choose1=input.next();
                                        if(choose1.equalsIgnoreCase("yes")){
                                            break;
                                        }else {
                                            System.out.println("Exiting");
                                            System.exit(1);
                                        }
                                    }break;
                                case "deposit money":
                                    System.out.println("Please enter the amount you want to deposit");
                                    amount = input.nextDouble();
                                    if(amount%5!=0){
                                        System.out.println("Our machine does not issue coins,Please try again");
                                        break;}
                                    if(amount<=0 || amount>5000){
                                        System.out.println("Invalid amount detected,Please try again(your daily limit:5000)");
                                        break;
                                    }else{
                                        System.out.println("You have successfully deposited "+amount+" dollar\n Do you want any processing?");
                                        choose1=input.next();
                                        if(choose1.equalsIgnoreCase("yes")){
                                            break;
                                        }else {
                                            System.out.println("Exiting");
                                            System.exit(1);}
                                    }break;
                                case "balance inquiry":
                                    System.out.println("Your balance : "+dollar);
                                    System.out.println("Do you want any processing?");
                                    choose1=input.next();
                                    if(choose1.equalsIgnoreCase("yes")){
                                        break;
                                    }else {
                                        System.out.println("Exiting");
                                        System.exit(1);}
                                default:
                                    System.out.println("Invalid process type");
                                    System.exit(1);
                            }break;

                        case "turkish lira":
                            System.out.println("Welcome again,Please choose your process\n withdraw money \t deposit money \t balance inquiry \nif you want exit the program enter 112");
                            process = input.nextLine().toLowerCase();
                            switch(process){
                                case "112":
                                    System.out.println("Exiting");
                                    System.exit(0);
                                    break;
                                case "withdraw money":
                                    System.out.println("Please enter the amount you want to withdraw");
                                    double amount = input.nextDouble();
                                    if(amount%5!=0){
                                        System.out.println("Our machine does not issue coins,Please try again");
                                        break;}
                                    if(amount<=0 || amount>turkishLira){
                                        System.out.println("Invalid amount detected,Please try again");
                                        break;
                                    }else{
                                        System.out.println("You have successfully withdrawn "+amount+" turkish lira\n Do you want any processing?(if you want enter yes)");
                                        choose1=input.next();
                                        if(choose1.equalsIgnoreCase("yes")){
                                            break;
                                        }else {
                                            System.out.println("Exiting");
                                            System.exit(1);}
                                    }break;
                                case "deposit money":
                                    System.out.println("Please enter the amount you want to deposit");
                                    amount = input.nextDouble();
                                    if(amount%5!=0){
                                        System.out.println("Our machine does not issue coins,Please try again");
                                        break;}
                                    if(amount<=0 || amount>5000){
                                        System.out.println("Invalid amount detected,Please try again(your daily limit:5000)");
                                        break;
                                    }else{
                                        System.out.println("You have successfully deposited "+amount+" turkish lira\n Do you want any processing?(if you want enter yes)");
                                        choose1=input.next();
                                        if(choose1.equalsIgnoreCase("yes")){
                                            break;
                                        }else {
                                            System.out.println("Exiting");
                                            System.exit(1);}
                                    }continue;
                                case "balance inquiry":
                                    System.out.println("Your balance : "+turkishLira);
                                    System.out.println("Do you want any processing?");
                                    choose1=input.next();
                                    if(choose1.equalsIgnoreCase("yes")){
                                        break;
                                    }else {
                                        System.out.println("Exiting");
                                        System.exit(1);}
                                default:
                                    System.out.println("Invalid process type");
                                    System.exit(1);
                            }break;
                        case "sterlin":
                            System.out.println("Welcome again,Please choose your process\n withdraw money \t deposit money \t balance inquiry \nif you want exit the program enter 112");
                            process = input.nextLine().toLowerCase();
                            switch(process){
                                case "112":
                                    System.out.println("Exiting");
                                    System.exit(0);
                                    break;
                                case "withdraw money":
                                    System.out.println("Please enter the amount you want to withdraw");
                                    double amount = input.nextDouble();
                                    if(amount%5!=0){
                                        System.out.println("Our machine does not issue coins,Please try again");
                                        break;}
                                    if(amount<=0 || amount>sterlin){
                                        System.out.println("Invalid amount detected,Please try again");
                                        break;
                                    }else{
                                        System.out.println("You have successfully withdrawn "+amount+" sterlin\n Do you want any processing?(if you want enter yes)");
                                        choose1=input.next();
                                        if(choose1.equalsIgnoreCase("yes")){
                                            break;
                                        }else {
                                            System.out.println("Exiting");
                                            System.exit(1);}
                                    }break;
                                case "deposit money":
                                    System.out.println("Please enter the amount you want to deposit");
                                    amount = input.nextDouble();
                                    if(amount%5!=0){
                                        System.out.println("Our machine does not issue coins,Please try again");
                                        break;}
                                    if(amount<=0 || amount>5000){
                                        System.out.println("Invalid amount detected,Please try again(your daily limit:5000)");
                                        break;
                                    }else{
                                        System.out.println("You have successfully deposited "+amount+" sterlin\n Do you want any processing?");
                                        choose1=input.next();
                                        if(choose1.equalsIgnoreCase("yes")){
                                            break;
                                        }else {
                                            System.out.println("Exiting");
                                            System.exit(1);}
                                    }break;
                                case "balance inquiry":
                                    System.out.println("Your balance : "+sterlin);
                                    System.out.println("Do you want any processing?");
                                    choose1=input.next();
                                    if(choose1.equalsIgnoreCase("yes")){
                                        break;
                                    }else {
                                        System.out.println("Exiting");
                                        System.exit(1);}
                                default:
                                    System.out.println("Invalid process type");
                                    System.exit(1);
                            }break;
                        default:
                            System.out.println("Invalid rate type");
                            System.exit(1);
                    }
                }while(true);
    }
}
