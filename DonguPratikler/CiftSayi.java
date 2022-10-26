package DonguPratikler;
import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {
        int a, i =1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı yazınız:");
        a = input.nextInt();
        System.out.println(+a+ "'ya kadar olan çift sayılar:");



        while (i<=a) {
            if (i%2 ==0) {
                System.out.println(i);}
                i++;

            }
        /*
        for (int i =1; i<=a; i++){
            if (i%2 ==0){
                System.out.println(i);
            }
        }
         */





    }
}
