/*
Jay Pandit
09/02/2020(mm/dd/yyyy)
student ID: 301691780

*/

/* Problem:
You are to write a program that calculates the standard deviation of a list of numbers. 
Standard deviation
The standard deviation of a list of numbers is a measure of how much the numbers deviate from the average. If the standard deviation is small, the numbers are close to the average. If the standard deviation is large, the numbers are scattered far from the average.
The standard deviation is the square root of the variance of the list of numbers.
So, to find the standard deviation of a list of numbers, you need to first calculate the variance of the numbers.
The variance of a list of numbers is the average of the squared deviation of each number from the mean of  the numbers.
*/

import java.util.*;
class StandarddeviationPandit
{
  //declaring constant
  
   public  static final int MAXIMUM_NUMBER = 5;
   
   public static void main(String[]args)
   {
      double s[] = new double[MAXIMUM_NUMBER]; // variable s is used as array name. 
    // it used to pass in method by reference.
     
      fillArray(s); // method will fill array and also check the input is valid or not.
     
      double avg = getAverage(s); // it just calculates average.
    
      double var = getVariance(s);// method calculates the variance.
     // variable var signifies variance.
      double deviation = getStandardDeviation(s);
     
    
    
      System.out.println("Average = "+avg);
      System.out.println("Variation = "+var);
      System.out.println("Standard Deviation = "+deviation);
   
   
   }
 
   public static int fillArray(double[] s)
   {
   //Arguments: Array of double  
   //Prompts the user to enter numbers greater than zero and stores them in the array.
   
      Scanner kb = new Scanner(System.in);
      System.out.println("Please enter a number greater than zero");
      for(int i=0;i<s.length;i++)
      {
         
         System.out.print("Enter a number: ");
         s[i] = kb.nextDouble();
         //input 
         if(s[i]<=0)
         {
            System.out.println("Wrong Entry,enter a number greater than zero");
            System.out.print("Enter a number ");
            s[i] = kb.nextDouble();
         }
      
      
      }
    /*
    Return is not required, as method can have array as return type
    so i am not changing method signature and following the layout.
    */
      return 1;
   }
   public static double getAverage(double[] nums)
   {
   //Arguments:   Array of numbers
   //Returns the average of the numbers stored in the array
      double sum=0,avg=0;
      int total=nums.length;
      for(int i=0;i<nums.length;i++)
      {
         sum = sum + nums[i];
      }
      avg = (sum / total);
    
      return avg;
   
   }
   
   public static double getVariance(double[] nums) 
   {
   //Arguments:  Array of numbers
   //Returns the variance of the numbers stored in the array.
   //Note: this method will call the getAverage method.
      double avg = getAverage(nums);
      double variance=0;
      for(int i=0;i<nums.length;i++)
      {
         variance = variance + Math.pow(nums[i]-avg,2);
      }
   
      variance = (variance / nums.length);
      return variance;
   }
   public static double getStandardDeviation(double[] nums)
   {
   //Arguments:   Array of numbers
   //Returns the standard deviation of the numbers.
   //Note: this method will call the getVariance method.
      double var = getVariance(nums);
      // var variable signifies storage of variance
      double deviation= Math.sqrt(var);
     
      return deviation;
   }
}
/*
Requirements
•You must use methods for this assignment. 
•You must use an array to store the data.
•You must use a constant for the Maximum_Number of values that can be stored in the array (5). 
•Values for the average, variance, and standard deviation must be printed out in the main method.
•Use methods from Java Math class
•To calculate ab  use the pow method in the Math class. This method returns the value of the first argument raised to the power of the second argument. The API for this method is: 
static double pow(double a, double b)
•To find the square root of a number use the sqrt method in the Math class. This method returns the correctly rounded positive square root of a double value. The API for the sqrt method is:
static double sqrt (double a)
•The following information must be included both in the documentation at the beginning of your program and at the top of the output produced by your program:
oYour name
oProgram description
oDate 

•You must use good style:
omeaningful variable names and 
ogood, consistent indentation

*/