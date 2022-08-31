package patica;

import java.util.Scanner;

public class Ebob_ekok_bulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayıyı yazın");
        int num1= input.nextInt();
        System.out.println("ikinci sayıyı yazın");
        int num2= input.nextInt();
        int ebob=0;
        if (num1>num2){
            for (int i = 1; i <num2 ; i++) {
                if (num1%i==0 && num2%i==0){
                    ebob=i;
                }
            }

            System.out.println("bu sayıların ebob değeri : "+ebob);
        }
        if (num1<num2){
            for (int i = 1; i <num1 ; i++) {
                if (num1%i==0 && num2%i==0){
                    ebob=i;
                }
            }
            System.out.println("bu sayıların ebob değeri : "+ebob);
        }
            for (int i = 1; i <=(num1*num2) ; i++) {
                if (i%num1==0 && i%num2==0)
                { System.out.println("bu sayıların ekok değeri : "+i);
                break;}
            }
        }
    }

