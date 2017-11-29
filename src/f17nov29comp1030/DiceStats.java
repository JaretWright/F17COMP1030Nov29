package f17nov29comp1030;

import java.security.SecureRandom;

/**
 *
 * @author jwright
 */
public class DiceStats {
    public static void main(String[] args)
    {
        int[] sumOfDice = new int[13];
        
        //create a random number generator (rng)
        SecureRandom rng = new SecureRandom();
        
        int jw = 0;
        
        for (int i=1; i<= 1000000000; i++)
        {
            int die1 = rng.nextInt(6)+1;  //creates a random number bteween 1-6
            int die2 = rng.nextInt(6)+1; //creates a random number bteween 1-6
            
            int index = die1+die2;
            
            sumOfDice[index] = sumOfDice[index] + 1;
        }
        
        //display the results
        System.out.printf("%6d %6d %6d %6d %6d %6d %6d %6d %6d %6d %6d%n",2,3,4,5,6,7,8,9,10,11,12);
        
        //loop over the array and display the results
        for (int i=2; i<sumOfDice.length; i++)
        {
            System.out.printf("%6d ", sumOfDice[i]);
        }
        System.out.println();
        //ha
        
        //display the % of each number
        for (int i=2; i<sumOfDice.length; i++)
        {
            System.out.printf("%5d%% ", sumOfDice[i]/10000000);
        }
    }
}
