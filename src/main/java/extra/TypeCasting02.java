package extra;

public class TypeCasting02 {
    public static void main(String[] args) {
        short num = 260;
        byte byteNum =(byte) num; //veri kaybına uğradık çünkü byte sınırlarını aştık
        System.out.println("byteNum = " + byteNum);
        //sayı sınırı astıgından 256 ile bölümünden kalanı verir
        short shortNum = byteNum;
        System.out.println("shortNum = " + shortNum);
        short num2=1023;
        byte num2Byte = (byte) num2;
        System.out.println("num2Byte = " + num2Byte);
        //kalan 256 nın yarısından (128) fazla oldugundan 1024 e cıkar ve kalan -1 olur

    }
}
