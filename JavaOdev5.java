package KodluyoruzBackend;

import java.util.Scanner;

public class JavaOdev5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        int mesafe = input.nextInt();

        System.out.println("Yaşınızı giriniz :");
        int yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculuk = input.nextInt();
        double birimFiyat = 0.10; // KM başına ücret
        double toplamFiyat = mesafe * birimFiyat;
        switch (yolculuk) {
            case 1:
                if (yas < 12) {
                    toplamFiyat *= 0.5; // %50 indirim
                } else if (yas >= 12 && yas <= 24) {
                    toplamFiyat *= 0.9; // %10 indirim
                } else if (yas >= 65) {
                    toplamFiyat *= 0.7; // %30 indirim
                }
                System.out.println("Toplam Bilet Fiyatı: " + toplamFiyat + " TL");
                break;
            case 2:
                toplamFiyat *= 0.8; // %20 indirim
                System.out.println("Toplam Bilet Fiyatı: " + toplamFiyat + " TL");
                break;
            default:
                System.out.println("Hatalı veri Girdiniz");
        }
    }

}
