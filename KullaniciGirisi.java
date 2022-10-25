import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, select, yes, no, yenisifre;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();
        System.out.print("Şifreniz:");
        password = input.nextLine();

        if (userName.equals("patika.dev") && password.equals("java101")) {
            System.out.println("Giriş Yapıldı");
        }else {
            System.out.println("Şifreniz yanlıştır.Şifrenizi sıfırlamak ister misiniz? 1-yes/2-no");
            select = input.nextLine();
            if (select.equals("yes")) {
                System.out.println("yeni şifrenizi giriniz:");
                yenisifre = input.nextLine();
                if (yenisifre.equals("java101")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.(eski şifreniz ile aynı olamaz)");
                } else {
                    System.out.println("Şifreniz oluşturuldı");
                }
            }else{
                    System.out.println("Hoşçakalın:)");
            }
        }
    }
}


