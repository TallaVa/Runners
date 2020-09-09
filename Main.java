package com.TallaVa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        int tid1;       //Första löparens tid.
        int tid2;       //Andra löparens tid.
        int tid3;       //Tredje löparens tid.

        String name1;   //Första löparens namn.
        String name2;   //Andra löparens namn.
        String name3;   //Tredje löparens namn.

        //Skapar en Scanner för inmatning.
        Scanner keyboard = new Scanner(System.in);

        //Inläsning av första löparens namn.
        System.out.println("Skriv in första löparens namn: ");
        name1 = keyboard.nextLine();

        //Inläsning av andra löparens namn.
        System.out.println("Skriv in den andre löparens namn: ");
        name2 = keyboard.nextLine();

        //Inläsning av tredje löparens namn.
        System.out.println("Skriv in den tredje löparens namn: ");
        name3 = keyboard.nextLine();

        //Test
        System.out.println(name1 + " " + name2 + " " + name3);

    }
}
