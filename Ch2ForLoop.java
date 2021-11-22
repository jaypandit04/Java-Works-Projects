public class Ch2ForLoop
{
   public static void main(String[]args)
   {
      forLoop1();
      forLoop2();
      System.out.println();
      forLoop3();
      System.out.println();
      forLoop4();
      System.out.println();
      sum();
      System.out.println();
      multiply();

   }
   public static void forLoop1()
   {
      for(int count=10; count>=5; count--)
      {
         hello();
      }
   }
   public static void hello()
   {
      System.out.println("My name is Jay");
   } 
   //write a method that has a for loop to display 1 2 3 4 5 6 7 8 9 10
  public static void forLoop2()
  {
   for(int count=0; count<=10; count++)
    {
     System.out.print(count + " ");
    }
   }

   public static void forLoop3()
  {
   for(int count=10; count>0; count=count-1)
    {
     System.out.print(count + " ");
    }
   }
    // print even numbers
    public static void forLoop4()
  {
   for(int count=10; count>=0; count=count-2)
    {
     System.out.print(count + " ");
    }
   }
   // write a method using a for loop to find the sum of 1+2+...+10
   public static void sum()
  {
   int sum=0;
   for(int i=1; i<=10; i++)
    {
      // cumulitive sum
      sum=sum+i;
    }
    System.out.print("the sum is " +sum);
    }
    //write a method to calculate 1*2*..*10
    public static void multiply()
    {
    int mul=1;
    for(int i=1; i<=10; i++)
      {
       mul=mul*i;
      }
      System.out.print("the multiplication is " +mul);
    } 
}