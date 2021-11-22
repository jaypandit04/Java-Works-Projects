//polimorphism example


public class Lamb extends Ham {
   public void b() {
      System.out.print("Lamb b   ");
   }
}

class Ham {
   public void a() {
      System.out.print("Ham a   ");
      b();
   }

   public void b() {
      System.out.print("Ham b   ");
   }

   public String toString() {
      return "Ham";
   }
}
class Spam extends Yam {
   public void b() {
      System.out.print("Spam b   ");
   }
}
class Yam extends Lamb {
   public void a() {
      System.out.print("Yam a   ");
      super.a();
   }

   public String toString() {
      return "Yam";
   }
}

class Driver
{
   public static void main(String[] args)
   {
      Ham[] food = {new Lamb(), new Ham(), new Spam(), new Yam()};
      for (int i = 0; i < food.length; i++) {
         System.out.println(food[i]);
         food[i].a();
         System.out.println();     // to end the line of output
         food[i].b();
         System.out.println();     // to end the line of output
         System.out.println();
      } 
   }      
}