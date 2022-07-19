package day02_Variables.Odevler;

import java.util.Scanner;

public class HesapMakinesiDeneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen islem yapmak istediğiniz sayi ve islemi giriniz");
        int giris = scan.nextInt();
        String isaret=scan.next();
        int giris1 = scan.nextInt();

        int toplama=islem(giris, giris1);
        System.out.println("toplama = " + toplama);


    }

    public static int islem(int giris, int giris1) {
        int toplam=giris+giris1;
        return toplam;

    }
}