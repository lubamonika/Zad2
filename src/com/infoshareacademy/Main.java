package com.infoshareacademy;

import java.util.Scanner;

import static com.infoshareacademy.Operacja.dodawanie;

public class Main {


    public static void main(String[] args) {
        System.out.println("Możliwe działania:");
        Operacja ope[] = Operacja.values();
        int size = Operacja.values().length;
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ": " + ope[i]);
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
        //String[] outputArray = new String[ile];

        for (int i = 0; i < ile; i++) {
            System.out.println("Podaj liczbę " + (i + 1));
            liczby[i] = scanner.nextInt();
        }

        //for (int i=0; i<ile; i++) {
        //    outputArray[i] = String.valueOf(liczby[i]);
        //}

        String output = "Operacja : " + liczby[0];
        int wynik = liczby[0];

        switch (dzialanie) {
            case 1:
                Dzialania.dodawanie(liczby);

                break;
            case 2:
                for (int i = 1; i < ile; i++) {
                    wynik -= liczby[i];
                    output = output + " - " + liczby[i];
                }
                System.out.println(output);
                System.out.println("Wynik :" + wynik);
                break;
            case 3:
                for (int i = 1; i < ile; i++) {
                    wynik *= liczby[i];
                    output = output + " * " + liczby[i];
                }
                System.out.println(output);
                System.out.println("Wynik :" + wynik);
                break;
            case 4:
                for (int i = 1; i < ile; i++) {
                    wynik /= liczby[i];
                    output = output + " / " + liczby[i];
                }
                System.out.println(output);
                System.out.println("Wynik :" + wynik);
                break;
            default:
                System.out.println("Nie podałeś w pierwszym polu liczby z przedziału 1-4");

        }
//
//        switch (dzialanie) {
//            case 1:
//                //Dzialania.dodawanie(liczby);
//                for (int i = 1; i < ile; i++) {
//                    wynik += liczby[i];
//                    output = output + " + " + liczby[i];
//                }
//                System.out.println(output);
//                System.out.println("Wynik: " + wynik);
//                break;
//            case 2:
//                for (int i = 1; i < ile; i++) {
//                    wynik -= liczby[i];
//                    output = output + " - " + liczby[i];
//                }
//                System.out.println(output);
//                System.out.println("Wynik :" + wynik);
//                break;
//            case 3:
//                for (int i = 1; i < ile; i++) {
//                    wynik *= liczby[i];
//                    output = output + " * " + liczby[i];
//                }
//                System.out.println(output);
//                System.out.println("Wynik :" + wynik);
//                break;
//            case 4:
//                for (int i = 1; i < ile; i++) {
//                    wynik /= liczby[i];
//                    output = output + " / " + liczby[i];
//                }
//                System.out.println(output);
//                System.out.println("Wynik :" + wynik);
//                break;
//            default:
//                System.out.println("Nie podałeś w pierwszym polu liczby z przedziału 1-4");
//
//        }

        /* weryfikacja, że w tablicy są właściwe watości

        for (int i=0; i<ile; i++) {
            System.out.println(liczby[i]);
        }

        */


    }
}
