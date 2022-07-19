package day02_Variables.Odevler;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yasinizi giriniz");
        int yas = scan.nextInt();
        if (yas < 65) {
            System.out.println("emekli olamazsın, calismalisin");

        } else {
            System.out.println("emekli olabilirsin");
        }
    }
}