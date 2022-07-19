package day07_ifStatements;

public class C02_ifStatements {
    public static void main(String[] args) {
        int sayi = 10;
        if (sayi > 0) {
            System.out.println("sayi pozitif");
        }
        if (sayi % 2 == 0) {
            System.out.println("sayi çift");
        }
        if (sayi % 5 == 0) {
            System.out.println("sayi 5in katı");
        }
        //basit if cümlesi kodun diğer parcalarından bagimsizdir. sadece kontrol eder. sart uyuyorsa calısır yoksa calısmaz.
        //Birden fazla basit if cümlesi varsa girilen sarta bagli olarak tümünde if body si calisabilir, kısmen if body leri calisabilir veya hicbir body si calismayabilir.
    }
}
