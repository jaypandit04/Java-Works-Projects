import java.util.Scanner;//first step
public class InteractiveCh3Class2
{
  public static void main(String[]args)
  {
   getinfo();
   area();
  }
   public static void getinfo()
   {
     // second step declare a variable of type scanner
     Scanner input = new Scanner(System.in);
     System.out.print("name-->"); 
     String name = input.nextLine();//read one or more words
    
     System.out.println("Major-->");
     String Major = input.nextLine();
    
     System.out.println("units-->");
     int units = input.nextInt();//read an integer
     
     System.out.println("gpa-->");
     double gpa = input.nextDouble();//read a double
     
     System.out.println(name+"\n"+Major+"\n"+units+"\n"+gpa);
   }
     // write a method that asks that user for the radius of a circle, calculates the area and display the result
    public static void area()
    {
     Scanner input = new Scanner(System.in);
     System.out.print("enter the radius of circle");
     double radius = input.nextDouble();
     double area = Math.PI*Math.pow(radius,2);//3.14 * radius * radius;
     System.out.println("area of circle is "+area);
    }   
}