package f17nov29comp1030;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class Assign1WithArrays {
    public static void main(String[] args)    
    {
        //assignment 1 used to look like this
        int grade1, grade2, grade3, grade4, grade5;
        
        //with an array, we can create 1 variable
        int[] grades = new int[5];
        
        //get the grades
        for (int i=0; i<grades.length; i++)
        {
            System.out.printf("Please enter the grade for course %d: ", i+1);
            Scanner keyboard = new Scanner(System.in);
            grades[i]=keyboard.nextInt();
        }
        
        displayIntArray(grades);
    }
    
    /**
     * This will display the contents of the array
     */
    public static void displayIntArray(int[] array)
    {
        
    }
}
