package org.example.HighestNumber;

import java.util.Scanner;

public class highestNumber {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        sayi2 = scan.nextInt();
        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        sayi3 = scan.nextInt();

        if (sayi1>sayi2 && sayi1>sayi2){
            System.out.println("En büyük sayı: " + sayi1);
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("En büyük sayı: " + sayi2);
        } else if (sayi3>sayi1 && sayi3>sayi2) {
            System.out.println("En büyük sayı: " + sayi3);
        }

        if (sayi1<sayi2 && sayi1<sayi3){
            System.out.println("En küçük sayı: " + sayi1);
        } else if (sayi2<sayi1 && sayi2<sayi3) {
            System.out.println("En küçük sayı: " + sayi2);
        } else if (sayi3<sayi1 && sayi3<sayi2) {
            System.out.println("En küçük sayı: " + sayi3);
        }

    }
}
