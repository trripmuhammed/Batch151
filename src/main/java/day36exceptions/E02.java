package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

    public static void main(String[] args) {

        //2.Way:

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/TextFile");

            int i = 0;

            while ((i = fis.read())!=-1){
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the fire does not exist");
            //throw new RuntimeException(e); dogrusu bu ama error ogrenmeye calistigimiz icin sildik
        } catch (IOException e) {
            System.out.println("Some characters could not be read");
            //throw new RuntimeException(e);
        }


    }
}
