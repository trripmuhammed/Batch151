package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    /*
            1)Run Button'una bastıktan sonra console'da alinana Exception'lara "Runtime Exception" denir.
              Arithmetic Exception, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
              lar "Runtime Exception"a örnektir.
              "Runtime Exception" lara "Unchecked Exception" da denir.
            2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir. Bunlara "Compile Time Exception" denir.
              FileNotFoundException, IOException "Compile Time Exception"a örnektir.
              "Compile Time Exception" lara "Checked Exception" da denir.

            3)FileNotFoundException: Java'ya bir dosyayi bul dedigimizde. Java "dosyanin adresi" ve "dosyanin varligi" konusunda
                                     hata olusursa ne yapmasi gerektigini soylemenizi ister.

            4)IOException: "IO" Input Output demektir.
                           Note: IOException FileNotFoundException'in parent'i dir.

            5)Java da hata'lar temelde 2 ye ayrilir.
                1)Exception'lar         2)Error'lar
                                        a)StackOverflow Error (Stack memory dolmasi)
                                        b)Out Of Memory Error (Heap memory dolması)
                                        c)Virtual Machine Error
     */


    public static void main(String[] args) throws IOException {

        //FileInputStream fis = new FileInputStream("day36exceptions/TextFile");
        //FileInputStream fis = new FileInputStream("C:\Users\rizel\IdeaProjects\Batch151\src\main\java\day36exceptions\TextFile");
        //3'ü de kullanilabilir.

        //1.Way: Exception'i method signature satirina ekledik
        FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/TextFile");

        int i = 0;

        while((i = fis.read())!=-1){
            System.out.print((char)i);
        }



    }
}
