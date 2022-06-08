package patica;

import java.util.Scanner;

public class Manav_kasa {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma =3.67;
       double domates = 1.11;
        double muz= 0.95;
        double patlıcan = 5.00;
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kaç kg. armut alacağınızı girin");
        double armut_kg= scan.nextDouble();
        System.out.println("lütfen kaç kg. elmma alacağınızı girin");
        double elma_kg=scan.nextDouble();
        System.out.println("lütfen kaç kg. domates alacağınızı girin");
        double domates_kg= scan.nextDouble();
        System.out.println("lütfen kaç kg. muz alacağınızı girin");
        double muz_kg= scan.nextDouble();
        System.out.println("lütfen kaç kg. patlıcan alacağınızı girin");
        double patlican_kg= scan.nextDouble();
        double total=armut*armut_kg+elma*elma_kg+domates*domates_kg+muz*muz_kg+patlıcan*patlican_kg;
        System.out.println("ödenecek toplam tutar : "+total+" tl.");
    }
}
