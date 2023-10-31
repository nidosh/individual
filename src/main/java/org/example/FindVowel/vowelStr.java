package org.example.FindVowel;

import java.awt.*;

public class vowelStr {
    public static void main(String[] args) {
        String metin ="mükemmel";
        String sesli = "a,e,i,ı,o,ö,ü,u";
        String sessiz = "q,w,r,t,y,p,ğ,s,d,f,g,h,j,k,l,ş,z,x,c,v,b,n,m,ç";

        System.out.print("Mükemmel kelimesinin içindeki sesli harfler: ");

        for (int i = 0; i < metin.length(); i++) {
            char harf = metin.charAt(i);
            //contains metodu, bir dizenin belirtilen bir alt dizeyi içerip içermediğini kontrol etmek için kullanılır.
            //genelde dizeler üstünde çalışır.
            //.valueOf() komutu veri türünü dizeye çevirmeye yarar.
            if(sesli.contains(String.valueOf(harf))){
                System.out.print(harf + " ");
            }
        }
        System.out.println("  ");
        System.out.print("Mükemmel kelimesinin içindeki sessiz harfler: ");

        for (int i = 0; i < metin.length(); i++) {
            char harf2 = metin.charAt(i);
            if (sessiz.contains(String.valueOf(harf2))){
                System.out.print(harf2 + " ");
            }
        }
    }
}
