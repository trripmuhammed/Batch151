package extra;
import java.util.Calendar;

public class takvimekstra {
    // Yıl Verisini Alma İşlemi:
    Calendar takvim = Calendar.getInstance(); // Güncel Tarihi Almamız İçin Sınıf tanımlaması.
    // Değişken Tanımlaması:
    String userName,userSurName;
    int dateOfBirth;
    // Metot Tanımlamaları:
    public String writeName(){
        return userName;
    }
    public String writeSurName(){
        return userSurName;
    }
    public int writeAge(){
        return takvim.get(Calendar.YEAR)-dateOfBirth; // Günümüz Yıl Verisinden Doğum Yılımızı Çıkartıyor.
    }
}