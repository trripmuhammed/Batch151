package MyApplications;

import java.util.Scanner;
import java.util.Random;

public class askHim {
    public static void main(String[] args) {
        System.out.println("Kişisel bilgi kaydediciye hoş geldiniz \n Lütfen adınızı sonra soyadınızı giriniz.");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        for(int i=0;i<5;i++) {
            String name = input.nextLine();
            String surname = input.next();
            boolean nameCharacter = name.replaceAll("[a-zA-Z]","").length()>0;//karakter içeriyor mu
            boolean surnameCharacter = surname.replaceAll("[a-zA-Z]","").length()==0;//karakter içeriyor mu
            if(nameCharacter && surnameCharacter) {
                char shortName = name.toUpperCase().split(" ")[0].charAt(0);
                char shortSecondName = name.toUpperCase().split(" ")[1].charAt(0);
                char shortSurname = surname.toUpperCase().charAt(0);
                System.out.println("Başarılı ad girişi \t \t"+shortName+shortSecondName+shortSurname);
                break;
            }
            else
                System.out.println("Başarısız giriş denemesi");
        }
        System.out.println("lütfen email adresinizi giriniz");
        for(int k=0;k<5;k++) {
            input.nextLine();
            String email = input.nextLine();
            boolean emailCom = email.startsWith(".com",email.length()-4);//startsWith de kullanılabilir
            if(emailCom==true){
                System.out.println("Başarılı email girişi");
                break;
            }
            else {
                System.out.println("Başarısız giriş denemesi");
            }
        }
        System.out.println("Lütfen adresinizi giriniz");
        for(int j=0;j<5;j++) {
            String address = input.next();
            int addressEIdx =  address.indexOf('e')+2;//telefona gelecek kod için kullanılacak
            System.out.println("addressEIdx = " + addressEIdx);
            System.out.println("email onayı için adresinizdeki ilk e harfinin bulunduğu sıra sayısına +1 eklenmiş halini aşağıya giriniz.\n adreste e yoksa 1 giriniz");
            int emailConfirm = input.nextInt();
            if(emailConfirm==addressEIdx){
                System.out.println("Başarılı adres girişi");
                break;
            }
            else {
                System.out.println("Başarısız giriş denemesi");
            }
        }
        System.out.println("Lütfen telefon numaranızı başında 0 olmadan giriniz");
        for(int g=0;g<5;g++) {
            String phoneNumber = input.next();
            boolean phoneNumberControl1 = phoneNumber.length() == 10;
            boolean phoneNumberControl2 = phoneNumber.replaceAll("[0-9]", "").length()==0;
            if (phoneNumberControl1 && phoneNumberControl2 == true) {
                System.out.println("Başarılı telefon numaranız girişi");
                System.out.println("Lütfen telefonunuza gelen onay kodunu giriniz");
                int phoneCode = rand.nextInt();
                System.out.println(phoneCode);
                int phoneCodeConfirm = input.nextInt();
                if (phoneCodeConfirm != phoneCode) {
                    System.out.println("Başarısız kod girişi lütfen telefon numaranızı tekrar giriniz");
                    continue;
                } else {
                    break;
                }
            } else {
                System.out.println("Başarısız giriş denemesi");
            }
        }
            System.out.println("Bizi tercih ettiğiniz için teşekkürler");
    }
}
