package patica;

import java.util.Scanner;

public class Uslu_sayi_hesapla {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("üssü alınacak sayıyı girin");
        int n=scan.nextInt();
        System.out.println("girdiğiniz sayının kaçıncı kuvvetini alacaksınız");
        int k=scan.nextInt();
        int total=1;
        for (int i = 1; i <=k ; i++) {
    total*=n;

        }
        System.out.println(n+" üzeri "+k+" = "+total);
    }
}
