package day10_StringManipulation;

public class C03_equals {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="ALİ CAN";
        String str3="ALİ CAN"+" ";
        String str4="ALİ CAN";
        String str5=new String("Ali Can");

        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true
        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));
        System.out.println(str1.equals(str4));
        System.out.println(str3.equals(str5));
        System.out.println(str3==str5);




    }
}
