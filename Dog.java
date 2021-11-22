//inheritance example 2
//hierarchy

public class Dog extends Cat {
   public void m1() {
      m2();
      System.out.print("dog 1    ");
   }
}

class Lion extends Dog {
   public void m2() {
      System.out.print("lion 2    ");
      super.m2();
   }

   public String toString() {
      return "lion";
   }
}	
class Cat {
   public void m1() {
      System.out.print("cat 1    ");
   }

   public void m2() {
      System.out.print("cat 2    ");
   }

   public String toString() {
      return "cat";
   }
}
class Driver
{
   public static void main(String[] args)
   {
      Cat[] elements = {new Dog(), new Cat(), new Lion()};
      for (int i = 0; i < elements.length; i++) {
         elements[i].m1();
         System.out.println();
         elements[i].m2();
         System.out.println();
         System.out.println(elements[i]);
         System.out.println();
      }    
   }
}