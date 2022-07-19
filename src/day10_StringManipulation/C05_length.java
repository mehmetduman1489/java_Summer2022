package day10_StringManipulation;

public class C05_length {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";
        System.out.println(str.length());//strnin karakter sayisini verir
        System.out.println(str.charAt(str.length()-1));//son karakteri yazdıralım
        System.out.println(str.charAt(str.length()-3));//sondan 3. karakteri yazdıralım
        /*java da null pointer(isaretleyici) bir deger degil karsisina yazıldıgı variablenin hic bir deger almadıgının isaretcisidir

         */

        String str2=" ";//str2 de bir deger atanmısmidir EVET
                    //bu deger nedir  "hiclik"
        System.out.println(str2.length());//0 dır

        String str3=null; //str3 e bir deger atanmıs mıdır hayır
                        // null bu deger atamamayı isaret eder
        System.out.println(str3);//Bir deger atanmamıskiuzunlugu olsun
                                // NullpointerException olarak hata verir.



    }
}
