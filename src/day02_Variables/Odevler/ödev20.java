package day02_Variables.Odevler;

import java.util.Scanner;

public class ödev20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("string girn");
        String str= scan.nextLine();
        String ters="";
        for (int i =(str.length()-1); i >=0 ; i--) {
            String ters1=str.substring(i,i+1);
            ters+=ters1;

        }
        if (str.equals(ters)){
            System.out.println("str polingromdur");
        }else{
            System.out.println("polindrome değil");
        }



    }
}
