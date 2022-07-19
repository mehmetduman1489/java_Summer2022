package day14_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilern 4 harfli stringi tersten yazdıran bir method olustur


        terstenYazdir("okan");

    }public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
        input.substring(2,3)+
        input.substring(1,2)+
        input.substring(0,1);
        System.out.println("verilen kelimenin tersten yazılısı="+tersInput);


    }
}
