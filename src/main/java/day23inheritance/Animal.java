package day23inheritance;

public class Animal {
    /*
    1)eat(){} method'u gibi bir cok class'ın kullanması gerek method'ları her class'a ayrı ayrı
    yazarsak;
        1-tekrar yapmıs oluruz,tekrar ideal code'da olmamalıdır
        2-her class aynı method'u tekrar tekrar yazmak zaman kaybıdır.
        3-Tekrar tekrar yazılan method'un tamiri cok zaman alır
        4-tekrar tekrar yazılan method'un gelistirilmesi cok zaman alır
        5-Method'u tekrar tekrar yazmak atomik yapıy'a terstir.
    2)private class member'lar child class'lar tarafından kullanılamazlar
        public class member'lar child class'lar tarafından kullanılabilir
        default class member'lar aynı package de child class'lar tarafından kullanılabilir
        protected class member'lar farklı packagede'de olsalar da child class'lar tarafından kullanılabilir
    3)Java'da bir class'ın sadece 1 tane parent'ı olabilir
        coklu parent'a "Multiple Inheritance" derler tekliye ise "Single Inheritance" derler
        Java "Multiple Inheritance" ı desteklemez,Java "Single Inheritance" kullanır
    4)Apartman şeklindeki Inheritance yapısına "Multilevel Inheritance" ı desstekler

     */
    protected void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }

}
