package day02_Variables.Odevler;

import java.util.Scanner;

public class ödev15 {
    public static void main(String[] args) {
        //SORU 4
        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();
        System.out.println(isim.length()>soyisim.length()?"isim uzundur":"soyisim uzundur");
    }
}
