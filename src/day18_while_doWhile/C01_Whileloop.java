package day18_while_doWhile;

import java.util.Scanner;

public class C01_Whileloop {
    public static void main(String[] args) {  /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;
        String buyult="";
        while(temp<=sonHarf){
            buyult=(temp+"").toUpperCase();
            System.out.print(buyult + " ");
            temp+=1;
        }
}

    }

