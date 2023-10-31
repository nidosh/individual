package org.example.Scanner;

import java.util.Scanner;

public class customscan {
    public static void main (String [] args){
        String isim;
        //Scanner kullanıcıdan veri girişini sağlar.
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen isminizi giriniz : ");
        //nextLine komutu girdiğin verideki boşluğu da kabul eder,
        //sadece next komutu verilseydi boşluktan sonrasını okumayacaktı.
        isim = scan.nextLine();

        System.out.println("Merhaba, " + isim);

    }
}
