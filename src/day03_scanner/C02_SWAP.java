package day03_scanner;

public class C02_SWAP {
    public static void main(String[] args) {
        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3 = 0;//geçici kova olarak kullanılır
        //adım1- sayıyı boş kovaya koyalım
        sayı3 = sayı2; //10    20   20
        //adım2- birinci sayıyı ikinci sayıya atayacağız.
        sayı2 = sayı1;// 10   10    20
        sayı1 = sayı3;// 20     10    20
        System.out.println("SwAP tan sonra sayı1=" + sayı1);
        System.out.println("SWAP tan sonra sayı2=" + sayı2);


    }
}
