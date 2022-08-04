package patica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CiftVeDordunKati {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double toplam=0;
        double sayi = 0;
        do {
            System.out.println("bir sayı girin");
            sayi= scan.nextDouble();
            toplam+=sayi;
            if (sayi%2==0) System.out.println("girilen sayı çift olmamalı!!!");
        }
        while (sayi%2==1 || sayi%2==-1);
        System.out.println("girdiğiniz sayılardan tek olanlarının toplamı : "+toplam);
    }
}
