package day23KPratice;

public class MonkeyAliveInterview {
    public static void main(String[] args) {
        int numberOfBananas = 165;
        int survivalDays=1;
        boolean monkeyAlive = true;
        do{
            if(numberOfBananas<4){
            monkeyAlive = false;
            System.out.println("Bugun " + survivalDays+ ". gün. Yeterli muz kalmadı Maymun rahmetli");
            break;
        }else{
            System.out.println("Bugun " + survivalDays+ ". gün. Maymun hala yaşıyor.");
        }
            numberOfBananas-=4;
            System.out.println("Kalan muz sayısı: "+ numberOfBananas);

            survivalDays++;
        }while(true);


        /*
        do{
            survivalDays++;
            numberOfBananas-=4;
        }while(numberOfBananas>4);
        System.out.println("Bugun "+survivalDays+". gün");*/
    }
}
