package org.example.ToplamaveOrtalama;

import java.util.Scanner;

public class sumandaverage {
    public static void main(String[] args) {
        int sayi1,sayi2,toplam;
        float ortalama;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi1 = scan.nextInt();

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi2 = scan.nextInt();

        toplam = sayi1 + sayi2;
        ortalama = (float) toplam/2;

        System.out.println("Girdiğiniz iki sayının toplamı: " + toplam);
        System.out.print("Girdiğiniz iki sayının ortalaması: " + ortalama);

    }
}
