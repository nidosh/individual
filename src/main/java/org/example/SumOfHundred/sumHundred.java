package org.example.SumOfHundred;
//(n * (n+1)) / 2

import java.util.Scanner;

public class sumHundred {
    public static void main(String[] args) {
        //1'den itibaren toplama
        //int sayi;
        //Scanner scan = new Scanner(System.in);
        //System.out.print("Lütfen 1'den kaça kadar toplamak istediğinizi giriniz: ");
        //sayi = scan.nextInt();

        //int sum = (sayi * (sayi + 1)) / 2;
        //System.out.println("1'den " + sayi + "'a kadar olan sayıların toplamı: " + sum);
        
        //Ya da:
        //int toplam = 0;

        //for (int i = 1; i < 100 ; i++) {
        //    toplam += i;
        //}
        //System.out.println("ilk 100 sayının toplamı: " + toplam);

        //Tek sayıların toplamı:


        System.out.print("Bir sayı giriniz: ");
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        int toplam2=0;

        for (int i = 1; i < n ; i= i+2) {
            toplam2+= i;
        }
        System.out.println("1'den " + n + "'e kadar tek sayıların toplamı: " + toplam2);

        //çift sayıların toplamı:

        System.out.print("Lütfen bir sayı daha giriniz: ");
        Scanner scan1 = new Scanner(System.in);
        int x = scan1.nextInt();
        int toplam3 = 0;

        for (int i = 1; i < x; i++) {
            if (i%2==0){
                toplam3 += i;
            }
        }
        System.out.println("1'den " + x + "'e kadar olan çift sayıların toplamı: " + toplam3);

        //7ye tam bölünebilme:
        int y;
        System.out.print("Lütfen bir sayı giriniz: ");
        Scanner scan2 = new Scanner(System.in);
        y = scan2.nextInt();
        int bolum = y%7;


        if (y%7==0){
            System.out.println("Bu sayı 7'ye tam bölünebilir.");
        }else {
            System.out.println("Bu sayı 7'ye tam bölünemez ve bölümünden kalan şudur: " + bolum);
        }
    }

}
