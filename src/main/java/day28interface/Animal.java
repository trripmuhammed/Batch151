package day28interface;
/*
    interface class'larda
    method body si olmaz.Body koymak istiyorsak "static" veya "default" keyword kullanırız.
    Fakat "default" veya "static" koyupta body koymassak yine hata alırız
    interface multiple (1 class'a 2 tane parent koyma) ı destekler
    abstract ve interface den obje üretilemez
 */
public interface Animal {
    void eat();

    void drink();

    /*1)interface'teki tüm veriable'lar otomatik(default) olarak "final" dir.
      Bu yüzden interface icindeki veriable'i olusturdugumuzda mutlaka deger atamalıyız
      Bilindigi gibi final veriable'ların degerleri degistirilemez
    2)interface'lerdeki tüm veriable'lar (default)public dir.
    3)interface'lerdeki tüm veriable'lar otomatik(default) olarak "static" dir.
    çünkü interface de obje olustudamadıgımızdan data ya ulasabilmemiz icin
    */

    int age=4;

}
