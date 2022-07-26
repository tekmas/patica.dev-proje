package patica;

import java.util.Scanner;

public class Sinif_gecme_durumu {
    public static void main(String[] args) {
        double mat,turkce,muzik,fizik,kimya,ortalama = 0;
        Scanner scan=new Scanner(System.in);
        do {
        System.out.println("matematik notunu girin");
        mat= scan.nextDouble();
        System.out.println("türçe notunu girin");
        turkce= scan.nextDouble();
        System.out.println("müzik notunu girin");
        muzik= scan.nextDouble();
        System.out.println("fizik notunu girin");
        fizik= scan.nextDouble();
        System.out.println("kimya notunu girin");
        kimya= scan.nextDouble();

            if ((mat>=0 && mat<=100) && (turkce>=0 && turkce<=100) && (muzik>=0 && muzik<=100) && (fizik>=0 && fizik<=100) && (kimya>=0 && kimya<=100)) {
                ortalama=(mat+muzik+turkce+fizik+kimya)/5;
                if ((ortalama>55) && (ortalama<100)){
                    System.out.println("tebrikler. sınıfı geçtiniz");
                }else {
                    System.out.println("sınıfta kaldınız");
                }
            }else System.out.println("ders notları o ile 100 arasında olmalı!");
        }while (!((mat>=0 && mat<=100) && (turkce>=0 && turkce<=100) && (muzik>=0 && muzik<=100) && (fizik>=0 && fizik<=100) && (kimya>=0 && kimya<=100)));


    }
}
