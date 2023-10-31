package org.example.BackwardsString;

public class bckwrdstr {
    public static void main(String[] args) {
        String str = "hakan";
        int i;

        System.out.println(str);
        //diziler 0'ıncı indexten başladığı için -1 koyduk ve tersine döngü yazdık.
        for (i=str.length()-1; i>=0 ; i--) {
            //.charAt() komutu harfleri tek tek almamızı sağlar.
            System.out.print(str.charAt(i));
        }
    }
}
