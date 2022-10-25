import java.util.Scanner;
public class SicaklikEtkinlik {
    public static void main(String[] args) {
        double sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz:");
        sicaklik = input.nextDouble();

        if (sicaklik>10 && sicaklik<15){
            System.out.println("Senin için iki öneri var: Pikniğe de Sinemaya da gidebilirsin");
        } else if (sicaklik>5 && sicaklik<10) {
            System.out.println("Hava ne sıcak ne soğuk, sinema iyi fikir..");
        } else if (sicaklik>15 && sicaklik<25) {
            System.out.println("Hava dışarıdaki bir etkinlik için uygun. Pikniğe ne dersin?");
        } else if (sicaklik>25) {
            System.out.println("Hava oldukça sıcak, serinlemek için yüzmek iyi fikir.");
        }else {
            System.out.println("Kayak eğlenceli olabilir.");
        }
    }
}
