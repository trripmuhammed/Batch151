package test1;
import java.util.Scanner;
public class ScannerChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen maasınızı giriniz");

        int salary = input.nextInt();



        System.out.println("salary = " + salary);
        System.out.println("Lütfen erkekseniz e , kız iseniz k giriniz");
        char cinsiyet = input.next().charAt(0);//burda 0 ilk harfi alması için var
        System.out.println("cinsiyet = " + cinsiyet);


        System.out.println("Lütfen adınızı giriniz");
        input.nextLine();// (işe yaramadı) nextline bugunu gidermek için (satir atliyor)(yapmassak FirstName karsısındakı isim gözükmüyor)
        String fiirstName = input.nextLine();
        System.out.println("firstName = " + fiirstName);
        double a = input.nextDouble();
        System.out.println("a = " + a);

    }
}
