package com.infoshareacademy;

public class Dzialania {

    public static int dodawanie(int[] liczby) {
        int ile = liczby.length;
        int wynikDodawania = liczby[0];
        for (int i=1; i<ile; i++){
            wynikDodawania += liczby[i];
        }
        System.out.println(wynikDodawania);
        System.out.println("dodawanie");
        return wynikDodawania;

    }
}
