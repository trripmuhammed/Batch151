package day16arraysforeachloop;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opr=' ';
        do {
            System.out.println("Please enter the operation among +,-,*,/,%");
            opr = input.next().charAt(0);
            if(opr=='q'){
                break;
            }boolean r= opr=='+' || opr=='-' || opr=='*' || opr=='/' || opr=='%';
            if(!r){
                System.out.println("Undefined operation");
                break;
            }
            System.out.println("Enter the first number");
            int n1 = input.nextInt();

            System.out.println("Enter the second number");
            int n2 = input.nextInt();
            switch (opr) {
                case '+':
                    System.out.println(n1 +"+"+ n2 + "="+ (n1+n2));
                    break;
                case '-':
                    System.out.println(n1 +"-" + n2 + "="+ (n1-n2));
                    break;
                case '*':
                    System.out.println(n1 +"*"+ n2 + "="+ (n1*n2));
                    break;
                case '/':
                    System.out.println(n1+ "/"+ n2 +"="+(n1/n2));
                case '%':
                    System.out.println(n1+ "%"+n2 +"="+((n1*n2)/100));
                    break;
                default:
                    System.out.println("Undefined operation");
            }

        }while(true);//do{}while(opr=='q') 2 süslü parantezin içine tanımladığımız veriable ı onun dısında kullanmayız
    }
}
