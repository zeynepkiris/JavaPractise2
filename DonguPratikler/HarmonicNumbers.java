package DonguPratikler;
import java.util.Scanner;
public class HarmonicNumbers {
    public static void main(String[] args) {
        int number;
        Scanner harm = new Scanner(System.in);
        System.out.println("Bir n sayısı giriniz:");
        number = harm.nextInt();
        double total=0, i=1;
        while (i<=number){
            total+= (1.0/i);
            i++;
        }
        System.out.println("1den "+number+" sayısına kadar olan 1+1/2+1/3+..+1/"+number+" dizisinin toplamı: "+total);



    }
}
