package day06_cocanation;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C01_wrapperClass {
    public static void main(String[] args) {
        //wrapper class
        String str="java ile hayat güzel";
        System.out.println(str.toUpperCase());//büyüük yazdırır bütün metni

        boolean guzelMi=true;
        Boolean buguzelMi=true;
        buguzelMi.toString();
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);


        String ogrno="123456";
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı sifre giriniz");
        String sifre=scan.nextLine();
        Integer sifresayı=Integer.parseInt(sifre);
        System.out.println(sifresayı);
        System.out.println(sifre);
    }

}
