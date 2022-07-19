package day03_scanner;

import java.util.Scanner;

public class C08_Scannerİlkharf {
    public static void main(String[] args) {
        // kullanicidan ismini alip ilk harfini büyük harf olarak yazin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        char ilkharf = scan.next().toUpperCase().charAt(0);
        System.out.println("İsmin ilk harfi:" + ilkharf);
        //Java scannerda next char modu yoktur. bunun yerine string olarak kelimeyi alıp onun ilk harfni alabiliriz


    }
}
