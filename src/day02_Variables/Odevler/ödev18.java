package day02_Variables.Odevler;

import java.util.Scanner;

public class ödev18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("string girin");
        String str = scan.nextLine();
        tersten(str);
    }

    public static void tersten(String str) {
        for (int i = (str.length() - 1); i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));
        }
    }
}
