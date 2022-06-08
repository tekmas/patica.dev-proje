package patica;

import java.util.Scanner;

public class Daire_alan_cevre {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dairenin yarıçapını girin");
        double yariçap= scan.nextDouble();
        double alan=pi*yariçap*yariçap;
        double cevre=2*pi*yariçap;
        System.out.println("lütfen daire diliminin merkez açısını girin");
        double a= scan.nextDouble();
        double dilim=(alan*a)/360;
        System.out.println("Dairenin alanı : "+alan+" cm karedir.\nDairenin çevresi : "+cevre+" cm karedir.\nDaire diliminin alanı : "+dilim+"cm karedir.");
    }
}
