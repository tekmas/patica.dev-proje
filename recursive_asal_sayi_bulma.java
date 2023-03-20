package patica;
import java.util.ArrayList;
import java.util.Scanner;
public class recursive_asal_sayi_bulma {
    static int bolen=2;
    static ArrayList<Integer> bolenleri = new ArrayList<>();
    static ArrayList<Integer> Bolenler(int sayi){
        if (sayi%bolen==0)bolenleri.add(bolen);
        if (bolen==sayi)return (bolenleri);
        bolen+=1;
        return Bolenler(sayi);
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1den büyük bir sayı giriniz :");
        int sayi = scan.nextInt();
        if (Bolenler(sayi).size()==1){System.out.println("girilen sayı asal sayıdır.");
        }
        else {System.out.println("girilen sayı asal sayı değildir.");
        }
    }
}
