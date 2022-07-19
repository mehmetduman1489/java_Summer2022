package day02_Variables.Odevler;

import java.util.Scanner;

public class denenme {
    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
    Scanner scan=new Scanner(System.in);
    int sayilar []=Arrayolsutur ();
    maxSayiYazdir(sayilar);


    }

    public static void maxSayiYazdir(int[] sayilar) {
        int maxsayi=sayilar[0];
        for (int i = 0; i < sayilar.length-1; i++) {
            if (sayilar[i]>maxsayi){
                maxsayi=sayilar[i];            }

        }
        System.out.println("arraydaki max sayi:"+maxsayi);

                  }

    public static int[] Arrayolsutur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("kac elemeanlı array olsun");
        int uzunluk=scan.nextInt();
        int []olusturulan=new int [uzunluk];
        int sayi=0;
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println(i+". index icin sayi girin");
            olusturulan[i]=scan.nextInt();

        }return olusturulan;
    }
}
