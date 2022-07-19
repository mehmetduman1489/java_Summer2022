package day02_Variables.Odevler;

import java.util.Scanner;

public class ödev16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String isim= scan.nextLine();
        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();
        System.out.println("kart no giriniz");
        String kartNo=scan.nextLine();

        String isimIlkHarf = isim.substring(0, 1).toUpperCase();
        String isimGeriyeKalanlar = isim.substring(1).replaceAll("\\w", "*");
        String soyisimIlkHarf = soyisim.substring(0, 1).toUpperCase();
        String soyisimGeriyeKalanlar = soyisim.substring(1).replaceAll("\\w", "*");
        String kkIlk4 = kartNo.substring(0, 4);
        String kkGeriyeKalanlar = " **** **** ****";
        System.out.println(isimIlkHarf + isimGeriyeKalanlar + " " +
                soyisimIlkHarf + soyisimGeriyeKalanlar + "\n" +
                kkIlk4 + kkGeriyeKalanlar);
    }
}
