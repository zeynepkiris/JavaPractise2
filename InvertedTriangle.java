package DonguOdevler;
import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);
        System.out.print("Write how many lines: ");
        line = input.nextInt();
        for (int i=1; i<=line; i++){
            for (int j=0; j<=i-1; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*line)-(2*i-1); k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
