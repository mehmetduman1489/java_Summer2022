package recap1;

import java.util.Arrays;
import java.util.Scanner;

public class aa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        sentence.split(" ");
        String arr[]=new String[3];
        for (int i =arr.length-1; i >=0; i--) {
            arr[i]=sentence.split(" ")[i];


        }    reversed= Arrays.toString(arr);

        //Kodlarınızı burada sonlandırınız ve verilen yardımcı kodları değiştirmeyiniz.
        System.out.println(reversed);
    }
}
