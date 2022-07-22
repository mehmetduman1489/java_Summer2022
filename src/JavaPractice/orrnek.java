package JavaPractice;

public class orrnek {
    String marka="Marka Belirtilmedi";
    int fiyat;
    double agırlık;
    orrnek(){

    }

    public orrnek(String marka) {
        this.marka = marka;
    }

    public orrnek(String marka, int fiyat) {
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public orrnek(String marka, int fiyat, double agırlık) {
        this.marka = marka;
        this.fiyat = fiyat;
        this.agırlık = agırlık;
    }

    @Override
    public String toString() {
        return "orrnek{" +
                "marka='" + marka + '\'' +
                ", fiyat=" + fiyat +
                ", agırlık=" + agırlık +
                '}';
    }
}
