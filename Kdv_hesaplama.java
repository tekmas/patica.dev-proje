package patica;

import java.util.Scanner;

public class Kdv_hesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen tutarı girin");
        double fiyat= scan.nextDouble();
        double kdv=(fiyat>0 && fiyat<1000)?0.18:0.08;
        double kdvli_fiyat=(fiyat*kdv)+fiyat;
        System.out.println("kdv'li tutar : "+kdvli_fiyat+" tl'dir.");
        double kdv_tutari=fiyat*kdv;
        System.out.println("kdv tutarı : "+kdv_tutari+" tl'dir.");
    }
}
