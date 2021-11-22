// Author : Jay Pandit

/*a program that calculates the total money that Mary spends at a Raley’s grocery store. 
She purchases 3 different items with different quantities. Mary has a 10% discount coupon to use on her purchases.
 A tax rate of 6.25% is calculated on Mary’s total purchase before the discount is given to her. */

import java.util.Scanner;


public class GroceryPandit
{
   public static void main(String[]args)
   {
      getbill();
   }
   public static void getbill()
   {
      int i,quantity=0;
      double price=0,totalcal=0,subtotal=0,salesTax=0,discount=0,subdiscounted=0,total=0;
      String item ="",s = "",a =""; // initailized the string
    
      for(i=1; i<=3; i++)
      {
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter the name of the item");
         item = input.nextLine();
       
         System.out.println("Please enter the quantity of the item");
         quantity = input.nextInt();
       
         System.out.println("Please enter the price of the item you entered");
         price = input.nextDouble();   
         
         totalcal = quantity * price; // totalcal calculates every value of quantity multiplied with price.
         subtotal = subtotal+totalcal;
         
         // This following two string carries the information entered by the user.
         s = s +"\n"+ "name of item "+i+":"+" "+item +"\n"+
                    "quantity of item "+i+":"+" "+quantity   +"\n"+
                     "Price of item "+i+":"+" "+price+"\n\n"; 
         
         a = a + "\n"+item+"\t"+quantity+"\t"+price+"\t"+totalcal;
           
      }
      // after the loop finishes the calculation makes outcome of the bill.
      salesTax = (6.25/100)*subtotal;
      discount = (10*subtotal)/100;
      subdiscounted = subtotal - discount;
      total = salesTax + subdiscounted; 
      System.out.println(s);
      System.out.printf("Item\tQuantity\tPrice\tTotal");
      System.out.printf(a);
      System.out.println();
      System.out.println();
      System.out.printf("Subtotal\t\t\t"+subtotal);
      System.out.println();
      System.out.printf("6.25%s Sales Tax\t\t\t%.2f","%",salesTax);
      System.out.println();
      System.out.printf("10.0%s discount\t\t\t%.2f","%",discount);
      System.out.println();
      System.out.printf("Subtotal discounted\t\t%.2f",subdiscounted);
      System.out.println();
      System.out.printf("Total\t\t\t%.2f",total);      
   }  
}


/* requirements fullfilled 

  use methods, for loops, variables. Solution with no methods will get zero points
• Main method should only have one line of code and that is calling the method that does all the
calculations.
• A helper method should interact with the use, calculates the cost, display the result
• All input values must be stored in variables (name, price, quantity).
• You must use constants for the discount percent and the tax rate.
• The user must be prompted to enter the values for the name, price and quantity (3 times).
• The name of an item may contain white spaces. For example “diet coke” can be one item.
• The result of any calculation must be stored in variables and variables must be used to output the result (subtotal, discount, discounted subtotal, sales tax, total).
• As ALWAYS – you MUST follow all the rules you have been given for good programming style.
• All prices should be output to two decimal points (price). Printf must be used.*/
