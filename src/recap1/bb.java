package recap1;

import java.util.Arrays;
import java.util.Scanner;

public class bb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String arr[] = sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        String reversed = "";
        String []arr1=new String[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {



            arr1[0]=arr[i];


        }System.out.println(Arrays.toString(arr1));
    }
}
