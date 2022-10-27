package DonguPratikler;
import java.util.Scanner;
public class ExpNumberAb {
    public static void main(String[] args) {
        int a,b,i=1, ab=1;
        Scanner exp= new Scanner(System.in);
        System.out.print("(a)taban sayıyı giriniz:");
        a= exp.nextInt();
        System.out.print("(b) üssü giriniz:");
        b= exp.nextInt();
        for (i=1; i<=b; ab*=a){
            i++;

        }
        System.out.println(+a+"^"+b+"="+ab);

    }


}
