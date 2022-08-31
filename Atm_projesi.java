package patica;

import java.util.Scanner;

import static patica.Uslu_sayi_hesapla.scan;

public class Atm_projesi {
    static String userName, password;
    static Scanner input = new Scanner(System.in);
    static int giris_hakki = 3;
    static int balance = 1500;
    static int select;
    static void giris(){
        System.out.print("Kullanıcı Adınız :");
        userName = input.nextLine();
        System.out.print("Parolanız : ");
        password = input.nextLine();
    }
    public static void main(String[] args) {
        giris();
        int devamMi = 0;
        if (userName.equalsIgnoreCase("patika") && password.equalsIgnoreCase("dev123")) {
            System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
            atm_run();
            Scanner scan = new Scanner(System.in);
            System.out.println("işleminize devam etmek istiyorsanız 1, istemiyorsanız 2 yazın");
            devamMi = scan.nextInt();
            while (devamMi == 1) {
                atm_run();
            }// else{
                System.out.println("Tekrar bekleriz.İyi günler.");

        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre. Kalan Hakkınız : " + giris_hakki + " Tekrar deneyiniz.");
            while (giris_hakki==0) {
                giris();
                giris_hakki--;
            }
        }
        if (giris_hakki == 0) {
            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
        }
    }
    static void atm_run(){
        System.out.println("1-Para yatırma\n" +
                "2-Para Çekme\n" +
                "3-Bakiye Sorgula\n" +
                "4-Çıkış Yap");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.print("yatırılacak Para miktarını yazın : ");
                int price = input.nextInt();
                balance += price;
                break;
            case 2:
                System.out.print("Çekilecek para miktarını yazın : ");
                int price2 = input.nextInt();
                if (price2 > balance) {
                    System.out.println("Bakiye yetersiz.");
                } else {
                    balance -= price2;
                }
                break;
            case 3:
                System.out.println("Bakiyeniz : " + balance);
                break;
            case 4:
                System.out.println("güvenli şekilde çıkış yaptınız. Tekrar bekleriz...");
                System.exit(0);
        }
    }
}
