package patica;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km_ucreti=2.20;
        int acılıs=10;
        Scanner scan=new Scanner(System.in);
        System.out.println("mesafeyi yazınız");
        double mesafe= scan.nextDouble();
        double odenecek_tutar=(acılıs+mesafe*km_ucreti)<20 ? 20:acılıs+mesafe*km_ucreti;
        System.out.println("ödenecek tutar "+odenecek_tutar+" tl'dir.");
    }
}
