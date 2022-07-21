package recap1;

import java.util.Arrays;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
         /* Problem tanımı:
        Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
        String parametreli return type li reverseWord isminde bir method yazınız

          */
        Scanner scan = new Scanner(System.in);
        System.out.println("cümle girin");
        String cumle = scan.nextLine();
        String[] ters = reverseWord(cumle);
        System.out.println(Arrays.toString(ters));


    }

    public static String[] reverseWord(String cumle) {
        String[] duzcumle = cumle.split(" ");
        String[] terscumle = new String[duzcumle.length];
        System.out.println(Arrays.toString(terscumle));

        for (int i = 0; i < duzcumle.length; i++) {


            terscumle[i] = duzcumle[duzcumle.length - 1];


        }
        return terscumle;
    }
}
