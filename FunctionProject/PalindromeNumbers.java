package FunctionProject;
import java.util.Scanner;

public class PalindromeNumbers {
    static boolean isPalindrome (int number){
        int tempNumber=number, reverseNumber = 0, lastNumber;
        while (tempNumber!=0){
            lastNumber = tempNumber%10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            tempNumber/=10;
        }
        if (number == reverseNumber)
        return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Program");
        Scanner pal = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = pal.nextInt();
        if (isPalindrome(number) == true){
            System.out.println(+number+" is Palindrome.");
        }else {
            System.out.println(+number+" is NOT Palindrome.");
        }

    }
}
