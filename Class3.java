/*method returning the value, printf*/

import java.util.Scanner;
public class Class3
{
   /* write a complete program which ask user to enter the radius of circle.
   and the program calculates the area and circumference */
   public static void main(String[]args)
   {
     double a = 3.4547373783;
     System.out.printf("%.2f\n",a);
     System.out.printf("%10.2f\n",a);
      double r = 0,k = 0;
      r = getinput();
      System.out.println("Radius is: "+r); 
      //send the radius to the method getArea
      double area = getArea(r);
      System.out.println("Area ="+area);
      //printf
      System.out.printf("%.2f\n",area);
      double circumference = getCir(r);
      System.out.println("Circumference ="+circumference);
      k = getkilometer();
      System.out.println("kilometer: "+k); 
      double meter = getMeter(k);
      System.out.println("the converted meters are"+meter);
   }
   public static double getinput()
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the radius");
      double radius = kb.nextDouble();
      return radius;
   }
   public static void description()
   {
      System.out.println("This program gets the users input");
      System.out.println("calculates the area and the circumference of circle");
   }
   public static double getArea(double r)
   {
      return Math.PI*Math.pow(r,2); 
        
   }
   public static double getCir(double r)
   {
      return Math.PI*r*2;
   }
   //write a method converts kilometer to meter and return the result
   public static double getkilometer()
   {
     Scanner kb = new Scanner(System.in);
     System.out.println("enter the kilometer");
     double km = kb.nextDouble();
     return km;
   }
   public static double getMeter(double k)
   {
     return k/1000;
   }
}