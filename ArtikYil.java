import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil, artikyil, artikyildegil, kalan;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir yıl giriniz:");
        yil = input.nextInt();
        kalan = yil % 4;

        if (kalan == 0) {
            System.out.println(+yil+"yılı artık bir yıldır.");
        }else {
            System.out.println(+yil+"yılı artık bir yıl değildir.");
        }








    }
}
