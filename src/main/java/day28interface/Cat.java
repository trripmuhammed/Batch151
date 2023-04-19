package day28interface;

public class Cat implements Animal {
    @Override
    public void eat(){
    }
    @Override
    public void drink(){
    }

    public static void main(String[] args) {
        /*
        Interface'lerde veriable cagirirken interface adını kullanarak cagırın
        bu hem static veriable olmanın geregidir hemde okunurlulugu arttırır.
         */
        System.out.println(Animal.age);
        System.out.println(Mammel.feedBaby);
        System.out.println(Mammel.age);
        System.out.println(age);//burda ilk kendisinde sonra parent'ında eger ordada
        //yoksa üstlere bakmaya devam edecek.


    }
}
