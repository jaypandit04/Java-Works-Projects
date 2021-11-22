import java.util.*;
public class Class11Arrays
{
  public static void main(String[]args)
  {
   printarray();
   score();
  }
  //write a method to declare an array of int
  //of size. output the content of the array
  public static void printarray()
  {
    int[] a = new int[5];
    //display the content of the array
    //1.short way
    System.out.println(Arrays.toString(a));
    //2.long way
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]+" ");
    }
    a[0]=3;
    a[1]=5;
    for(int s=0;s<a.length;s++)
    {
      a[s]=4*s+3;
    }
    System.out.println(Arrays.toString(a));
    int[] b = {1,2,3,4,5};
  }
  /*write a method to do the following
  1. declare an array of 10 students and 
  store some random values 0-100 in the array
  calculate the average of the scores
  display how many studnets get below avg and how many got above avg 
  
  */
  public static void score()
  {
    //declare the array
    int[] scores = new int[10];
    //store random int values 0-100
    Random rand = new Random();
    for(int i=1;i<scores.length;i++)
    {
     scores[i]= rand.nextInt(101);
    }
    //display content
    System.out.println(Arrays.toString(scores));
    //calculate the avg score of all the scores stored in the array
    //find the sum of all the scores in the array using a for loop
    int sum=0;
    for(int i=1;i<scores.length;i++)
    {
     sum = sum + scores[i];
    }
    //calculate the avg
    double avg=(double)sum/scores.length;
    //find out how many are below avg and how many above avg
    int above = 0;
    int below = 0;
    int exact = 0;
    for(int i=0;i<scores.length;i++)
    {
     if(scores[i]>avg)
     above++;
     else if(scores[i]<avg)
     below++;
     else
     exact++;
    }
     System.out.println(Arrays.toString(scores));
     System.out.println("avg"+avg);
     System.out.println("below"+below);
     System.out.println("above"+above);
     System.out.println("exact"+exact);
  }
}