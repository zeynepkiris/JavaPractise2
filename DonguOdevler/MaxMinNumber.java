package DonguOdevler;
import java.util.Scanner;
public class MaxMinNumber {
    public static void main(String[] args) {
        int right, number, max=1, min=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceğinizi yazınız.:");
        right = input.nextInt();
        int i;
        for (i = 1; i <= right; i++) {
            System.out.print(+i+". sayıyı giriniz:");
            number = input.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max){
                max = number;
            }
            if (number<min){
                min = number;
            }
        }
        System.out.println("Sayıların en büyüğü: " +max);
        System.out.println("Sayıların en küçüğü: " +min);



    }

}
