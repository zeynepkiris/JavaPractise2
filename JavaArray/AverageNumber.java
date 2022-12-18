package JavaArray;
import java.util.Scanner;
import java.util.Arrays;
public class AverageNumber {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements that you want to average: ");
        n = input.nextInt();
        int [] list = new int [n];

        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
           list[i]= input.nextInt();
        }

        System.out.println(Arrays.toString(list));
        double sum = 0.0;
        double average = 0.0;
        for (int j=0; j<list.length; j++) {
            sum += list[j];
        }

        average = sum / list.length;
        System.out.println("The average of elements: " + average);




    }




}

