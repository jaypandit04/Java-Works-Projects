/* Author : Jay Pandit
  School : Sac state */


public class FractionDriver
{
   public static void main(String[]args)
   {
      FractionPandit p1 = new FractionPandit(60,20);
      System.out.println(p1.toString());
   
      FractionPandit f1 = new FractionPandit(2,15);
      FractionPandit f2 = new FractionPandit(3,6);
      FractionPandit f3 = new FractionPandit(5,10);
   
      if(f1.equals(f2))
         System.out.println("f1 is equal to f2");
      else
         System.out.println("f1 is not equal to f2");
   
      if(f1.equals(f3))
         System.out.println("f1 is equal to f3");
      else
         System.out.println("f1 is not equal to f3");
      if(f2.equals(f3))
         System.out.println("f2 is equal to f3");
      else
         System.out.println("f2 is not equal to f3");
         
      System.out.println();
      FractionPandit f = f2.getSubtraction(f1);
      System.out.println(f);
      FractionPandit g = f2.getMultiplication(f1);
      System.out.println(g);
      FractionPandit h = f2.getAddition(f1);
      System.out.println(h);
   
   
   }
}