package day02_Variables.Odevler;

public class ödev10 {
    public static void main(String[] args) {
        String str="Java ogrenmek123 Cok guzel@";
        str=str.replace(" ","wq");
        str=str.replaceAll("\\W","");
        str=str.replaceAll("\\d","");
        str=str.replace("wq"," ");
        str=str.replace("C","c");
        System.out.println(str+".");

    }

}
