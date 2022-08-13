package patica;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r;
        Scanner input = new Scanner(System.in);

        System.out.println("Eleman sayısı kaç olsun");
        n = input.nextInt();
        System.out.println("Alt kümenin eleman sayısı kaç olsun");
        r = input.nextInt();
        //C(n,r) = n! / (r! * (n-r)!)
        int total = 1;
        for (int i = 1; i<=n; i++){
            total*=i;
        }
        int total2 = 1;
        for (int i = 1; i<=r; i++){
            total2*=i;
        }
        int total3 = 1;
        for (int i = 1; i<=(n-r); i++){
            total3*=i;
        }
        double combination = total / (total2 * total3);
        System.out.println(n +" sayısının " +r + "'elemanlı kombinasyonu: " +combination);
    }
}
