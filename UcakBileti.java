import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int mesafe, yas, ytipi;
        double tutar, tutar2, tutar3, indirim1, indirim2, indirimlitutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz:");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı girin:");
        yas = input.nextInt();
        System.out.print("1- Tek Yön 2- Gidiş -Dönüş");
        System.out.print("Seçim yapınız 1 veya 2): ");
        ytipi = input.nextInt();

        tutar = mesafe * 0.1;

        if (yas<0 || mesafe<0) {
            System.out.println("Hatalı giriş yaptınız.");
        }else {
            System.out.println("Sizin için en uygun fiyat yükleniyor..");
            if (yas<12) {
                indirim1 = tutar * 0.5;
            } else if (yas>=12 && yas<=24) {
                indirim1 = tutar * 0.1;
            } else if (yas>65) {
                indirim1 = tutar * 0.3;
            } else {
                indirim1 = 0;
            }
            tutar2 = tutar - indirim1;


            switch (ytipi) {
                case 1:
                    indirimlitutar = tutar2;
                    System.out.println("Milsiz Ödeyeceğiniz Fiyat:" +tutar);
                    System.out.println("İndirimli Fiyat:" +indirimlitutar);
                    break;
                case 2:
                    indirim2 = tutar2 * 0.2;
                    indirimlitutar = (tutar2 - indirim2) * 2;
                    tutar3 = tutar * 2;
                    System.out.println("Milsiz Ödeyeceğiniz Fiyat:" +tutar3);
                    System.out.println("İndirimli Fiyat:" +indirimlitutar);
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
            }








        }







    }
}
