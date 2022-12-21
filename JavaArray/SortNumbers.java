package JavaArray;

import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        n = input.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". elemanı giriniz:  " );
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama:" +Arrays.toString(list));

    }


}
