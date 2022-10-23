import java.util.Scanner;

public class BasitHesapMak {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı girin:");
        n1 = input.nextInt();
        System.out.println("ikinci sayıyı girin");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi yapınız:");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if (n2!=0){
                    System.out.println(n1 / n2);
                }else{
                    System.out.println("Bir Sayı Sıfıra Bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");

        }
        }
    }
