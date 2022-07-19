package day05_matematikselIslemler;

public class C04_wrapperClass {
    public static void main(String[] args) {
        String str="java çok güzel";
        System.out.println(str.toUpperCase());
        int sayi=10;
        //primitiv data türlerinin n yanında metod olmaz. java bazı metodları kullanabilmemiz için her
        // bir primitiv data türü için br wrapper class türü olusturmustur
        Integer sayi2=10;
        sayi2.byteValue();



        Integer sayi1=20;
        sayi=sayi1;
        System.out.println(sayi);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES); // 32 bit= 4byte
        //primitive data turlerinin yaninda methodlar olmaz
        //java bazi methodlari kullnabilmemiz icin her bir primitive data turu icin
        //bir wrapper class olusturmustur


    }
}
