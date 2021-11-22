/*A program called FarewellGoodBye that prints the following lyrics 50 times on the screem.
 Using static methods to show structure and eliminate redundancy in the solution.*/

public class FarewellGoodByePandit
{
   public static void main(String[]args)
   {
      method1(); 
   }
   public static void method1()
   {
      method2();
      method2();
      method3();
      method3();
   }
   public static void method2()
   {
      method3();
      method3();
      method3();
      method3();
   }           
    
   public static void method3()
   { 
      method4();
      method4();
      method4();
      method4();
      method4();
   }
   public static void method4()
   {
      System.out.println("-----------------");
      method5();
      method6();
      method5();
      method7();
      method5();
      method8();
      System.out.println("-----------------");
   
   }
   public static void method5() // This method has the repeated parts of lyrics. 
   {
      System.out.println("Farewell,");
      System.out.println("goodbye,");
      System.out.println("au revoir,");
   }
   public static void method6() // for using few lines in the method, lyrics is divided into methods.
   {
      System.out.println("good night!");
      System.out.println("It's time, to go,");
      System.out.println("and I'll be out of sight!\n");
   }
   public static void method7()
   {
      System.out.println("take care!");
      System.out.println("I'll say, goodbye,");
      System.out.println("that's neither here nor there!\n");
   }
   public static void method8()
   {
      System.out.println("see you later!");
      System.out.println("I hope, you think,");
      System.out.println("I'm a lover, not a hater!\n");
   }
}

/*Answers the following questions:
  
1. What are the repeated parts of the output?
Ans : Farewell,
     goodbye,
    au revoir,
2. How many methods do you need. 
Ans : We need 8 methods to have few lines in the methods. But we can use less methods with more lines.
3. How many method calls should you have in the main method ?
Ans : one method call in main method
*/