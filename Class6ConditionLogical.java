import java.util.Scanner;
public class Class6ConditionLogical
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
     //ask user to enter an integer. IF number is between 1-100 display within range
     // demorgan !(a && b) = !a || !b, !(a||b)=!a && !b
      System.out.print("enter an integer");
      int num = kb.nextInt();
      if(num>=1&&num<=100)
      {
         System.out.println("Within the range");
      }
     /*else
     {
      System.out.println("it is not in the range");
     }*/
     
     //if user writes an integer outside range
      if(num<1||num>100)
      {
         System.out.println("It is not in the range");
      }
     
     // if to check number is positive
      if(num>0)
      {
         System.out.println("The number is positive");
      }
      if(num<0)
      {
         System.out.println("the number is negative");
      }
     
     //ask the user to enter two numbers, check to see if user enteres one positive and one negative number
      System.out.println("please enter the first number");
      int first = kb.nextInt();
      System.out.println("please enter the second number");
      int second = kb.nextInt();
    
      if(first*second<0)
      {
         System.out.println("opposite sign");
      }
    // write an if statement to check odd or even number
      if((first + second)%2==1) //((first+second)%2!=0)
      {
         System.out.println("odd even");
      }
      else if((first*second)%2 == (first+second)%2) //even even // (x*y)%2==0
      {
         System.out.println("even even");
      }
      else //odd odd
      {
         System.out.println("odd odd");
      }
    
    // ask the user to enter the gpa and SAT : gpa > 4.0 , SAT > 1100 accepted at stanford
    //if the condition not met which is low, give reason
   
   
      System.out.println("please enter the gpa");
      double gpa = kb.nextDouble();
      System.out.println("please enter the sat");
      int sat = kb.nextInt();
   
      if(gpa>=4.0 && sat>=1100)
      {
         System.out.println("Congratulations on being accepted");
      }
      else if(gpa<4.0 && sat>=1100)
      {
         System.out.println("your gpa is low");
      }
      else if(gpa>=4.0 && sat<1100)
      {
         System.out.println("your SAT is low");
      }
      else
      {
         System.out.println("low gpa and low sat");
      }
   
   // nested condtional statments
   
      /*if(gpa>4.0)
      {
         if(sat>=1100)
         {
            System.out.println("accepted");
         }
         else
         {
            System.out.println("low Sat");
         }
      }
      else
       {
         if(sat < 1100)
         {
          System.out.println("low gpa and low sat");
         }
         else
         {
          System.out.println("low gpa");
         }
       }*/
   }
}