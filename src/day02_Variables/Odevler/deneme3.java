package day02_Variables.Odevler;

public class deneme3 {
    public static void main(String[] args) {
        String kelime[] = {"mehmet", "ahmet", "süleyman", "abdulrezzak", "ali"};
        enUzunEnKisa(kelime);


    }

    public static void enUzunEnKisa(String[] kelime) {
        String enuzun = kelime[0];
        String enkisa = kelime[0];
        for (int i = 0; i < kelime.length; i++) {
            if (kelime[i].length() > enuzun.length()) {

                enuzun = kelime[i];

            }
            if (kelime[i].length() < enkisa.length()) {
                enkisa = kelime[i];

            }

        }
        System.out.println("en uzun " +enuzun);
        System.out.println("en kısa "+enkisa);
    }


}
