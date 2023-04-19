package MyApplications;

import java.util.Scanner;

public class Application02 {
    public static void MetinRegulator() {
        System.out.println("Metin düzenleyiciye hoş geldiniz.Lütfen metin giriniz");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println("1) hatfleri büyütme \n2) harfleri küçültme");
        System.out.println("3) istenilen harfi alma \n 4) metin uzunlugu bulma \n 5) istenilen aralığı alma");
        System.out.println("6) istenilen kelimeyi icerip icermemesini kontrol etme ");
        int choose = input.nextInt();
        switch (choose){
            case(1):
                String textUpper = text.toUpperCase();
                System.out.println(textUpper);
                break;
            case(2):
                String textLower = text.toLowerCase();
                System.out.println(textLower);
                break;
            case(3):
                System.out.println("hangi sıradaki karakteri almak istiyorsunuz?(\"0\" baüşangıç noktasıdır)");
                int pointer = input.nextInt();
                char textTakeC = text.charAt(pointer);
                System.out.println(textTakeC);
                break;
            case(4):
                int textLength = text.length();
                System.out.println(textLength);
                break;
            case(5):
                System.out.println("Lütfen istediğiniz aralıgı giriniz.(\"0\")başlangıç noktasıdır");
                int pointer2 = input.nextInt();
                int pointer3 = input.nextInt();
                String textSub = text.substring(pointer2,pointer3);
                break;
            case(6):
                String controlKey = input.next();
                boolean control = text.contains(controlKey);
                System.out.println(control);
                break;
        }
    }
}
