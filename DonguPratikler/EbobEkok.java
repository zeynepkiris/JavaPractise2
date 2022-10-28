package DonguPratikler;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int n1,n2, i=1, ebob = 0, ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz.:");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz.:");
        n2 = input.nextInt();
        if (n1<n2){
            while (i<n1){
                if ((n1%i == 0) && (n2%i == 0)) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Bu iki sayının ebobu= " +ebob);
        }else {
            while (i < n2) {
                if (((n1 % i) == 0) && ((n2 % i) == 0)) {
                   ebob = i;
                }
                i++;
            }
            System.out.println("Bu iki satının ebobu= " + ebob);
        }
        ekok = (n1*n2) / ebob;
        System.out.println("Bu iki satının ekoku= " + ekok);

    }
}


