package CoffeMachine;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Procress coffe = new Procress();

        System.out.println(coffe.coffeList());

        Scanner input = new Scanner(System.in);

        String coffeName = input.nextLine();

        try{
            coffe.chooseCoffe(coffeName);
        }catch (IllegalArgumentException e){
            System.out.println("Hatalı tuşlama yaptınız...");
            coffe.chooseCoffe(coffeName);
        }


        System.out.println("Şeker istermisiniz");
        String choose = input.next();
        coffe.giveSugar(choose);

        System.out.println("Kahveniz hangi boyutta olsun?  \nBuyuk\nOrta\nKucuk");
        choose = input.next();
        coffe.coffeSize(choose);


    }
}
