import java.util.*;
public class Class12Arrayparameter
{
   public static void main(String[]args)
   {
   // calling a method that excepts to get an array
      int[] num ={12,7,-1,25,3,9};
      System.out.println(num);// print the refrence of the array
      int myAge=25;
      print(num,myAge);
      System.out.println(Arrays.toString(num));//print the contnt of array + change
      System.out.println(myAge);
   
      String[] contact={"Alex 1234","Jose 3452","Maria 78784","Sarah Busta"};
      String info = search(contact,"Maria");
      System.out.println(info);
      info=search(contact,"Gita");
      System.out.println(info);
      
      boolean b=remove(contact,"Maria");
      System.out.println(Arrays.toString(contact));
      
      contact=deleteLast(contact);
      System.out.println(Arrays.toString(contact));
      
      
      
   }
 /*write a method that accepts an array of integer and display the content on screen*/
   public static void print(int[] a, int myAge)
   {
      myAge=34;
      System.out.println(a +"*******");
      for(int i=0;i<a.length;i++)
      {
         System.out.print(a[i]+" ");
      }
      a[3]=1000;
   }
 /*
 write a method called max that accepts 
 an array of integer as a parmeter and rturns 
 the maximum value in the array. for example if the array
 passed stores{12,7,-1,25,3,9},your METHOD SHould return 25. you may assume the array contins atleast one element.
 your method should not modify the elements of the array.
 */
 
   public static int max(int[] num)
   {
      int max = num[0];
      int index = 1;
   // while(index<num.length)   
      for(int i=1;i<num.length;i++)
      {
         if(num[i]>max)
            max = num[i];
      }
      return max;
   }
 //write a method that accepts an array of contacts and a name, returns
 //the phone number for the given name
 
   public static String search(String[] c,String name)
   {
      for(int i=0;i<c.length;i++)
      {
         if(c[i].contains(name))
         {
            return c[i];
         }
      }
      return "Not found";
   }
   //remove a phone number from the content list
   //make sure to shift elements to the right if needed
   public static boolean remove(String[] c,String name)
   {
      for(int i=0;i<c.length;i++)
      {
         if(c[i].contains(name))
         {
            for(int j=i+1;j<c.length;j++)
            {
               c[j-1] = c[j];
            }
            c[c.length -1]=" ";
            return true;
         }
      }
      return false;
   
   }
   //shrinking size of array by one
   public static String[] deleteLast(String[] c)
   {
    //declare an array with smaller size
    String[] copy = new String[c.length-1];
    for(int i=0;i<copy.length;i++)
    {
     copy[i] = c[i];
    }
    //c=copy;
    System.out.println(Arrays.toString(copy)+"*****");
    return copy;
   }
   
   /*write a method that accepts an array of integers
   returns true if array is sorted from smallest to biggest
   returns false otherwise 34 56 78 22*/
 
  public static boolean isSorted(int[] num)
  {
   boolean sorted=true;
   for(int i=0;i<num.length;i++)
   {
    if(num[i]>num[i+1])
     sorted = false;
   }
   return sorted;
  }
  public static boolean isSorted1(int[] num)
  {
   //boolean sorted = true; 1 2 3 4
   for(int i=0;i<num.length-1;i++)
   {
    if(num[i]>num[i+1])
      return false;
   }
   return true;
  }

}