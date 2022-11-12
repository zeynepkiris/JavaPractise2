package FunctionProject;
import java.util.Scanner;

public class PrimeNumberRecursive {
    static void prime(int number, int i){
        if (i == number){
            System.out.println(number+ " is a prime number");
            return;
        }else if (number%i == 0){
            System.out.println(number+ " is NOT a prime number");
            return;
        }
        prime(number, i+1);
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number: ");
        number = input.nextInt();
        prime(number, 2);


    }
}
