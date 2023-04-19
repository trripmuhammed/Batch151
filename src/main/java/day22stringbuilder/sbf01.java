package day22stringbuilder;

public class sbf01 {
    /*
    1)StringBuffer Java'da String üreten bir Class'dir.
    2)StringBuffer, StringBuilder'a çok benzer, yani ikisi de mutable String üretir
    3)StringBuffer "multi-thread" dir ama StringBuilder "multi-thread" değildir.
    4)Java StringBuffer'i, StringBuilder'dan önce oluşturdu.
    5)StringBuilder "multi-thread" olmadığı için StringBuffer'dan daha hızlı çalşışır
    6)"multi-thread" yapilirken yapilan işlerin sıralaması önem arz eder,yapılan işleri
    mantikli bir siraya koymak "synchronization" olarak adlandırılır.
    StringBuffer "multi-thread" oldugu için ayni zamanda "synchronization" dir.

        3 tane String oluşturan class öğrendik
        1)Immutable string lazımsa String class kullanılacak
        2)mutable string lazımsa: StringBuilder veya StringBuffer
            1)StringBuilder'i multi-thread gerekmezse kullanırız
            2)StringBuffer'i multi-thread gerekirse kullanırız
     */
    public static void main(String[] args) {

        StringBuffer sbf1 = new StringBuffer("Java");

    }
}
