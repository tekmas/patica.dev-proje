package patica;

import java.util.ArrayList;
import java.util.List;

public class Tekrarli_sayi_bulma {
    static List<Integer> tekrarli_sayilar=new ArrayList<>();
    static int[] dizi={15,12,788,788,1,-1,2,-778,2,0};
    //dizideki çift sayılardan tekrar edenleri yazdır
    public static void main(String[] args) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0){
                for (int j = 0; j < dizi.length; j++) {
                    if (i!=j && dizi[j]==dizi[i]){

                    tekrarli_sayilar.add(dizi[j]);
                }}
            }
        }
        System.out.println(tekrarli_sayilar);
    }
}
