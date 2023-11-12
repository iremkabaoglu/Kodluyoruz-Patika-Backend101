package KodluyoruzBackend;

import java.util.Scanner;

public class JavaOdev1 {
    public static void main(String[] args) {
        //Vücut Kitle Endeksi Hesaplama Uygulaması Ödevi
        int kilo;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        double boy= input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo= input.nextInt();
        double KitIndex= kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz :"+KitIndex);
    }
}
