package day07_ifStatements;

public class C01_AndOparetorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;
        System.out.println(a>0&&b<20&&c>=b);//true
        System.out.println(a<0&&b<20&&c<=b);//false, a<0 olmadığı için.
        // java and operatorunfda iki secenek sunar. && kullanırsak ilk false bulduğunda artık geriye kalan şartları incelemez
        //& kullanırsak  tüm şartları inceleyerek sonucu belirler.
       // & operatoru && operatoruna göre dahayavas olabilir.
        System.out.println(a<0&b<20&c<=b);//sonuc false, hepsini inceler ve diğerine göre daha yavastir.


    }
}
