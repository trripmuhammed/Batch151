package day25polymorpism;

public class Student {
    public String stdName = "Tom Hanks";

    public int age = 23;

    //Encapsulation nedir? Data saklamaktır.(Data hiding)
    //Data'yı nasıl saklarsın? Access Modifier'ini "private" yaparak.
    //Neden kullanırız? karışıklığı önler, güvenliği sağlar
    private String stdId = "AC2023102T";

    private double gpa = 3.87;

    private boolean successful = false;
    //Encapsulation yaptığımız data'yı istersek diğer class'lardan okuyabiliriz.
    //Nasıl okuruz? "get" method olusturarak encapsulation edilmis data'nın degerini okuyabiliriz
    //Eğer kimsenin bu data'yı görmemesini istiyorsak bunu yapmamalıyız.Bu bir opsiyondur.

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }
    //Encapsulation yapılan veriable'ın data type'i "boolean" ise
    //get method ismi "is" ile başlar
    /*
    1)Get method'lari hep "public" olur.
    2)Get method'un return type'i okudugu veriable'in return type'i ile ayni olur.
    3)Get method bir boolean veriable için olusturulduysa ismi "is" ile başkar
     */
    public boolean isSuccessful() {
        return successful;
    }

    //Encapsulation yaptıgımız data'yı istersek diger class'lardan nasıl degistirebiliriz?
    //Nasıl deigtirebiliriz? "set method" olusturarak encapsulatate edilmis data'ları değiştirebiliriz
/*
    1)Set method'lar hep public olur.
    2)Set method'un return type'i hep void olur
    3)Set method parametre kullanır,parametrenin data type'i veriable ile aynı olur
    4)Set method kullanarak varolan object üzerinde degisiklikler yaparak o objeyi sanki
    yeni bir objeymis gibi kullanabiliriz
    */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }


}
