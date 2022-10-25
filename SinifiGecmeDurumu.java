import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, toplam=0, derssayi=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu yazın:");
        mat = input.nextInt();
        if ((mat<100) && (mat>0)) {
            toplam += mat;
            derssayi +=1;
        }else{
            System.out.println("Matematik notunuz geçersiz. Ortalamaya Katılamayacak. ");
        }

        System.out.println("Fizik notunuzu yazın:");
        fizik = input.nextInt();
        if ((fizik<100) && (fizik>0)) {
            toplam += fizik;
            derssayi +=1;
        }else{
            System.out.println("Fizik notunuz geçersiz. ");
        }

        System.out.println("Türkçe notunuzu yazın:");
        turkce = input.nextInt();
        if ((turkce<100) && (turkce>0)) {
            toplam += turkce;
            derssayi +=1;
        }else{
            System.out.println("Türkçe notunuz geçersiz. ");
        }

        System.out.println("Kimya notunuzu yazın:");
        kimya = input.nextInt();
        if ((kimya<100) && (kimya>0)) {
            toplam += kimya;
            derssayi +=1;
        }else{
            System.out.println("Kimya notunuz geçersiz. ");
        }

        System.out.println("Müzik notunuzu yazın:");
        muzik = input.nextInt();
        if ((muzik<100) && (muzik>0)) {
            toplam += muzik;
            derssayi +=1;
        }else{
            System.out.println("Müzik notunuz geçersiz. ");
        }

        double ortalama = toplam / derssayi;
        System.out.println("Ortalamanız:" +ortalama);

        if (ortalama>55) {
            System.out.println("Sınıfı geçtiniz,tebrikler..");
        }else {
            System.out.println("Malesef sınıfta kaldınız");
        }


    }
}
