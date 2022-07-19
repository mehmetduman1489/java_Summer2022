package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismini isteyin
        //girilen ismi
        //isminiz:....... şeklinde yazdırın

        // insanların dünyasından kodlarımızın bulunduğu class'a değer almak icin
        //scanner class'ini kullaniriz.
        //1- scanner objesi oluşturalım
        Scanner scan = new Scanner(System.in);
        //2- kullanıcıya ne istedigimizi yazalım
        System.out.println("Lütfen İsminizi Giriniz");
        // 3-Oluşturduğumuz scan objesi ile kullanıcının girdiği degeri alıp olusturacagimiz uygun bir variabl'a atayalım.
        String Kullaniciİsmi = scan.next();
        System.out.println("İsminiz=" + Kullaniciİsmi);


    }
}
