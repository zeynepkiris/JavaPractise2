package FunctionProject;
import java.util.Scanner;
public class Sequences {
    static void seq(int number,int temp,int n){
        if(number > 0 && n == 0){
            System.out.print(number + " ");
            number -=5;
            seq(number,temp,0);
        }
        else if (number <= 0) {
            System.out.print(number + " ");
            number +=5;
            seq(number,temp,1);
        }
        else if(number > 0 && number <= temp && n == 1){
            System.out.print(number + " ");
            number  +=5;
            seq(number,temp,1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number: ");
        int number = input.nextInt();
        seq(number, number, 0);


    }
}
