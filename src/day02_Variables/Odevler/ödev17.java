package day02_Variables.Odevler;

import java.util.Scanner;

public class ödev17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("string girin");
        String gstr =scan.nextLine();
        for (int i = (gstr.length()-1); i >=0; i--) {
            System.out.print(gstr.substring(i,i+1));

        }

    }
}
