package day37exceptionsEnums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {

    /*
        1)"try" kullandıgımızda her senaryo icin calismasini istedigimiz kodlari
          "finally" block icine koyariz.Bu block "catch" siz de calisabilir.

        2) "final" , "finally" ve "finalize" aciklarmisiniz ? (interview)
          "final" aciklandi.
          "finally" aciklandi.
          "finalize": "Garbage Collecter" memory'i temiz tutmak icin surekli memory'i tarar
          ve silinmesi gerekenleri siler.
          "Garbage Collector" silmeden once silecegi data'lari "finalize" eder sonra siler.

     */

    public static void main(String[] args) throws IllegalGradeException {
//        System.out.println(getGrades());

        try{
            printAge(45);
           // printAge(-45);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I almost work ever");
        }

    }
    //Example 1: Ogrenci notlarını bir List'e ekleyen method'u olusturunuz

    public static List<Integer> getGrades() throws IllegalGradeException {

        List<Integer> grades = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        String grade;

        do {
            System.out.println("Please enter the grade.");
            grade = input.next();

            int intGrade =0;

            if(!grade.equals("q")) {
                intGrade = Integer.valueOf(grade);
            }
            if(grade.equals("q")){
                break;
            }else if(intGrade>=0 && intGrade<=100) {
                grades.add(intGrade);
            }else{
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid");
            }

        }while(!grade.equals("q"));

        return grades;
    }

    //Example 2: Kullanicinin yasini console'a yazdiran method'u olusturunuz.
    public static void printAge(int age) throws IllegalAgeException {
        if(age<0){
            throw new IllegalAgeException();
        }


        System.out.println(age);
    }
}
