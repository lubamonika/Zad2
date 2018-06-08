package com.infoshareacademy;

public class Dzialania {

    public static int dodawanie(int[] liczby) {
        int ile = liczby.length;
        int wynikDodawania = liczby[0];
        for (int i = 1; i < ile; i++) {
            wynikDodawania += liczby[i];
        }
        String jaktotambylo = "1+2+3";
        wypiszWynik("dodawanie",jaktotambylo , wynikDodawania);
        return wynikDodawania;
    }

    public static int odejmowanie(int[] liczby) {
        int ile = liczby.length;
        int wynikOdejmowania = liczby[0];
        for (int i = 1; i < ile; i++) {
            wynikOdejmowania += liczby[i];
        }
        String jaktotambylo = "1-2-3";
        wypiszWynik("odejmowanie",jaktotambylo , wynikOdejmowania);
        return wynikOdejmowania;
    }

    private static void wypiszWynik(String nazwaOperacji, String opearacjaPisemnie, int wynik) {
        StringBuilder sb= new StringBuilder();
        sb.append("Operacja:").append(nazwaOperacji);
        sb.append("Po kolei :").append(opearacjaPisemnie);
        sb.append("wYNIK :").append(wynik);

        System.out.println(sb.toString());
    }

}

