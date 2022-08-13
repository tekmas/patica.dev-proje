package patica;

import java.util.Scanner;

public class Us_alma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int num = scan.nextInt();
        for (int i = 1; i <num ; i++) {
            if (Math.pow(4,i)<=num){
                System.out.println("girilen sayıya kadar olan 4'ün kuvvetleri : "+Math.pow(4,i));
            }
        }
        int i=1;
        while (Math.pow(5,i)<=num){
            System.out.println("girilen sayıya kadar olan 5'in kuvvetleri : "+Math.pow(5,i));
            i++;
        }
    }
}
