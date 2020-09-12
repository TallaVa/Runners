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


        //Test
        //koll om vilken tid som var snabbast
        int forst, sist, minne;

        if (tid1>tid2) {
            minne = tid1; forst = tid2;                   //tid1 mäts mot tid2
        }

        else {
                minne = tid2; forst = tid1;               //Den tiden som är minst sätts i minne
            }

        if (minne>tid3){
            sist = minne;
            if (forst > tid3) {
                minne = forst;
                forst = tid3;
            }
            else {
                minne = tid3;
            }
        }
        else sist = tid3;

        //Sortering av namn efter snabbast tid
        int minne2;
        if (sist == tid1 && minne == tid2 && forst == tid3) {
            System.out.println("Först: " + name3 + " Andra: " + name2 + " Sist: " + name1);
        }
        else if (sist == tid1 && minne == tid3 && forst ==tid2)
        {
            System.out.println("Först: " + name2 + " Andra: " + name3 + " Sist: " + name1);
        }
        else if (sist == tid3 && minne == tid1 && forst ==tid2)
        {
            System.out.println("Först: " + name2 + " Andra: " + name1 + " Sist: " + name3);
        }
        else if (sist == tid2 && minne == tid1 && forst ==tid3)
        {
            System.out.println("Först: " + name2 + " Andra: " + name1 + " Sist: " + name3);
        }



        System.out.println("minst: "+ forst + " mellan: "+ minne + " och snabbast: "+  sist );





    System.exit(0);

    }
}
