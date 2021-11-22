/* Author : Jay Pandit
  School : Sac state */

import java.util.Scanner;
public class METPandit
{
   // declare constants
   public static final int BASKETBALL_MET=10; //name all capitalized and words separated by underscope
   public static final int RUN_MET=6;
   public static final int SLEEP_MET=1;
   public static final double POUND_TO_KILO=2.2;
   
   public static void main(String[]args)
   {
      for(int i=1;i<=10;i++)
      {
        run();
      }
   }
   public static void run()
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("please enter your weight in pounds");
      double pounds = kb.nextDouble();      //a)user wieght in pounds.
      double kilo = poundtokilo(pounds);    //b) converts pound into kilo.
            
      System.out.println("please enter the minutes you ran ");
      double min = kb.nextDouble();        // c) amount of time running in minutes.
      double runCalories = runMet(kilo,min);//d) calories burnt running.
      
      System.out.println("Please enter the amount of time you sleep in hours"); 
      int hours = kb.nextInt();             //e) sleeping hours.
      int minutes = hourtomin(hours);       //f) conversion of hours into minutes.
      double sleepCalories = sleepMet(kilo,minutes); // calories burnt sleeping
            
      System.out.println("Please enter the minutes you played basketball");
      double bbmin = kb.nextInt();         //g)time spent by users to play basketball.
      double bballcalories = bbMet(kilo,bbmin); //h)calculates the calories burnt by playing basketball.
           
      double totalCalories = runCalories + sleepCalories + bballcalories; //i)adding all the calories burnt during the exercise using metabolic equivalents.
      
      System.out.print("The amount of calories you burnt during running are: ");
      System.out.printf("%.2f\n",runCalories);
      System.out.print("The amount of calories you burnt during sleeping are: ");
      System.out.printf("%.2f\n",sleepCalories);
      System.out.print("The amount of calories you burnt during playing basketball are: ");
      System.out.printf("%.2f\n",bballcalories);
   
   
      System.out.print("The Total calories you burnt per minute are: ");
      System.out.printf("%.2f\n\n",totalCalories); 
   }
   public static double poundtokilo(double pound) //1kilo=2.2pound
   {
      double kilo = pound/POUND_TO_KILO;
      return kilo;
   }
   
   // this method gets the weight and running time and returns the 
   // caloires burnt calories/min = 0.0175*MET*wieght in kg.
   public static double runMet(double weight,double min)
   {
      return 0.0175 * weight * min *RUN_MET;
   }
   
   //this method converts hours into minutes and returns the value back.
   public static int hourtomin(int hours)
   {
      int minutes = 60 * hours;
      return minutes;
   }
   
   // method calculates the calories burnt during sleeping.
   public static double sleepMet(double weight,double minutes)
   {
      return 0.0175 * weight * minutes *SLEEP_MET;
   }
   
   // method calculates the calories burnt during playing BasketBall.
   public static double bbMet(double weight,double bbmin)
   {
      return 0.0175 * weight * bbmin *BASKETBALL_MET;
   } 
}

/* the above program follows the requirement mentioned below :
1. main method:
a. Calls the method at step 2.
b. Must have a for loop in the main method so that we can use the program for
different people. Meaning that the method in step 2 must be called in a for loop
that repeats 10 times
2. A method that does the following: calculates and outputs the total number of calories
burned for a person based on the weight and amount of the time that the person did the exercises. This method must do the following in the given order
a. Get the user’s weight in pounds
b. Call the method in step 3 to convert the pounds to kilograms. Store the result in a
variable
c. Get the amount of time running in minutes
d. Call the method at step 4 to get the calories burnt running. Make sure to pass
parameters to this method. And store the result in a variable e. Get the amount of time sleeping in hours
f. Call the method at the step 7 to convert hours to minutes. Store the result in a variable g. Get the amount of time playing basketball in minutes
h. call the method at step 6 to get the calories burnt playing basketball
i. add all the calories from different activities and display the result in 2 decimal points
using printf
3. A method that converts pounds to kilo. This method accepts the pound as its parameter
and returns the kilograms. One kilogram is equal to 2.2 pounds.
4. This method accepts the weight of the person and the amount of time running in minutes
and returns calories burnt running. Use the formula Calories/Minute = 0.0175 x MET x
Weight in Kilograms. MET for running 6MPH is 10.
5. A method that calculates the calorie burnt playing basketball. This methods accepts the amount of time playing basketball and the weight of the person in kilograms as its parameter and returns the calories burnt using the formula Calories/Minute = 0.0175 x MET x Weight in Kilograms . MET for I minute basketball is 8
6. This method gets minutes slept and the weight in Kilo and returns calories burnt while sleeping. Use the formula Calories/Minute = */