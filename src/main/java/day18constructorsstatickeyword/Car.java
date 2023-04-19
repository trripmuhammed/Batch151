package day18constructorsstatickeyword;
/*
1)Constructor nasıl oluşturulur
Access Modifier + Class Name + () + {}
 */
public class Car {
    String make="Honda";
    String model="Accord";
    int year=2021;
    int price=10000;
    /*
    Default Constructor
    Default Constructor'lar parametre kullanmazlar
    Default Constructor'ların body si boştur
    Java kiskanc'dir.Siz default constructor'ı elle yazdığınızda
    java object class içindeki default constructor'ı kullandırtmaz
     */
    public Car(){
    }
    /*
    method ide constructor arasındaki farklar
    1)methodlarda return type olur
    2)methodlar yaptıkları işe göre isimlendirilirler
    (Constructor da dayma class ismi yazılır)
     3)method'lar bir aksiyon yapmak için oluşturulur
     (construct'lar ise object oluşturmak içindir)
     4)method isimleri küçük harfle başlar
     (construct'lar ise class ismiyle aynı oldugundan genelde büyüktür)
     */
    /*
    Custom Constructor

     */
    public Car(String make, String model, int year, int price) {
        this.make = make;//burdaki this main method da make'i bizim belirlememize izin veriyor.Yazmasaydık başta nasıl tanımladıysak onu görürdük
        this.model = model;
        this.year = year;
        this.price = price;
    }//kısa yoldan yapmak icin sağ tıklayıp generate deyip contructor ı seçip
    //shift ile istedigimiz parametreleri secip kısa yoldan oluşturabiliriz

    //Custom Constructor
    public Car(String make){
        this.make = make;
    }
}
