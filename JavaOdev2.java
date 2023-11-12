package KodluyoruzBackend;
import java.util.Scanner;

public class JavaOdev2 {
    public static void main(String[] args){

    String userName, password;
    Scanner input = new Scanner(System.in);
    int right = 3;
    int balance = 1500;
    int select;
        while(right>0)

    {
        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Parolanız: ");
        password = input.nextLine();
        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz.");
            do {

                System.out.println("1-Para yatırma\n" +
                        "2-Para çekme\n" +
                        "3-Bakiye Sorgulama\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz.");
                select = input.nextInt();
                if (select == 1) {
                    System.out.println("Para Miktarı :");
                    int price = input.nextInt();
                    balance += price;
                } else if (select == 2) {
                    System.out.println("Para Miktarı: ");
                    int price = input.nextInt();
                    if (price > balance) {
                        System.out.println(" Bakiye yetersiz");
                    } else {
                        balance -= price;
                    }

                } else if (select == 3) {
                    System.out.println("Bakiyeniz :" + balance);
                }
            } while (select != 4);
            System.out.println("Tekrar görüşmek üzere.");
            break;
        } else {
            System.out.println("Hatalı kullanıcı adı ve şifre Tekrar deneyiniz");
            System.out.println("Kalan hakkınız : " + --right);
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");

            } else {
                System.out.println("kalan hakkınız" + right);
            }
        }

    }
}
}


