package patica;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Fibonacci serisinin eleman sayısını giriniz");
        int basamak_sayisi= scan.nextInt();
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int index=1;
        while (fibonacci.size()<=basamak_sayisi-1){
            int k=fibonacci.get(index-1)+fibonacci.get(index);
            fibonacci.add(k);
            index++;
        }
        System.out.println(fibonacci);
    }
}
