/* Author : Jay Pandit
  School : Sac state */

import java.util.*;
public class InterestPandit
{
   public static void main(String[]args)
   {
      String repeat = "y";
      while(repeat.equals("y")) //loops runs until the user want to use the calculator
      {
         System.out.println(" Welcome to Payment Calculator");
         System.out.println("List of options:\nMP: To calculate the Monthly Payment for a fix rate, fix term loan");
         System.out.println("M: To calculate the number of Months to pay off a loan with a fixed monthly payment");
         System.out.println("Please enter your selection: MP/M");
      
         Scanner kb = new Scanner(System.in);
         String select = kb.nextLine();
      
         if(select.equals("M")) // first choice given to user to select
         {
            System.out.println("Enter your purchase amount");
            double price = kb.nextDouble();
            System.out.println("Enter interest rate");
            double interest = kb.nextDouble();
            System.out.println("Enter minimum monthly payment");
            double monthly = kb.nextInt();
            int month = months(price,interest,monthly); //parameter is passed and the return value is being stored
         
            System.out.println("Number of payments:"+month);
            System.out.println();
            System.out.println("Enter y to do another payment calculation or n to exit");
            repeat = kb.next();   
         }
         
         else if(select.equals("MP")) // second choice given to user
         {
            System.out.println("Enter loan amount: ");
            double loan = kb.nextDouble();
            System.out.println("Enter the number of years you want to pay off the loan: ");
            int years = kb.nextInt();
            System.out.println("Enter the annual interest rate: ");
            double interestRate = kb.nextDouble();
         
            double monthlyPayment = payment(loan,years,interestRate); // after getting input from the user, the inputs are passed into the method payment
         
         
            double totalint = Math.round(totalInterest(monthlyPayment,years,loan)*100)/100; //return from payment is passed to method totalinterest
         
            output(loan,monthlyPayment,interestRate, years,totalint); // finally of all calculation is being passed to method output          
            System.out.println("Enter y to do another payment calculation or n to exit");
            repeat = kb.next();   
         }   
      }
      if(repeat.equals("n"))
      {
         System.out.println("Have a nice day. Goodbye!"); //final quote for user to exit from the program
      }
   }
   public static double payment(double loan,int years,double interestRate)
   {
   /*
   for better understanding the formula is being broken down.
   
   alternate way is that monthly payment can be calculated in one formula
   as it also holds less memory, just for easy of reading. I have classified into
   variables.
   */
      double Im=(interestRate)/(100*12);
      double Z=years*12; // calculates the power part
      double I=1+Im;
      //double F=Math.pow(I,Z);
      double monthlypay =Math.round((loan*Im)/(1-(1/Math.pow(I,Z)))*100.00)/100.00;
      return monthlypay;
   }
   public static double totalInterest(double monthlyPayment,int years,double loan)
   {
      return monthlyPayment*12*years-loan;
   }
   public static void output(double loan, double monthlyPayment, double interestRate, int years, double totalint)
   {
      System.out.println("Summary");
      System.out.printf("loan amount: %22.2f\n",loan);
      System.out.printf("loan term: %17d\n",years);
      System.out.printf("Interest Rate: %15.2f\n",interestRate);
      System.out.printf("Monthly Payment: %16.2f\n",monthlyPayment);
      System.out.printf("Interest Paid: %20.2f\n",totalint);
   }
   public static int months(double price, double interest,double monthly)
   { 
      String s =" ";
      int month=0;
      int year=0;
      double paidinterest=0;
      double balance = price;
      
      while(balance > 0)
      {
       //calculates the interestpay
         double interestpay = Math.round((balance * (interest/100))*100.0)/100.0;
         
      
         if(balance<monthly)
         {
            monthly = Math.round((interestpay + balance)*100.00)/100.00;
         }
         
           //increment the total paid interest  
         paidinterest=paidinterest+interestpay;
        
         double principal = Math.round((monthly - interestpay)*100.0)/100.0;
         balance = Math.round((balance - principal)*100.0)/100.0; 
         
         //increments the time in months that will need to pay the loan
         if(balance >= 0)
            month++;
            
         //string will help to store the data                 
         s = s+ month +"    "+"    "+"    "+monthly+"    "+"    "+"    "+interestpay+"    "+"    "+"    "+principal+"    "+"    "+"    "+balance+"\n";
         
      }
      
      System.out.println("month      Payment         Interest      Principal        Balance");
      System.out.println(s);
      System.out.printf("Total interest paid: %.2f\n",paidinterest);
      return month;
   } 
}
/*
Objective: practice chapters 1-5 Part 1
A mortgage payment calculator: We would like to calculate the monthly payment of a fixed-term fixed-rate mortgage loan. Your program will prompt the user to enter the following information:
• The dollar amount of the loan
• The annual interest rate (assuming fixed rate)
• The number of the years over which the loan will be paid off (fixed-term)
Using these inputs, use the following equation to calculate the monthly payment for the given loan amount:
MP =L ∗ Im/1-(1/(1 + Im)Y∗M)
  Where
• MP is the monthly payment
• L is the amount of the loan
• Im is the monthly interest rate ( annual rate divided by 12)
• Y is the number of years
• M is the number of payments per year(12 months)

Part 2
A credit card payment calculator: Suppose you use your 
credit card to purchase one or more items. Your credit card 
company offers different credit plans, such as:

Plan 1: 18% interest with minimum $50 monthly payment,
Plan 2: %15 interest with minimum $60 monthly payment

You are to write a program that outputs a table organized by 
number of years and months to pay off the debt. The program 
shall also output summary information indicating the total 
interest amount and number of months paid.

Background information:
The monthly payment is used to pay the interest first and
 whatever is leftover is used to pay part of the remaining debt. 
*/