package patica;

import java.util.ArrayList;
import java.util.Scanner;
        /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
        ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
        değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.*/
public class mukemmel_sayi {
    public static void main(String[] args) {
        ArrayList<Integer> pozitif_bolenler = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayi = scan.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) pozitif_bolenler.add(i);
        }
        //System.out.println(pozitif_bolenler);
        int toplam = 0;
        for (int i = 0; i < pozitif_bolenler.size(); i++) {
            toplam += pozitif_bolenler.get(i);
        }
        if (sayi == toplam) {
            System.out.println(sayi + " mükemmel sayıdır");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir");
        }


    }
}