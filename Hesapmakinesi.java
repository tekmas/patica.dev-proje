package patica;

import java.util.Scanner;

public class Hesapmakinesi {
    public static void main(String[] args) {
        int num1,num2;
        String islem;
        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayıyı girin");
        num1= scan.nextInt();
        System.out.println("ikinci sayıyı girin");
        num2= scan.nextInt();
        System.out.println("yapmak istediiniz işlemi girin");
        islem= scan.next();
        switch (islem){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                if (num1==0 && num2==0) {
                    System.out.println(num1+" ile "+ num2 + " çarpımı tanımsızdır");
                }
                else {
                    System.out.println(num1 * num2);
                }
                break;
            case "/":
                if (num1==0 && num2==0) {
                    System.out.println(num1+ " bölü "+ num2 + " tanımsızdır");
                }
                else {
                    System.out.println(num1 / num2);
                }
                break;
            default:
                System.out.println("yanlış giriş yaptınız");
        }
    }
}
