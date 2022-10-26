package DonguPratikler;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int a, total=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Bir Sayı Giriniz:");
            a= input.nextInt();
            if (a%4 == 0) {
                total += a;
            }
        } while (a%2 ==0);

        System.out.println("Şimdiye kadar yazdığınız çift ve 4 ün katı olan sayıların toplamı:" +total);



    }

}
