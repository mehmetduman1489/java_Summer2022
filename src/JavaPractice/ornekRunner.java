package JavaPractice;

public class ornekRunner {
    public static void main(String[] args) {

        orrnek ornek1 = new orrnek();
        ornek1.marka = "Nutella";
        ornek1.fiyat = 40;
        ornek1.agırlık = 1;
        System.out.println("Birinci ürün Bilgileri\nMarka:" + ornek1.marka + "\n" + ornek1.marka + "nın fiyatı:" + ornek1.fiyat + "Tl" + " \n" + ornek1.marka + "nın Agırılıgı :" + ornek1.agırlık + "Kg'dır");
        orrnek ornek2 = new orrnek();
        System.out.println("İkinci ürün Bilgileri\nMarka:" + ornek2.marka + "\n" + ornek2.marka + "nın fiyatı:" + ornek2.fiyat + "Tl" + " \n" + ornek2.marka + "nın Agırılıgı :" + ornek2.agırlık + "Kg'dır");

    }
}
