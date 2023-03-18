package patica;

import java.util.ArrayList;

public class asal_sayilar {
    public static void main(String[] args) {
        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
        ArrayList<Integer> bolenleri = new ArrayList<>();
        ArrayList<Integer> asal_sayilar = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i%j==0)bolenleri.add(j);
            }
            if (bolenleri.size()==1)asal_sayilar.add(i);
            bolenleri.clear();
        }
        System.out.println("1 ile 100 arasındaki asal sayılar : "+asal_sayilar);
    }
}
