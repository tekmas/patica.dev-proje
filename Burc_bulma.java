package patica;

import java.util.Scanner;

public class Burc_bulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kaçıncı ayda doğdun");
        int ay = scan.nextInt();
        System.out.println("aayın kaçında doğdun");
        int gun = scan.nextInt();
        if (ay==1){
            if (gun>=1 && gun<=21){
                System.out.println("oğlak burcusun");
            }
            else {
                System.out.println("kova burcusun");
            }
        }
        else if (ay==2){
            if (gun>=1 && gun<=19){
                System.out.println("kova burcusun");
            }
            else {
                System.out.println("balık burcusun");
            }
        }
        else if (ay==3){
            if (gun>=1 && gun<=20){
                System.out.println("balık burcusun");
            }
            else {
                System.out.println("koç burcusun");
            }
        }
        else if (ay==4){
            if (gun>=1 && gun<=20){
                System.out.println("koç burcusun");
            }
            else {
                System.out.println("boğa burcusun");
            }
        }
        else if (ay==5){
            if (gun>=1 && gun<=21){
                System.out.println("boğa burcusun");
            }
            else {
                System.out.println("ikizler burcusun");
            }
        }
        else if (ay==6){
            if (gun>=1 && gun<=22){
                System.out.println("ikizler burcusun");
            }
            else {
                System.out.println("yengeç burcusun");
            }
        }
        else if (ay==7){
            if (gun>=1 && gun<=22){
                System.out.println("yengeç burcusun");
            }
            else {
                System.out.println("aslan burcusun");
            }
        }
        else if (ay==8){
            if (gun>=1 && gun<=22){
                System.out.println("aslan burcusun");
            }
            else {
                System.out.println("başak burcusun");
            }
        }
        else if (ay==9){
            if (gun>=1 && gun<=22){
                System.out.println("başak burcusun");
            }
            else {
                System.out.println("terazi burcusun");
            }
        }
        else if (ay==10){
            if (gun>=1 && gun<=22){
                System.out.println("terazi burcusun");
            }
            else {
                System.out.println("akrep burcusun");
            }
        }
        else if (ay==11){
            if (gun>=1 && gun<=21){
                System.out.println("akrep burcusun");
            }
            else {
                System.out.println("yay burcusun");
            }
        }
        else if (ay==12){
            if (gun>=1 && gun<=21){
                System.out.println("yay burcusun");
            }
            else {
                System.out.println("oğlak burcusun");
            }
        }
    }
}
