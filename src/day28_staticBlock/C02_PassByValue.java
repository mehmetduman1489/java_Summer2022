package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;

        System.out.println(indirimliFiyat(satisFiyati));//90
        System.out.println(indirimliFiyat(satisFiyati));//
    //iki farkli methodda satisFiyatı isminde variable olabiliir java buna itiraz etmez
        //cunku scopelari farklıdır
    }


    public static double indirimliFiyat(double orjinalFiyat) {
        //yüzde 10 indirim yapip main methoda döndürsün
         double satisFiyati=orjinalFiyat*0.9;
        return satisFiyati;
    }
}
