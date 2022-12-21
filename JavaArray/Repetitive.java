package JavaArray;

import java.util.Arrays;
import java.util.Scanner;

public class Repetitive {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = input.nextInt();
        int[] list = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(list));
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int j = 0; j < list.length; j++) {
            for (int k = 0; k < list.length; k++) {
                if ((j != k) && (list[j] == list[k]) && (list[j] % 2 == 0)) {
                    duplicate[startIndex++] = list[j];
                }
            }
            System.out.println("Repetitives" + Arrays.toString(duplicate));

        }

    }
}
