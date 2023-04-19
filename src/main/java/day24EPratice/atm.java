package day24EPratice;

public class atm {
    protected static int bakiye = 10000;

    public void paracek(int cekmiktar) {
        if(cekmiktar>bakiye){
            System.out.println("Geçersiz miktar");
        }else{
            bakiye-=cekmiktar;
        }}
    public void parayatir (int yatirmiktar) {
            bakiye+=yatirmiktar;
        }

}
