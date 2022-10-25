import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        boolean error = true;
        String ay, ay1 = "ocak", ay2 = "şubat", ay3 = "mart", ay4 = "nisan", ay5= "mayıs", ay6 = "haziran";
        String ay7 = "temmuz", ay8= "ağustos", ay9 = "eylül", ay10= "ekim", ay11 = "kasım", ay12 = "aralık";
        String burc = "";
        int day;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz Ayı yazı ile yazınız.:");
        ay = input.nextLine();
        System.out.println("Ayın hangi günü doğdunuz?");
        day = input.nextInt();

        if (ay.equals(ay1)) {
            if (day>21) {
                burc = "Kova";
            } else {
                burc = "Oğlak";
            }
        } else if (ay.equals(ay2)) {
            if (day>19) {
                burc = "Balık";
            } else {
                burc = "Kova";
            }

        } else if (ay.equals(ay3)) {
            if (day>20) {
                burc = "Koç";
            } else {
                burc = "Balık";
            }

        } else if (ay.equals(ay4)) {
            if (day>20) {
                burc = "Boğa";
            } else {
                burc = "Koç";
            }

        } else if (ay.equals(ay5)) {
            if (day>21) {
                burc = "İkizler";
            } else {
                burc = "Boğa";
            }

        } else if (ay.equals(ay6)) {
            if (day>22) {
                burc = "Yengeç";
            } else {
                burc = "İkizler";
            }

        } else if (ay.equals(ay7)) {
            if (day>22) {
                burc = "Aslan";
            } else {
                burc = "Yengeç";
            }

        } else if (ay.equals(ay8)) {
            if (day>22) {
                burc = "Başak";
            } else {
                burc = "Aslan";
            }

        } else if (ay.equals(ay9)) {
            if (day>22) {
                burc = "Terazi";
            } else {
                burc = "Başak";
            }

        } else if (ay.equals(ay10)) {
            if (day>22) {
                burc = "Akrep";
            } else {
                burc = "Terazi";
            }

        } else if (ay.equals(ay11)) {
            if (day>21) {
                burc = "Yay";
            } else {
                burc = "Akrep";
            }

        }else {
            burc = "Yay";
        }

        if (day>=1 && day<=31) {
            System.out.println("Burcunuz:" +burc);
        }else {
            System.out.println("Hatalı Giriş Yaptınız.");
        }


    }
}
