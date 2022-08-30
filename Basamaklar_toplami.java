package patica;

import java.util.Scanner;

public class Basamaklar_toplami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("2 veya daha çok basamaklı bir sayı girin");
        int input= scan.nextInt();
        int basamakSayilariToplami=0;
        while (input>0){
            basamakSayilariToplami+=input%10;
            input/=10;
        }
        System.out.println(basamakSayilariToplami);
    }
}
