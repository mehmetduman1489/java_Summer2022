package recap1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz");
        int sayi=scan.nextInt();
        System.out.println("Lütfen array elemanlarını giriniz");
        int [] olusanarr= new int[sayi];
        for (int i = 0; i < sayi; i++) {
            olusanarr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(olusanarr));

farkiBul(olusanarr);



    }

    public static void farkiBul(int[] olusanarr) {

        Arrays.sort(olusanarr);
        System.out.println(olusanarr[olusanarr.length-1]-olusanarr[0]);





    }


}

