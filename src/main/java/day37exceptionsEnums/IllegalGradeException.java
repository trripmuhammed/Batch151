package day37exceptionsEnums;

public class IllegalGradeException extends Exception {
    /*
        1)Custom Exception Class olusturmak icin Exception Class'a extend etmeliyiz.
        Exception Class'a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur.

        2)Custom Exception Class olustururken "constructor" olusturmalıyız.
          Bu "constructor" parent'daki constructor'i cagirmalidir.
          Bu "constructor" mesaj verecek veya vermeyecek sekilde olusturulabilir.

        3)Custom Exception Class olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmaliyiz
          IllegalGradeException da oldugu gibi.
     */

    public IllegalGradeException(String message){
        super(message);
    }
    public IllegalGradeException(){
        super();
    }



}
