package day22stringbuilder;

public class Student {

    //stdName "public" oldugu icin diger class'lardan ulasılabilir.
    public String stdName = "Ali Can";
    //Access modifier'ı "default" olan ile "public" olan class member'lar ayni package icinde
    //kullanıldıklarında aynı özellikleri gösterirler fakat farklı package e gectigimizde
    //"public" olanlara ulaşılabilir "default" olanlara ulaşılamaz
    int age = 23;

    //Access modifier'ı "private" olan Class member'lar sadece olusturuldukları class
    //içinden görülebilirler
    //Oluşturuldukları class'in dısına cıktıgınızda ulasılmaz,görülmez olurlar
    private String healthCondition = "Cancer";

    //Access modifier'ı "protected" olan Class member'lar aynı package icinde iken "public" gibi davranırlar
    //Farklı package'e geçtigimizde protected olanlar sadece child class'lardan görülebilir
    protected int salary = 3000;

    //Note:Class'lar public ve default olabilir. Ama, private ve protected olamazlar.


}
