//write a method to ask the names of three people along with their score, display all the names
// their score and the average score
import java.util.Scanner;
class Class3AssignmentEx
{
   public static void main(String[]args)
   {
      getinfo();
   }
   public static void getinfo()
   {
      Scanner kb = new Scanner(System.in);
      String name="";
      double score=0;
      double sum=0;
      double avg=0;
      String s="";
      for(int i=1;i<=3;i++)
      {
         System.out.println("Name");
         name = kb.next();
         System.out.println("Score");
         score = kb.nextDouble();
         // add score to the variable sum
         
         sum = sum + score;
         //keep track of all the names and scores
         s = s +name+"\t\t"+score+"\n";    
      }
      avg = sum/3;
      System.out.println(name+" "+score);
      System.out.println(avg);
   }
}