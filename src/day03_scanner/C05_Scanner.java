package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // kullanicidan iki sayı alıp bu sayıların çarpımını yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Lütfen 2. sayıyı giriniz");
        double sayi2 = scan.nextDouble();
        System.out.println("Girilen sayıların çarpımı=" + sayi1 * sayi2);

    }
}
