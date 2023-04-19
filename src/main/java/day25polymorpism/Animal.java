package day25polymorpism;

public class Animal {
    /*
    1)Parent'daki method ile child da override edilen method'un access modifier'ları aynı olabilir
    2)Child'da override edilen method'un access modifier'i parent'taki method'un access modifier'indan dar olamaz
    3)Parent'taki methodun access modifier'ı child'daki method'un access modifier'ından dar olabilir

    4)Method'un return type'ı "primitive" ise Overriding yapıldıgında "return type" değiştirilemez
    5)Method'un return type'ı void ise Overriding yapıldıgında "return type" değiştirilemez

    6)Child'da override edilen method'un return type'ı ile Parent'taki method'un return type'ı arasında "IS-A" iliskisi
    varsa return type degistirilebilir.Aksi takdirde degiştirilemez
     Mesela: Integer Wrapper Class ile Long Wrapper Class arasında "IS-A" iliskisi yoktur.
     Bu yüzden return type Integer oldugunda Long'la degistirilemez.

    7)Return type Wrapper Class oldugunda Overriding yaparken return type değiştirilemez

    8)"final" method'lar (değiştirilemez method) Override edilemezler.
    "final" method'ların body'si değiştirilemez ama Override ederken method body'yi değiştiriz.
    Bu bir çelişkidir bu yüzden Java "final" method'ların Override edilmesine müsade etmez.

    9)Static method'lar Override edilemezler.Çünkü static method'lar tüm child'lar için ortak method'lar dır.
    Bir child ortak method'u değiştirdiğinde diğer child'lar bundan etkilenir.Bu etkilenme ummadık sonuçlar ortaya çıkarabilir
    Bu yüzden Java static method'ların Override edilmesine müsade etmez.
     */

    public void move(){
        System.out.println("Animals move");
    }
    protected int add(int a, int b){
        return a + b;
    }
    public Animal create(){
         return new Animal();
    }

    public Integer multiply(Integer a, Integer b){
        return a + b;
    }

    public final double circleArea(double r){
        return 3.14*r*r;
    }

    
}
