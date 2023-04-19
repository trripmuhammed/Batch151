package day12switchincrementdecrementloops;

public class Switch01 {
    public static void main(String[] args) {
        //ay numarası verilen ay ismini ve december'a kadarki tüm ayların isimlerini veren uyg
        int monthNumber =3;
        //switch icinde Strint,int,byte,short ve char kullanılabilir
        //memory korunması için long switch de kullanılamaz(yasaklanmıştır)
/*
eger bizden sectigi sayıdan sonraki ayları istiyorsa(3 ü secerse mart ve sonraki ayları yazar) 12.ay hariç break lari sileriz
 */
        switch (monthNumber) {
            case 1:
                System.out.println("January");
    //            break;
            case 2:
                System.out.println("February");
    //            break;
            case 3:
                System.out.println("March");
     //           break;
            case 4:
                System.out.println("April");
      //          break;
            case 5:
                System.out.println("May");
     //           break;
            case 6:
                System.out.println("June");
  //              break;
            case 7:
                System.out.println("July");
  //              break;
            case 8:
                System.out.println("August");
    //            break;
            case 9:
                System.out.println("September");
    //            break;
            case 10:
                System.out.println("October");
 //               break;
            case 11:
                System.out.println("November");
 //               break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
