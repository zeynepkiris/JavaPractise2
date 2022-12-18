package JavaArray;
import java.util.Scanner;
import java.util.Arrays;
public class MaxMinNumber {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements that you want to find maximum - minimum: ");
        n = input.nextInt();
        int [] list = new int [n];

        System.out.print("Enter the elements: ");
        for(int j=0; j<n; j++)
        {
            list[j]= input.nextInt();
        }

        System.out.println(Arrays.toString(list));

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("The maximum of elements: " +max);
        System.out.println("The minimum of elements: " +min);



    }




}
