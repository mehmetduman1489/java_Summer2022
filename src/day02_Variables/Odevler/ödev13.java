package day02_Variables.Odevler;

import java.util.Scanner;

public class ödev13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli kelime yazınız");
        String kelime=scan.next();
        String terskelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println(terskelime);

    }
}
