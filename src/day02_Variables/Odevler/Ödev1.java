package day02_Variables.Odevler;

import java.util.Scanner;

public class Ödev1 {
    public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);

            System.out.println("Lütfen 1. sayıyı giriniz");
            double sayi1=scan.nextDouble();
            System.out.println("Lütfen 2. sayıyı giriniz");
            double sayi2= scan.nextDouble();
            System.out.println("Sayıların toplamı="+(sayi1+sayi2));
            System.out.println("Sayıların farkı"+(sayi1-sayi2));
            System.out.println("çarpımı="+(sayi1*sayi2));
        }


    }