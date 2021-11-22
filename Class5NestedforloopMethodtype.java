import java.util.Scanner;
class Class5NestedforloopMethodtype
{
   public static void main(String[]args)
   {
    //2dimension nested loop
      table(3,10);
      /////////////
      double a = (int)Math.pow(2,2); // type casting making integer, double to integer
      double b =2;
      double c = (double)b;//2.0 will be stored in c explicit type casting
      //implicit type casting
      int num = 12/5;
      System.out.println(num);
      //double division
      double n = 12.0/5;// if 12.0 is replace by 12 that ans would 2.0
      System.out.println(n);
      printPowersOfN(4,3);
      
      System.out.println();
      Scanner kb = new Scanner(System.in);
      processname(kb);
      reversename("java programming");

      String s = printIndexed("Hello");
      System.out.println(s);

   }
   
   public static void table(int row,int col)
   {
      for(int count=1;count<=row;count++)
      {
         for(int i=2;i<=col;i=i+2)
         {
            System.out.print(i+" ");
         }  
       System.out.println();
      }
   }
   
   /*Write a method called printPowerOfNthat accepts a base and an exponent as
    argument and print each power of the base form base0(1) up to that maximum power,
    inclusive.for example, consider the following calls:
    
    printPowerOfN(4,3);
    1 4 16 64
   */
   public static void printPowersOfN(int base,int exp)
   {
    for(int i=0;i<=exp;i++)
    {
      int r = (int)Math.pow(base,i);
      System.out.printf("%4d",r);
    }
   }
   
   /* Write a method called processName that accepts a
   Scanner for the console as a paramenter and that prompts
   the usser to enter his or her full name, then prints the name
   in reverse order(i.e., last name,first name). your may assum
   that only a first and last name will be given. you should read
   the entire line of input at once with the Scanner and then break
   it apart as necessary. Here is a sample dialogue with the user:
   
   Please enter your full name : Sammy Jankis
   Your name in reverse order is Jankis,Sammy
   
   get full name
   find index of space
   find the substring from 0 to index of space
   find substring at the index after te space to end of string
   */
   
   public static void processname(Scanner kb)
   {
    System.out.println("Please enter your full name");
    String full = kb.nextLine();
    int space = full.indexOf(" ");
    String first = full.substring(0,space);
    String last = full.substring(space+1);
    System.out.println(last+","+first);
   }
 
 // Write a method to display a given string in the reverse order
 //this method gets the string as its parameter
 //hello..olleh
/*find lenght of string
 for i=lengh to 0
 display character at the index*/ 

  public static void reversename(String s)
  {
   int length = s.length();
   for(int i=length-1;i>=0;i--)
   {
     char c = s.charAt(i);
     System.out.print(c);
     
   }   
  }
  
  /* 
  Write a method called printIndexed that accepts a 
  String as its paramenter and returns the String's Charaters
  in order followed by their indexes("ZELDA");
  should return Z4E3L2D1A0 to the console.
  
  find the length of string from i=0 to length-1
  get the charaters at index i
  declare sum
  get the index of last letter-1-i
  add the letter and the index to a cummulative sum
  */    
  
  public static String printIndexed(String s)
  {
    int length=s.length()-1;
    String sum = "";
    for(int i=0;i<=length;i++)
    {
     char c = s.charAt(i);
     int index = length-i;
     sum = sum + c + index;
     
    }
    return sum;
  }
}