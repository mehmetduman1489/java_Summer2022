package day02_Variables.Odevler;

import java.util.Scanner;

public class Ödev3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yarçap giriniz");
        double pi = 3.14;
        double yariçap = scan.nextDouble();
        System.out.println("Çemberin çevresi="+" "+(2*pi*yariçap));
        System.out.println("Çemberin alanı="+" "+(pi*yariçap*yariçap));


    }
}
