package com.TallaVa.Runners.src.com.TallaVa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Variablerna

        int tid1;
        int tid2;
        int tid3;

        String name1;   //Första löparens namn.
        String name2;   //Andra löparens namn.
        String name3;   //Tredje löparens namn.

        //Skapar en Scanner för inmatning.
        Scanner keyboard = new Scanner(System.in);

        //Inläsning av första löparens namn.
        System.out.println("Skriv in första löparens namn: ");
        name1 = keyboard.nextLine();
        System.out.println("Vad hade han för tid ? ");
        tid1 = keyboard.nextInt();

        //Rensa nexLine
        keyboard.nextLine();


            //Inläsning av andra löparens namn.
            System.out.println("Skriv in den andre löparens namn: ");
            name2 = keyboard.nextLine();
            System.out.println("Vad hade han för tid ? ");
            tid2 = keyboard.nextInt();

            //Rensa nexLine
            keyboard.nextLine();

                //Inläsning av tredje löparens namn.
                System.out.println("Skriv in den tredje löparens namn: ");
                name3 = keyboard.nextLine();
                System.out.println("Vad hade han för tid ? ");
                tid3 = keyboard.nextInt();

                //Rensa nextLine
                keyboard.nextLine();

        //Test
    //koll om vilken tid som var snabbast
    if(tid1 > tid2 && tid1 > tid3){
        System.out.println(name1 + " " + tid1);
    }

    if (tid2 > tid1 && tid2 > tid3){
        System.out.println(name2 + " " + tid2);
    }

    if (tid3 > tid1 && tid3 > tid2){
        System.out.println(name3 + " " + tid3);
    }

   else
        System.out.println("fel värde . kör om programmet.");


        System.exit(0);

        /* Testa det här om du hinner
        if (a >= b)
            if (a >= c) { max= a; if (b >= c) min= c; else min= b; }
            else { max= c; min= b; }
        else if (b >= c)
        { max= b; if (a >= c) min= c; else min= a; }
        else { max= c; if (a >= b) min= b; else min= a; }

         */
    }
}
