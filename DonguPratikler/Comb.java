package DonguPratikler;

import java.util.Scanner;

public class Comb {
    public static void main(String[] args) {

        int n,r, total1=1, total2=1, total3=1, i=1,t=1,z=1, combination;
        Scanner comb = new Scanner(System.in);
        System.out.print("Kümenin kaç elemanlı olduğunu giriniz(n):");
        n= comb.nextInt();
        System.out.print("Kaç elemanlı kombinasyonlarını bulalım, yazınız(r):");
        r = comb.nextInt();

        for (i=1; i<=n; i++){
            total1*=i;
        }
        System.out.println(+n+"!="+total1+" (n!)");
        for (t=1; t<=r; t++){
            total2*=t;
        }
        System.out.println(+r+"!="+total2+" (r!)");
        for (z=1; z<=(n-r); z++){
            total3*=z;
        }
        System.out.println("("+n+"-"+r+")!="+total3+" (n-r)!");

        System.out.println(" C(n,r) = n! / (r! * (n-r)!)");
        combination = total1 / (total2*total3);
        System.out.println(+n+" elemanlı kümenin "+r+" elemanlı farklı grupların sayısı:" +combination);



    }
}
