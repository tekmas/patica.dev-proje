package patica;

import java.util.Scanner;

public class Hipotenus_bulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1. dik kenarı girin");
        double kenar1= scan.nextDouble();
        System.out.println("lütfen 2. dik kenarı girin");
        double kenar2= scan.nextDouble();
        double hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("üçgenin hipotenüsü "+hipotenus+" cm'dir");
    }
}
