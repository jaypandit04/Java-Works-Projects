import java.util.*;
public class Class10RandomNumber
{
   public static void main(String[]args)
   {
   // create an object of the random class
      Random rand = new Random();
   // call the method nextInt from the random class
      for(int i=1;i<20;i++)
      {
         int num = rand.nextInt(10);// generates a number between 0-9 inclusive
         System.out.println(num);
      }
      
   //write code to simulate the action of rolling dice 1-6
   // syntax error int dice=rand.nextInt(1,6);
      int dice = rand.nextInt(6)+1;
   //generate a random letter A-Z
      int a ='A';
      int z = 'Z';
   //System.out.println(a+""+z+"*************");
      for(int i=1;i<=10;i++)
      {
         int ascii = rand.nextInt(z-a+1)+a;
      // System.out.println(ascii + "&&&&");
         System.out.println((char)ascii);
      } 
   
   //write a for loop to simulate the action of tossing a coin
   //display head or tall every time you toss a coin
      for(int i=1;i<=20;i++)
      {
         int num = rand.nextInt(2);
         if(num==0)
         {
            System.out.println("Heads");
         }
         else
         {
            System.out.println("Tails");
         }
      }
      toss(rand);
      pick(rand); 
   }   
  //write a method to keep tossing a coin, once you get three heads in a row stop,
   //display the head or tail everytime you toss the coin
   public static void toss(Random rand)
   {
      int counter = 0;
      while(counter !=3)
      {
         int coin = rand.nextInt(2);
         if (coin==0)
         {
            System.out.println("Heads");
            counter++;
         }
         else
         {
            counter = 0;
            System.out.println("Tails");
         }
      }
   }
 //write a program to select three distinct people to give prizes.
 //every person has a numbr between 100-500
   public static void pick(Random rand)
   {
   //generate the first number;(max-min+1)+min
      int num1 = rand.nextInt(500-100+1)+100;
      int num2 = rand.nextInt(500-100+1)+100;
   //make sure that num2 is unique
      while(num1==num2)
      {
       num2 = rand.nextInt(500-100+1)+100;
      }
      int num3 = rand.nextInt(500-100+1)+100;
      while(num1==num3 || num2 == num3)
      {
         num3 = rand.nextInt(500-100+1)+100;
      }
      System.out.println(num1+" "+num2+" "+num3);
   } 

 
}