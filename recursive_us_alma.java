package patica;

import java.util.Scanner;

public class recursive_us_alma {
    static void power(int base,int exponent) {

        int result= (int) Math.pow(base,exponent);

        System.out.println("Sonuç : " + result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        power(base, exponent);
    }
}
