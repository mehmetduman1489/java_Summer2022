package day03_scanner;

public class C01_Asciitable {
    public static void main(String[] args) {
        //bir tam sayı bir de char değişken oluşturun. toplamının sonucunu yazdırın
        int sayı = 10;
        char harf = 'a';//10a değil 107 oldu a ascii tablosundan a=97 değeri aldı.
        String str = "banan";//banana oldu
        System.out.println(str + harf);
        System.out.println("" + sayı + harf);//10a olması için strig in gücünden yararlanmak için başa boş string ifade yazılır.
        char deger = '1';
        System.out.println(deger + harf);//146 çıkar 1=49, a=97;
        /*1- char data türü işleme girdiği değişkenin türüne göre farklı hareket edebilir.Eğer toplandığı variable sayısal bir değerse sayı gibi davranır
         */


    }
}
