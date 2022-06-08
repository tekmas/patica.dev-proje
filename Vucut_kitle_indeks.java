package patica;

import java.util.Scanner;

public class Vucut_kitle_indeks {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("lütfen boyunuzu girin");
        double boy= scan.nextDouble();
        System.out.println("lütfen kilonuzu girin");
        double kilo= scan.nextDouble();
        System.out.println("vücut kitle indeksiniz : "+(kilo/(boy*boy)));
}
}