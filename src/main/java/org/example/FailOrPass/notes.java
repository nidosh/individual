package org.example.FailOrPass;
// vize notunun %40ını final notunun %60ını alarak ortalama hesaplayan,
// ortalaması %50nin üstündeyse "Geçti",altındaysa "Kaldı" yazan uygulama.

import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        int vize;
        int fınal;
        Scanner scan = new Scanner(System.in);

        System.out.print("Vize notu: ");
        vize = scan.nextInt();

        System.out.print("Final notu: ");
        fınal = scan.nextInt();

        float ort = ((float) (vize * 40) / 100) + ((float) (fınal * 60) / 100);

        System.out.println("Ortalamanız: " + ort);

        if (ort > 50){
            System.out.println("Tebrikler dersten geçtiniz!");
        }else {
            System.out.println("Maalesef dersten kaldınız! ");
        }

    }
}
