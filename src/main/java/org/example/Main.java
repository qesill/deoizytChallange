package org.example;

public class Main {
    public static void main(String[] args) {
        float deposit = 1000.00f;
        float numDays = 180f;
        float interestsRate = 0.06f;
        final float daysInYear = 365f;
        float tax = 0.19f;

        float intrest = (deposit * numDays * interestsRate / daysInYear);
        float taxValue = intrest * tax;
        float incomeAfterTax = intrest - taxValue;
        System.out.println("Przychód z lokaty: " + intrest + " Podatek: " + taxValue + " Zysk: " + incomeAfterTax );


        /*
        6000 (wpłacona kwota) * 180 (półroczny okres lokaty)
        x 0,03 (oprocentowanie lokaty) / 365 (liczba dni w roku) = 88,77 zł

            wzór na obliczanie zysku z lokaty
            odsetki = depozyt x ilośćDni * oprocentowanie / iloscDniWRoku

            podatek = odsetki * podatek;

            zysk = odsetki - podatek;
         */
    }
}