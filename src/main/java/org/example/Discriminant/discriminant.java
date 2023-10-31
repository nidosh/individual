package org.example.Discriminant;
//ax^2+bx+c=0
//discriminant formule : b^2-4ac

import java.util.Scanner;
public class discriminant {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        a = scan.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        b = scan.nextInt();

        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        c = scan.nextInt();

        int delta;
        delta = b*b - (4*a*c);
        float kök1,kök2;

        if(delta>0){
            System.out.println("Denklemin iki kökü vardır.");
            kök1 = ((float) (-b - Math.sqrt(delta))) / 2 * a;
            kök2 =  ((float) (-b + Math.sqrt(delta))) / 2 * a;

            System.out.println("Kök1 = " + kök1);
            System.out.println("Kök2: " + kök2);
        } else if (delta == 0){
            System.out.println("Denklemin çakışık kökü vardır.");
            kök1 = ((float) (-b) / (2 * a));
            System.out.println("Kökler: " + kök1);
        } else {
            System.out.println("Denklemin kökü yoktur.");
        }
    }
}
