package com.TallaVa;

public class ifstatements 
{
    public static void main(String [] args)
    {
        //Make variables

        int time1 = 10;
        int time2 = 20;
        int time3 = 15;

        //Make an if statement to tel witch is the bigest number

        if(time1 > time2 && time1 > time3)
        
            System.out.println(time1);
        
        else if(time2 > time1 && time2 > time3)
            
            System.out.println(time2);
        
        else if(time3 > time1 && time3 > time2)

            System.out.println(time3);
    }
    
}
