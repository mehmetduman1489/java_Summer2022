package JavaPractice;

public class Q13_ifStatement3 {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */
        int fiyat=10;

        if (fiyat<10){
            System.out.println("ucuz");
        }else if (fiyat<20){
            System.out.println("normal");
        }else{
            System.out.println("pahalı");
        }

        //ternary metodu
        String result=(fiyat<=10)?"ucuz":fiyat<=20?"normal":"pahalı";
        System.out.println("result = " + result);
    }
}
