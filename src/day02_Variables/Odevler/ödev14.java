package day02_Variables.Odevler;

import java.util.Scanner;

public class ödev14 {
    public static void main(String[] args) { //SORU  6
        Scanner scan = new Scanner(System.in);
        System.out.println("sifre giriniz");
        String sifre = scan.nextLine();
        char ilkharf = sifre.charAt(0);

        int uzunluk = sifre.length();
        char sonharf = sifre.charAt(sifre.length() - 1);
        if ((uzunluk < 7)) {
            System.out.println("islem basarisiz, lütfen yeni bir sifre girin");
        } else if ((ilkharf <= 'Z' && ilkharf >= 'A') && (sonharf <= 'z' && sonharf >= 'a') && (!sifre.contains(" "))) {
            System.out.println("sifre basari ile tanımlandi");

        } else {
            System.out.println("islem basarisiz, lütfen yeni bir sifre girin");
        }


    }
}
