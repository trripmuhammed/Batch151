package day23KPratice;

public class ButceRunner {
    public static void main(String[] args) {

        Butce baba = new Butce();
        System.out.println("Maaş öncesi bütce: "+Butce.butce);
        baba.maasAl(30000);
        System.out.println("Maaş sonrası bütce: "+Butce.butce);
        baba.harclikAl(100);
        baba.harcliktanHarca(70);
        System.out.println("Baba Bütce: "+Butce.butce);

        Butce anne = new Butce();
        anne.maasAl(50000);
        anne.harclikAl(500);
        anne.harcliktanHarca(500);
        System.out.println("Anne Bütce: "+Butce.butce);

        Butce cocuk = new Butce();
        cocuk.harclikAl(200);
        cocuk.harcliktanHarca(180);
        System.out.println("Cocuk Bütce: "+Butce.butce);
        System.out.println("Cocuk Haclık: "+ cocuk.harclik);

    }
}
