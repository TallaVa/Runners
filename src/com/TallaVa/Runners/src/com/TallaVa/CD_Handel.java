package com.TallaVa.Runners.src.com.TallaVa;

import javax.swing.*;

public class CD_Handel {

    public static void main(String [] args)
    {
        //Variabler
        int score;                                                                              //Variable för antal poäng kunden har samlat
        String input;                                                                           //variabel för antal skivor kunden köpt

        //Läsa in antalet skivor
        input = JOptionPane.showInputDialog("Hur många CD's har du köpt den här månaden ?");    //ställer frågan
        score = Integer.parseInt(input);                                                        //sparar datan i score

        //Beräkna och presentera resultatet
        if (score == 0)                                                                         //Om kunden köpt 0 cd's
            JOptionPane.showMessageDialog(null, "Du har tjänat ihop:"
                                            + " 0 poäng den här månaden.");
            else
                if  (score == 1)                                                                 //Om kunden köpt 1 cd's
                    JOptionPane.showMessageDialog(null, "Du har tjänat ihop:"
                                                    + " 5 poäng den här månaden.");
                else
                    if (score == 2)                                                             //om kunden köpt 2 cd's
                        JOptionPane.showMessageDialog(null, "Du har tjänat ihop:"
                                                        + " 15 poäng den här månaden.");
                    else
                        if (score == 3)                                                             //om kunden köpt 3 cd's
                            JOptionPane.showMessageDialog(null, "Du har tjänat ihop:"
                                                            + " 30 poäng den här månaden.");
                        else
                            if (score >= 4)                                                             //om kunden köpt 4 eller fler cd's
                                JOptionPane.showMessageDialog(null, "Du har tjänat ihop:"
                                                                + " 60 poäng den här månaden.");


        System.exit(0);
    }
}
