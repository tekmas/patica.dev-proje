package patica;

import java.util.Scanner;

public class User_entry {
    public static void main(String[] args) {
        String kullanici="tekmas";
        String sifre="12345";
        String uesrname,pasword,new_pasword;
        Scanner scan=new Scanner(System.in);
        System.out.println("kullanıcı adını girin");
        uesrname= scan.next();
        System.out.println("şifrenizi girin");
        pasword= scan.next();
        if ((uesrname.equals(kullanici)) && (pasword.equals(sifre))){
            System.out.println("girdin");
        }
        do {
            if (!pasword.equals(sifre)) System.out.println("yanlış şifre girdiniz. Lütfen yeni bir şifre oluşturunuz");

            new_pasword = scan.next();
            if (new_pasword.equals(pasword)) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            } else {
                System.out.println("şifreniz başarıyla oluşturuldu");
            }
        }
            while (new_pasword.equals(pasword));
        }
        }
