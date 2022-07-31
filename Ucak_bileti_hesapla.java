package patica;

import java.util.Scanner;

public class Ucak_bileti_hesapla {
    public static void main(String[] args) {
        double indirimli_bilet;
        Scanner scan = new Scanner(System.in);
        double km;
        int yas,yol_tip;
     do {
         System.out.println("gidilecek mesafeyi km olarak girin");
         km = scan.nextDouble();
         System.out.println("yaşınızı girin");
         yas = scan.nextInt();
         System.out.println("Tek Yön için 1, Gidiş Dönüş için 2 yazın");
         yol_tip = scan.nextInt();
         double bilet=km*0.10;
         if (km>=0 && yas>=0 && (yol_tip==1 || yol_tip==2)){
             if (yas<12){
                 indirimli_bilet=bilet*0.50;
             }
             else if (yas>=12 && yas<=24){
                 indirimli_bilet=bilet*0.90;
             }
             else if (yas>24 && yas<=65){
                 indirimli_bilet=bilet*1;
             }
             else {
                 indirimli_bilet=bilet*0.70;
             }
             if (yol_tip==2) {
                 indirimli_bilet = indirimli_bilet * 0.80;
                 System.out.println(" Ödemeniz gereken bilet tutarı : "+(2*indirimli_bilet)+"TL");

             }else {
                 System.out.println("Ödemeniz gereken bilet tutarı : "+(indirimli_bilet)+"TL");
             }
         }
         else{
             System.out.println("hatalı veri girdiniz");
         }
     }
while (!(km>=0 && yas>=0 && (yol_tip==1 || yol_tip==2)));
    }
    }
