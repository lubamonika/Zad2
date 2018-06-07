package com.infoshareacademy;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Możliwe działania:");
        Operacja ope[] = Operacja.values();
        int size = Operacja.values().length;
        for (int i=0; i<size; i++) {
            System.out.println((i+1) + ": " + ope[i]);
        }
        System.out.println(" ");



        System.out.println("Wpisz opcję (1-4) z klawiatury:");
        Scanner scanner = new Scanner(System.in);
        int dzialanie = scanner.nextInt();
        //System.out.println(dzialanie);

        System.out.println("Podaj ilość liczb:");
        int ile = scanner.nextInt();
        //System.out.println(ile);
        int[] liczby = new int[ile];
        String[] outputArray = new String[ile];

        for (int i=0; i<ile; i++) {
        System.out.println("Podaj liczbę " + (i+1));
        liczby[i] = scanner.nextInt();
        outputArray[i] = scanner.next();
        }

        switch (dzialanie) {
            case 1:
                int wynik = 0;
                String output = "";
                for (int i=0; i<ile; i++){
                    wynik += liczby[i];
                    output += outputArray[i];
                }
                System.out.println(wynik);
                System.out.println(output);
                System.out.println("dodawanie");
                break;
            case 2:
                System.out.println("odejmowanie");
                break;
            case 3:
                System.out.println("mnozenie");
                break;
            case 4:
                System.out.println("dzielenie");
                break;
            default:
                System.out.println("Nie podałeś liczby z przedziału 1-4");

        }

        /* weryfikacja, że w tablicy są właściwe watości

        for (int i=0; i<ile; i++) {
            System.out.println(liczby[i]);
        }

        */





    }
}
