package com.TallaVa.Runners.src.com.TallaVa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Variablerna

        int tid1;
        int tid2;
        int tid3;
        int min;
        int mid;
        int max = 0;

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
    if(tid1 > tid2 )
        if (tid1 > tid3) {
            max = tid1;
            if (tid2 > tid3)
                min = tid3;
            mid = tid2;
        }
        else
        {
            min = tid2;
            mid = tid3;
        }
    else
        {
            max = tid3;
            mid = tid1;
            min = tid2;
        }


    else if (tid2 > tid3)
    {
        max = tid2;
        if (tid1 > tid3)
            min = tid3;
            mid = tid1;
    }
        else
        {
            min = tid1;
            mid = tid3;
        }
    if (tid1 > tid2)
    {
            min = tid2;
            mid = tid1;
        System.out.println(min + mid + max);
    }
        else
        {
            min = tid1;
            mid = tid2;
            System.out.println(min + mid + max);
        }


        System.exit(0);

    }
}
