package day05_matematikselIslemler;

public class C02_matematilselIslemler {
    public static void main(String[] args) {
        int sayi=10;
        System.out.println("pre-increment:"+ ++sayi);//11 önce artır sonra ata
        System.out.println("post-increment:"+sayi++);//11 önce ata sonra artır sayi 11 atanır ama sonra bir artırılır
        System.out.println("post-incrementten sonra:"+sayi);//12 sonra dan bir artırıldığından 12 oldu.
        //
        int sayim=8;
        System.out.println("post incrementten once:" + sayi++); // sayi dan sonra ++ geliyorsa post inrecement olur
        System.out.println("post incrementten sonra:" + sayi);   // yani once sayi yazilir sonra islem yapilir

        int sayi1=7;
        System.out.println("pre increment:" + ++sayi1);
        System.out.println("pre decrement:" + --sayi1);
        System.out.println("post decrementten once:" + sayi1--);
        System.out.println("post decrementten sonra:" + sayi1);

        int sayi2=3;
        System.out.println("pre decrement:" + --sayi2);


    }
}
