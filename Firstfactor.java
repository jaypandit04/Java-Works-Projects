import java.util.*;
class Firstfactor
{
  public static void main(String[]args)
  {
    int num =0;
    int s = getFactor(num);
    System.out.println(s);
  }
  public static int getFactor(int num)
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("PLease enter a number");
    num = kb.nextInt();
    int i =2;
    while(num%i !=0)
    {
      i++;
    }
   return i; 
  }
}