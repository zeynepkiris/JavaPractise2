package DonguPratikler;
import java.util.Scanner;
public class ExpNumber45 {
    public static void main(String[] args) {
        int a, i=1, t=1;
        Scanner exp =new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        a = exp.nextInt();

        System.out.println("Yazdığınız sayıya kadar 4ün kuvvetleri");
        for (i=1; i<=a; i*=4) {
            System.out.println(i);
        }
        System.out.println("Yazdığınız sayıya kadar 5in kuvvetleri");
        for (t=1; t<=a; t*=5) {
            System.out.println(t);
        }


    }
}
