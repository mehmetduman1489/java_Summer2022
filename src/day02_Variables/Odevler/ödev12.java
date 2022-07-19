package day02_Variables.Odevler;

import java.util.Scanner;

public class ödev12 {
    public static void main(String[] args) {
        //SORU 3

        Scanner scan = new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim = scan.nextLine();
        if (isim.contains("a")) {
            System.out.println("Girdiğiniz isim a harfi iceriyor");
        } else if (isim.contains("Z")) {
            System.out.println("Gridiginiz isim Z iceriyor");
        } else {
            System.out.println("girdiginiz isim a veya Z harfi icermiyor");
        }
    }
}