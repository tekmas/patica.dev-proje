package patica;

import java.util.Scanner;

public class Etkinlik_onerme {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("hava sıcaklığını girin");
            double sicaklik= scan.nextDouble();
            if (sicaklik<5){
                System.out.println("kayak yapabilirsin");
            }else if (sicaklik>=5 && sicaklik<=15){
                System.out.println("sinemaya gidebilirsin");
            }else if (sicaklik>15 && sicaklik<=25){
                System.out.println("pikniğe gidebilirsin");
            }else {
                System.out.println("yüzmeye gidebilirsin");
            }
        }
    }
