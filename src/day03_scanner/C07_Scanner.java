package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //bir önceki soruyu tek seferde kullanicidan tüm bilgileri alarak yapiniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adinizi soyadinizi ve yaşınızı giriniz \naralarda enter a basınız.");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();
        int yas = scan.nextInt();
        System.out.println("Girilen bilgiler:" + isim + " " + soyisim + "," + yas);
    }
}
