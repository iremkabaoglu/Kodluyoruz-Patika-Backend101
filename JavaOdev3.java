package KodluyoruzBackend;
import java.util.Scanner;

public class JavaOdev3 {
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        int sayi;
        int sayac;
        int num;
        int i;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        sayi = input.nextInt();
        if (sayi > 0) {
            for (sayac = 1; sayac <= sayi; sayac++) {
                System.out.print(sayac + ".Sayıyı giriniz :");
                num = input.nextInt();
                if (num < min) {
                    min = num;
                }

                if (num > max) {
                    max = num;
                }
            }
            System.out.println("En küçük sayı: " + min);
            System.out.println("En büyük sayı: " + max);
        } else {
            System.out.println("Hatalı sayı girişi yaptınız");
            return;

        }
    }
}
