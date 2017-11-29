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
        double[] grades = new double[5];
        
        //get the grades
        for (int i=0; i<grades.length; i++)
        {
            System.out.printf("Please enter the grade for course %d: ", i+1);
            Scanner keyboard = new Scanner(System.in);
            grades[i]=keyboard.nextInt();
        }
        
        displayIntArray(grades);
        System.out.printf("The average of the grades is: %.1f%%", getAverage(grades));
    }
    
    /**
     * This will display the contents of the array
     */
    public static void displayIntArray(double[] array)
    {
        //the long way
       /* System.out.printf("Position 0: %d%n", array[0]);
        System.out.printf("Position 1: %d%n", array[1]);
        System.out.printf("Position 2: %d%n", array[2]);
        System.out.printf("Position 3: %d%n", array[3]);
        System.out.printf("Position 4: %d%n", array[4]);*/
        
        //the better way with a loop
        for (int i=0; i<array.length; i++)
        {
            System.out.printf("In course %d, you earned a mark of %.0f"
                    + ", which is a letter grade of %s%n",i+1, array[i], getLetterGrade(array[i]));
        }
    }
    
    /**
     * This method will accept an array of integers and
     * return the average as a double
     */
    public static double getAverage(double[] array)
    {
        double total=0;
        for (int i=0; i<array.length; i++)
        {
            total = total + array[i];
        }
        return total/array.length;
    }
    
    /**
     * This receives a double that represents the grade
     * and returns the letter grade as a String
     */
    public static String getLetterGrade(double grade)
    {
        if (grade >=80 && grade <=100)
            return "A";
        else if (grade >=70)
            return "B";
        else if (grade >=60)
            return "C";
        else if (grade >=50)
            return "D";
        else
            return "F";
    }
}
