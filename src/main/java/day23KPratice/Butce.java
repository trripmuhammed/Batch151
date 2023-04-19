package day23KPratice;


public class Butce {
   public static int butce;
   public int harclik;

   public void maasAl(int alinanMaas){
       butce+=alinanMaas;
   }
   public void harclikAl(int alinanHarclik){
       butce-=alinanHarclik;
       harclik+=alinanHarclik;
   }

   public void butcedenHarca(int harcanacakPara){
       butce-=harcanacakPara;
   }
   public void harcliktanHarca(int harcilHarcamasi){
       harclik-=harcilHarcamasi;
   }

}
