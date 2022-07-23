package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        //iki tarih arasındaki süreyi bulma
        LocalDate tarih1 = LocalDate.of(1989, 9, 28);
        LocalDate tarih2 = LocalDate.now();
        Period period = Period.between(tarih2, tarih1);
        System.out.println(period);//P-32Y-9M-25D kac yıl gectigini verir
        System.out.println(period.getYears());//-32


    }
}
