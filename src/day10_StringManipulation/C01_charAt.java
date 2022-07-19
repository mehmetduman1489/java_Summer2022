package day10_StringManipulation;

public class C01_charAt {
    public static void main(String[] args) {
        String str = "Java ogrenmek guzeldir";
        System.out.println(str.charAt(0));//ilk harf yazdırır J
        System.out.println(str.toUpperCase().charAt(7));//R yazar
        System.out.println(str.charAt(21)); //r yazdırır

    }
}
