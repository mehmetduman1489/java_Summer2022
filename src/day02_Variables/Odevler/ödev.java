package day02_Variables.Odevler;

import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isim giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisim giriniz");
        String soy=scan.nextLine();
        System.out.println(isim.length()>soy.length()?"isim uzun":"soyisim uzun");


    }
}
