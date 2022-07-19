package day02_Variables.Odevler;

import java.util.Scanner;

public class HarfYazdırma {
    public static void main(String[] args) {


        // Soru 4) Kullanicidan baslangic ve bitis haflerini alin
        //         ve baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
        //         Kullanicinin hata yapmadigini farz edin.

        Scanner scan = new Scanner(System.in);


        System.out.println("lütfen ilk harfi giriniz");
        char c = scan.nextLine().toUpperCase().charAt(0);
        System.out.println("Lütfen ikinci harfi giriniz");
        char a = scan.nextLine().toUpperCase().charAt(0);


        for (int i = c; i <= a; i++) {
            System.out.print(c + " ");
            i += c;
        }
    }
}


