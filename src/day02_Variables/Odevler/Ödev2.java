package day02_Variables.Odevler;

import java.util.Scanner;

public class Ödev2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kenar uzunluğunu giriniz");
        double kenar = scan.nextDouble();
        System.out.println("Karenin çevresini=" + " " + (kenar * 4));
        System.out.println("Alanı=" + " " + (kenar * kenar));

    }


}
