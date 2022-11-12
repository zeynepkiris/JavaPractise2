package FunctionProject;
import java.util.Scanner;
public class Exponentiation {
    static int exp(int base, int exponent ) {
        if (base == 1){
            return 1;
        }else if (exponent == 0){
            return 1;
        }else {
            return base * exp(base, exponent-1);
        }
    }
    public static void main(String[] args) {
        int base, exponent;
        Scanner input = new Scanner(System.in);
        System.out.println("Write base: ");
        base = input.nextInt();;
        System.out.println("Write exponent: ");
        exponent = input.nextInt();
        System.out.println("Result: " + exp(base,exponent));


    }
}
