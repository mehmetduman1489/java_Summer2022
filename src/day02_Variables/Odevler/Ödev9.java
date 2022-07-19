package day02_Variables.Odevler;

public class Ödev9 {
    public static void main(String[] args) {
        //soru1
        byte sayi1 = 30;
        short sayi2 = sayi1;
        int sayi3 = sayi2;
        float sayi4 = sayi3;
        double sayi5=sayi4;
        System.out.println(sayi5);
        //soru2
        int puan1=1122;
        short puan2=(short)puan1;
        byte puan3=(byte)puan2;
        System.out.println("sonuc"+puan3);
        //soru3
        float no1=456f;
        System.out.println(no1);

        //soru4
        double nu= 255.36;
        int nu1=(int)nu;
        byte nu2=(byte)nu1;
        System.out.println(nu2);
        //soru5
        int ff=840;
        int fg=60;
        System.out.println(ff/fg);
        //soru6
        int jk=840;
        double aa=255.36;
        System.out.println(jk/aa);
        //soru7
        System.out.println("byte/ double"+(puan3/nu));
        System.out.println("byte*float"+(no1*puan3));
        char say1='£';
        byte say2=(byte)say1;
        System.out.println(say1+60);
        System.out.println(say2);


    }
}
