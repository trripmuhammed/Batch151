package day08KStringManipulation;

public class StringManipulation2 {
    public static void main(String[] args) {
        /* replaceFirst : replace() ile aynı isi yapıyor ama
        ilk gordugu datayı degistiriyor
         */
        String str = "Hayirli Olsunda";
        // metinteki ilk a harfini e harfiyle değiştir
        String stratoe = str.replaceFirst("a","e");
        System.out.println(stratoe);
      //  System.out.println(str.replaceFirst("a", "e"));
        //1.daha makbul çünkü parantez içi temiz tutulmalı
        /*
        trim() : Bir string de başında ve sonundaki space leri siler
        aradakilere dokunmaz
        kullanıcı hatasını önlemek için çıkmıştır
         */
        //metindeki baş ve sonda varsa space karakterlerini siliniz
        String str2 = "   Ali  Can    ";
        String strtrim = str2.trim();
        System.out.print(strtrim);
        System.out.println("***"); //sonda bosluk bıraktımı anlamak için
        /*Fiyatları verilen ürünlerin toplam fiyatını bulunuz
        String tv = 599.99$
        String laptop = 299.99$
         */
        String tv = "599.99$";
        String laptop = "299.99$";
        String tv2 = tv.replace("$","");
        String laptop2 = laptop.replace("$","");
    /*  double price1 = Double.parseDouble(tv2);
        double price2 = Double.parseDouble(laptop2); */
        Double totalprice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("toplam fiyat = "+ (totalprice));
        //Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekran yazdır
        String fullName = "  mehmet fatih yıldız ";
        char firstName = fullName.trim().toUpperCase().charAt(0);
        char lastName = fullName.trim().toUpperCase().split(" ")[1].charAt(0);
        char thirdName = fullName.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println(""+firstName+lastName+thirdName);



    }
}
