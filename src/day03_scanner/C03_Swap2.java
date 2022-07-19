package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        sayi3 = sayi1 + sayi3;// 0       20     10
        sayi1 = sayi2 + sayi1;//20     0         10
        sayi2 = sayi3 + sayi2;
        System.out.println(sayi1);


    }
}
