package CoffeMachine;

import java.util.HashMap;
import java.util.Scanner;

public class Procress {

    public Procress(){
        System.out.println("Hangi kahveyi istersiniz?");
    }

    public HashMap coffeList(){
        HashMap<String, Integer> coffeList = new HashMap<>();

        coffeList.put("Türk kahvesi",20);
        coffeList.put("Filtre Kahve",15);
        coffeList.put("Espresso",10);

        return coffeList;
    }
    public void chooseCoffe(String coffeName){
        //coffeList();
        int i = 1;
        while(i == 1) {
            if(coffeName.replaceAll("[a-zA-Z0-9]","").length() > 0) {
                throw new IllegalArgumentException("Kahve adinda harf ve sayi disinda karakter giremessiniz");
            }
            coffeName = coffeName.toLowerCase();
            switch (coffeName) {
                case "turk kahvesi", "filtre kahve", "espresso" -> {
                    System.out.println(coffeName + " hazirlaniyor");
                    i = 0;
                }
                default -> System.out.println("Hatalı tuşlama yaptınız.");
            }
        }
    }

    public void giveSugar(String yesNo){
        Scanner input = new Scanner(System.in);
        yesNo = yesNo.toLowerCase();
        if(yesNo.equals("evet")){
            System.out.println("Kaç tane şeker olsun?");
            int sugerNumber = input.nextInt();
            System.out.println(sugerNumber + " Şeker ekleniyor");
        }else{
            System.out.println("Şeker eklenmiyor");
        }
    }

    public void coffeSize(String size){
        int i=0;
        while(i == 0) {
            switch (size) {
                case "buyuk", "orta", "kucuk" -> {
                    System.out.println("Kahveniz " + size +" boy hazirlaniyor ");
                    i = 1;
                }
                default -> System.out.println("Yanliş boyut girdisi,tekrar deneyiniz.");
            }
        }
    }


}
