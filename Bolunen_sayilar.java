package patica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bolunen_sayilar {
    public static void main(String[] args) {
        /*Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

                Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
        tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı yazın");
        int sayi= scan.nextInt();
        int i=0;
        List <Integer> sayilar=new ArrayList<Integer>();
        while (i <= sayi){
            if (i%3==0 && i%4==0) {
                sayilar.add(i);
            }
        i++;
        }
        System.out.println("0'dan yazılan sayıya kadar olan sayılardan 3 ve 4'e bölünen sayılar "+sayilar);
    }
}
