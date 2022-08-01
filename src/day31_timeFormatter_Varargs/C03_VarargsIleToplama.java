package day31_timeFormatter_Varargs;

import static day31_timeFormatter_Varargs.C02_Varargs.toplaYazdir;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;
        //verilen kac int olursa olsun toplayan method olustur
        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }

   public static void toplaYazdir(int... sayi){
        /*
        int... bu gösterim integer variablelardan olusan bir varargs demektir.
        varargs array alt yapsıını kullanır.
         */

   }
}
