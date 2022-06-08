package patica;

import java.util.Scanner;

public class Alan_bulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üçgenin 1. kenarını girin");
        double kenar1= scan.nextDouble();
        System.out.println("lütfen üçgenin 2. kenarını girin");
        double kenar2= scan.nextDouble();
        System.out.println("lütfen üçgenin 3. kenarını girin");
        double kenar3= scan.nextDouble();
        double u=(kenar1+kenar2+kenar3)/2;
        double alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("üçgenin alanı "+alan+" cm karedir");
    }
}
