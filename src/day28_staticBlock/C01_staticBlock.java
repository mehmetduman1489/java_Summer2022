package day28_staticBlock;

public class C01_staticBlock {


    static int sayi;

    static {
        //Static block class üyelerinin
        // tamamindan (main methoddan önce) calisir
        //Static bloc class olusturuldugunda calisir
        // genellikle de class la ilgili on ayarlamalar
        // veya static variablelara deger atamak icin kullanılır
        //static bloc ların class icinde nerede oldugu onemli degildir.
        //once static bloc calisir
        //birden fazla static bloc varsa yukaridan asagiya calisir
        //Static olmayan bloclar ise sadece obje olustururken calistirilirlar
        System.out.println("static blok calısti");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("main metod calisti");
        System.out.println(sayi);
    }
}
