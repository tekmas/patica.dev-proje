package patica;

import java.util.*;

public class min_max_deger_bulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kaç sayı gireceksin");
        int sayi=scan.nextInt();
        ArrayList<Integer> sayilar = new ArrayList<>();
        int index=0;
        for (int i = 1; i <= sayi; i++) {
            System.out.println(i+". sayıyı girin");
            int num=scan.nextInt();
            sayilar.add(num);
            System.out.println(i+". sayı ="+sayilar.get(index));
            index++;
        }

        Collections.sort(sayilar);
        int enkucuk=sayilar.get(0);
        int enbuyuk=sayilar.get((sayilar.size())-1);
        System.out.println("en büyük sayı ="+enbuyuk+"\nen küçük sayı ="+enkucuk);

    }
}
