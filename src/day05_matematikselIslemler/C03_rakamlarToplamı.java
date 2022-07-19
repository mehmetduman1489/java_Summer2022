package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_rakamlarToplamı {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir tam sayı giriniz");
        int sayi=scan.nextInt();
        int birlerBasamagı=0;
        int rakamlarToplamı=0;
        int ilkGirilenSayi=sayi;
        //su anda 5267 birler basamağı 0 , rakamlar toplamı 0.
        birlerBasamagı=sayi%10;
        rakamlarToplamı+=birlerBasamagı;
        sayi/=10;
        birlerBasamagı=sayi%10;
        rakamlarToplamı+=birlerBasamagı;
        sayi/=10;
        birlerBasamagı=sayi%10;
        rakamlarToplamı+=birlerBasamagı;
        sayi/=10;
        birlerBasamagı=sayi%10;
        rakamlarToplamı+=birlerBasamagı;
        System.out.println(ilkGirilenSayi+"sayısının basamaklar toplamı="+rakamlarToplamı);







    }
}
