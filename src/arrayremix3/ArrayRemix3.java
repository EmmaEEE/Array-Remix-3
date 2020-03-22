/*
 * Emma Elliott
March 22,2020
Array Remix 3
 */
package arrayremix3;

import java.util.Scanner;
/**
 *
 * @author gregelliott
 */
public class ArrayRemix3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput= new Scanner (System.in);
        
        //Add new marks to list
        double[]marks={34.7,54.1,34.8,99.6,43.6,43.2,65.8,44.8,88.6};
        double total=0;
        double average;
        
        //Output all marks
        System.out.println("These are the marks:");
        for (int i=0;i<=8;i=i+1)
        {
            System.out.println(marks[i]);
        }
        //Total of all marks
        for (int i=0;i<=8;i=i+1)
        {
            total=total+marks[i];
        }
        //Find the average of the marks
        average=total/9;
        
        average=average*10;
        average=Math.round(average);
        average=average/10;
        
        System.out.println("The average mark is:");
        System.out.println(average);
        
        // TODO code application logic here
    }
    
}
