package recap1;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //
        // Kullanıcının girdiği integer sayıyı tersten yazdıran kod bloğu yazınız.123==>321 yada 1045==>5401 gibi

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        String sayi = scan.nextLine();

        for (int i = sayi.length()-1; i >= 0; i--) {
          System.out.print(sayi.substring(i,i+1));



        }
    }


}

