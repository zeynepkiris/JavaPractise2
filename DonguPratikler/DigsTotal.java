package DonguPratikler;
import java.util.Scanner;
public class DigsTotal {
    public static void main(String[] args) {
        int number, dig;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        number = input.nextInt();
        int tempNumber = number, total=0;
        while (tempNumber!=0) {
            dig = tempNumber%10;
            tempNumber = tempNumber/10;
            total+=dig;
        }
        System.out.println(+number+" sayısının basamaklarının toplamı:" +total);


    }
}
