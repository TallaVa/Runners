package com.TallaVa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Variablerna

        String name1;   //Första löparens namn.
        String name2;   //Andra löparens namn.
        String name3;   //Tredje löparens namn.

        //Skapar en Scanner för inmatning.
        Scanner keyboard = new Scanner(System.in);

        //Inläsning av första löparens namn.
        System.out.println("Skriv in första löparens namn och Tid: ");
        name1 = keyboard.nextLine();


            //Inläsning av andra löparens namn.
            System.out.println("Skriv in den andre löparens namn: ");
            name2 = keyboard.nextLine();

                //Inläsning av tredje löparens namn.
                System.out.println("Skriv in den tredje löparens namn: ");
                name3 = keyboard.nextLine();

        //Test


        if (name1 < name2)
            System.out.println(name1);

        System.exit(0);
    }
}
