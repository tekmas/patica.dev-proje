package patica;

import java.util.Arrays;
import java.util.Scanner;

public class En_yakin_sayiyi_bulma {
    static int en_buyuk_sayi = 0;
    static int en_kucuk_sayi = 0;
    static int[] dizi={15,12,788,1,-1,-778,2,0};

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        int num= scan.nextInt();

        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length; i++) {
            if (num<dizi[i]){
                en_buyuk_sayi=dizi[i];
            break;}
        }
        for (int i = dizi.length-1; i >=0; i--) {
            if (num>dizi[i]){
                en_kucuk_sayi=dizi[i];
                break;}
        }
        System.out.println("dizideki sayılardan, girilen sayıdan büyük ve en yakın sayı : "+en_buyuk_sayi+"\ndizideki sayılardan, girilen sayıdan küçük ve en yakın sayı : "+en_kucuk_sayi);
    }
}
