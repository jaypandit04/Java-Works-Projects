import java.util.Scanner;
public class Class9inputvalidation
{
  public static void main(String[]args)
  {
   Scanner kb = new Scanner(System.in);
   int num = getInt(kb);
   double num2 = getDouble(kb);
   int num3 = getMonth(kb);
   System.out.println(num);
   System.out.println(num2);
   System.out.println(num3);
   char c = getUpper(kb);
   System.out.println(c);
  }
  // write a method that ask users to enter an integer, than returns the value
  /* s.o.p(there is no integer to read)
  { 
   empty buffer
   prompt the user
  }
   read the integer
  */
  public static int getInt(Scanner kb)
  {
    System.out.print("Enter your age");
    while(!kb.hasNextInt())
    {
     kb.nextLine();
     System.out.print("Enter a valid integer");
    }
    int age = kb.nextInt();
    return age;
  }
  
  /* write a method to ask the user to enter the gpa.as long as it is not a valid double value keep asking.
  finaaly return the gpa this method accepts a scanner object.
  */
  public static double getDouble(Scanner kb)
  {
    kb.nextLine();
    double gpa = -1;
    while(gpa<=0 || gpa>=5)
    {
     System.out.print("Enter your gpa ");
     while(!kb.hasNextDouble())
    {
     kb.nextLine();
     System.out.print("Enter a valid double: ");
    }

     gpa = kb.nextDouble();
     kb.nextLine(); //flush the buffer to get rid of enter key
    }
    return gpa;
  }
  
  /* ask the user to enter a number for a month 1-12. must do data validation.
  this method accepts Scanner object and returns the month
  */
  
  public static int getMonth(Scanner kb)
  {
    kb.nextLine();
    int month = -1;
    while(month>=1|| month<=12)
    {
     System.out.print("Enter the month number ");
     while(!kb.hasNextInt())
    {
     kb.nextLine();
     System.out.print("Enter a valid month number: ");
    }

     month = kb.nextInt();
     kb.nextLine(); //flush the buffer to get rid of enter key
    }
    return month;
  }

  /* ask the user to enter a upper case letter,
  as long as the user is not entering a upper case letter keep prompting
  
  ask the user to enter a letter, read it as string
  get the first letter in the user's input
  while(the letter is not an upper case letter keep asking)
  */ 
  public static char getUpper(Scanner kb)
  {
    char c = ' ';
    while(!(c>'A' && c<'z')) 
    {
      System.out.print("enter an uppercase letter");
      String s = kb.next();
      c = s.charAt(0);
      if(s.length()>1)
         continue; // it means stops what ever is happening and do new iteration or ignore code and start from beigining 
    } 
    return c;
  }

/*
 public static boolean validate(String password)
 {
  int upper = 0;
  int lower = 0;
  for(int i=0;i<password.length();i++)
  {
   char c = password.charAt(i);
   if(c>'A' && c<'Z')
   upper++;
   // if statement to check for lower case
   if(c>'a'&&c<'z')
   lower++;
  }
  if(upper<2)
  System.out.println("not enough upper case");
  return false;
  return upper >=2 && lower>=2;
 }
*/
} 