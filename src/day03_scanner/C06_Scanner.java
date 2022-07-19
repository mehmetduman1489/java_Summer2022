package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismini soyismini, yasini alıp  seyfi çapar  34 seklinde yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adinizi giriniz");
        String KullaniciAdi = scan.nextLine();
        // eger girilecek isim tek kelime istiyorsak next, çok kelime girilebilmesi için nextline kullanılır.
        System.out.println("Lütfen soyisim giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Lütfen yasinizi yaziniz");
        double yas = scan.nextDouble();
        System.out.println("girilen bilgiler:" + KullaniciAdi + soyisim + yas);


    }
}
