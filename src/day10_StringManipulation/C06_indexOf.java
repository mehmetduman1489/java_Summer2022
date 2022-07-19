package day10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str = "Java ogrenmek guzeldir";
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.lastIndexOf('g'));
        System.out.println(str.lastIndexOf("t"));// bana ınteger donduruyor
        //integer da yok degeri yok 0 dersek j nin degeridir
        //ama - bir deger dönerse yoklugu anlarız
        //java -1 deger vermeyi secmis yokluk icin

        String str5 = "dihvbıaıigouaoabdşguwrngskdiıbnoiıalksdbn,ğsjğsph";
        if (str5.indexOf("p") == -1) {
            System.out.println("strde istenen karakter kullanılmıs");
        } else {
            System.out.println("strde istenen karakter kullanılmıs");
        }
    }}