package patica;

import java.util.Scanner;

public class hesap_makinesi {
            static void plus() {
            Scanner scan = new Scanner(System.in);
                System.out.println("kaç sayıyı toplayacaksınız?");
                int adet= scan.nextInt();
            int number, result = 0;
                for (int j = 1; j <= adet; j++) {
                System.out.print(j + ". sayı :");
                number = scan.nextInt();
                if (number == 0) {
                    break;
                }
                result += number;
            }
            System.out.println("Sonuç : " + result);
        }

        static void minus() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Kaç adet sayı gireceksiniz :");
            int counter = scan.nextInt();
            int number, result = 0;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = scan.nextInt();
                if (i == 1) {
                    result += number;
                    continue;
                }
                result -= number;
            }

            System.out.println("Sonuç : " + result);
        }

        static void times() {
            Scanner scan = new Scanner(System.in);
            System.out.println("kaç sayıyı çarpacaksın?");
            int adet= scan.nextInt();
            int number, result = 1;

            for (int j = 1; j <= adet; j++) {
                System.out.print(j + ". sayı :");
                number = scan.nextInt();
                if (number == 1)
                    break;

                if (number == 0) {
                    result = 0;
                    break;
                }
                result *= number;
            }

            System.out.println("Sonuç : " + result);
        }

        static void divided() {
            double number, result = 0.0;
            Scanner scan = new Scanner(System.in);
            System.out.print("Kaç adet sayı gireceksiniz :");
            int counter = scan.nextInt();
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = scan.nextDouble();
                if (i != 1 && number == 0) {
                    System.out.println("Böleni 0 giremezsiniz.");
                    continue;
                }
                if (i == 1) {
                    result = number;
                    continue;
                }
                result /= number;
            }

            System.out.println("Sonuç : " + result);
        }

        static void power() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Taban değeri giriniz :");
            int base = scan.nextInt();
            System.out.print("Üs değeri giriniz :");
            int exponent = scan.nextInt();
            int result= (int) Math.pow(base,exponent);

            System.out.println("Sonuç : " + result);
        }

        static void factorial() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayı giriniz :");
            int n = scan.nextInt();
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            System.out.println("Sonuç : " + result);
        }
    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz :");
        double number1 = scan.nextDouble();
        System.out.print("ilk sayıyı giriniz :");
        double number2 = scan.nextDouble();
          double  result = number1%number2;
        System.out.println("Sonuç : " + result);

        }
    static void dortgen() {
        Scanner scan = new Scanner(System.in);
        System.out.print("uzun kenarı giriniz :");
        double number1 = scan.nextDouble();
        System.out.print("kısa kenarı giriniz :");
        double number2 = scan.nextDouble();
        double  alan = number1*number2;
        double  cevre = (number1*2)+(number2*2);
        System.out.println("dikdörtgenin alanı : " + alan+"\ndikdörtgenin çevresi : " + cevre);

    }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int select;
            String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";

            do {
                System.out.println(menu);
                System.out.print("Lütfen bir işlem seçiniz :");
                select = scan.nextInt();
                switch (select) {
                    case 1:
                        plus();
                        break;
                    case 2:
                        minus();
                        break;
                    case 3:
                        times();
                        break;
                    case 4:
                        divided();
                        break;
                    case 5:
                        power();
                        break;
                    case 6:
                        factorial();
                        break;
                    case 7:
                        mod();
                        break;
                    case 8:
                        dortgen();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                }
            } while (select != 0);


        }
    }