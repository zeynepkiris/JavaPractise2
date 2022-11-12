package FunctionProject;
import java.util.Scanner;

public class CalculatorPlus {
    static int sum(int a,int b) {
        int result = a + b;
        System.out.println("Toplam: "+ result);
        return result;
    }
    static int minus(int a,int b) {
        int result = a - b;
        System.out.println("Çıkarma: "+ result);
        return result;
    }
    static int times(int a,int b) {
        int result = a * b;
        System.out.println("Çarpma: "+ result);
        return result;
    }
    static int divide(int a,int b) {
        if (b == 0){
            System.out.println("İkinci sayı sıfırdan büyük olmalıdır");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme: "+ result);
        return result;
    }
    static int power(int a,int b) {
        int result = 1;
        for (int i = 1; i<= b; i++){
            result *= a;
        }
        System.out.println("Üs Alma: "+ result);
        return result;
    }
    static int mod(int a,int b) {
        int result = a % b;
        System.out.println("Mod: "+ result);
        return result;
    }
    static void rect(int a,int b) {
        System.out.println("Çevresi "+ (2*(a+b)));
        System.out.println("Alanı "+ (a*b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Diktörtgen Alan ve Çevre Hesaplama\n" +
                "8- ÇIKIŞ";

        System.out.println(menu);
        while (true) {

            System.out.print("Bir İşlem Seçiniz: ");
            select = input.nextInt();
            if (select == 8) {
                System.out.println("Güle güle..");
                break;
            }
            System.out.print("Birinci sayıyı giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    rect(a,b);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz.");
            }


        }




    }
}
