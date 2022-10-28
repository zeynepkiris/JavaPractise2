package DonguOdevler;
import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        int element, counter=0, n1=0, n2=1,n3;
        Scanner input= new Scanner(System.in);
        System.out.println("Write how many elements of Fibonacci: ");
        element = input.nextInt();

        for(counter=0; counter<element; counter++) {
            n3 = n1 + n2;
            System.out.print(" "+n1);
            n1=n2;
            n2=n3;


        }



    }
}
