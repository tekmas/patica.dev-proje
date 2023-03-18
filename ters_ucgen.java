package patica;

import java.util.ArrayList;
import java.util.Scanner;

public class ters_ucgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("çizilcek üçgen kaç basamaklı olacak");
        int sayi = scan.nextInt();
        int num=1;
        ArrayList<Integer> cift_sayilar = new ArrayList<>();
        for (int i = 0; i < sayi; i++) {
            cift_sayilar.add(num);
            num+=2;
        }
        System.out.println(cift_sayilar);
        int deger=2;

        for (int i = sayi; i >=1 ; i--) {

                if (i != sayi) {
                    for (int k = i; k < sayi; k++) {
                        System.out.print(" ");
                    }
                }
                    for (int j = i+deger; j >=1; j--) {
                        System.out.print("*");
                }
            deger--;
            System.out.println("");
            }
        }
    }

