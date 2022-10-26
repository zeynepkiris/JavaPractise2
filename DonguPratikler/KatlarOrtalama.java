package DonguPratikler;
import java.util.Scanner;
public class KatlarOrtalama {
    public static void main(String[] args) {
        int a, toplam=0, sayi=0;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı yazınız:");
        a = input.nextInt();
        System.out.println(+a+"sayısına kadar olan 3 ve 4 ün tamkatı sayılar:");
        for (int i=1; i<=a; i++){
            if ((i%3 ==0) && (i%4 ==0)) {
                System.out.println(i);
                toplam +=i;
                sayi++;

            }
        }
        System.out.println("Bu sayıların toplamı:" +toplam);
        ortalama = toplam / (sayi);
        System.out.println("Aritmetik Ortalaması:" +ortalama );
    }




}
