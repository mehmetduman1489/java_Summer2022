package day04_dataCasting;

public class C05_Pre_Postİncrement {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = sayi1 + 1;
        int sayi3 = sayi2++;// sayi2 bir artırılacak ve sayi3 e atanacak.
        int sayi4 = ++sayi1;//sayi1 in değeri 1 artırılacak sayi1 değeri sayi4 e atanacak
        //pre veya post increment/decrement sadece ++ ve__ de geçerlidir
        // bu iki işlem yazıdan önce ve ya sonra yazılmasına göre farklı iki işlem barındırı.

        System.out.println("sayi3:" + sayi3);
        System.out.println("sayi2:" + sayi2);

        System.out.println(sayi4);
        System.out.println(sayi1);


    }
}
