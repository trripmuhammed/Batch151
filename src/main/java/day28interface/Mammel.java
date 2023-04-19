package day28interface;
/*
    1)
    Class-->Class : extends
    interface --> interface : extends
    Class --> interface : implements
    interface --> Class : Olamaz...
    Aynı ise "extends", farklı ise "implements" kullan.
    "interface" i class'in parent i yapma.

    abstract class ile interface arasındaki farklar (interview)
  **1)Abstract class'lar hem abstract hemde concrete method'lar icerebilir.Fakat interface'ler sadece abstract method icerir
    Ama interface'lerde istersek default ve static keyword'lerini kullanarak "concrete method" üterebiliriz
   *2)Abstract class'lar multiple inheritance'ı(1 den fazla parent) desteklemez ama interface'ler destekler
   *3)Abstract class'lar icinde her türlü veriable olusturulabilir.Interface'ler icindeki veriable'lar public,static ve final olmak zorundadır
    4)interface class'ın child'ı olamaz ama "abstract class" class'in child'i olabilir.
    5)Abstract class'larda constructor vardır ama object uretemez.Interface'lerde constructor yoktur.Bu yüzden obje üretilemez.
 */
public interface Mammel extends Animal{
    String feedBaby="Milk";
    //2 tane age kullana bilmemizin sebebi 2 sini kullanırkende interface adlarını kullanıyor olmamız
    int age = 6;
}
