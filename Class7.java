public class Class7
{
   public static void main(String[]args)
   {
     String s1="hello";
     String s2="Hello";
     if(s1.equals(s2))
     System.out.println("yes");
     else
     System.out.println("no");
     //case insensitive
     if(s1.equalsIgnoreCase(s2))
     System.out.println("yes");
     else
     System.out.println("no");
     
     //email verification
     String email = "jp@yahoo.com";
     boolean at = email.contains("yahoo");
     boolean s = email.startsWith("f");
     System.out.println(at);
     System.out.println(s);
     
     char p = grade(45);

   }
   /*write a method that accepts a score and returns the letter grade for a given student
    90 - 100 >A 80 - 89 >B 70-79>C 60-69>D otherwise f*/
   public static char grade(double score)
   {
      if(score>=90 && score<=100)
         return 'A';
      if(score>=80&&score<=89)
         return 'B';
      if(score>=70&&score<=79)
         return 'C';
      if(score>=60&&score<=69)
         return 'D';
      else
         return 'F'; // return statements does not required else 
   }
   /*write a method that accepts the month number and returns the name of the month
   use multiple return statement 1>Januvary*/
   public static String getMonthName(int m)
   {
    if(m==1)
      return"JAN";
    if(m==2)
      return"FEB";
    if(m==3)
      return"MARCH";
    if(m==4)
      return"APRIL";
    if(m==5)
      return"MAY";
    if(m==6)
      return"JUNE";
    if(m==7)
      return"JULY";
    if(m==8)
      return"AUG";
    if(m==9)
      return"SEPT";
    if(m==10)
      return"OCT";
    if(m==11)
      return"NOV";
    if(m==12)
      return"DEC"; 
    return "Error"; 
   }
   /*Write a method that accepts a string as its parameter.If the string contains two uppercase Letter
   returns true otherwise false*/
   
   public static boolean pwd(String s)
   {
     int upper=0;

     for(int i=0;i<s.length();i++)
     {
      //get the char at index i
      char c=s.charAt(i);
      if(c>='A' && c<='Z')
       upper++;
     }
     if(upper>=2)
     return true;
     else
     return false; 
   }
   
   /*write a method that accepts two string from the user
   1. password entered by user
   2. password in the file 
   if two strings are the same letter by letter returns true
   otherwise return false
   */
   
   //case sensitive
   public static boolean compare(String s1,String s2)
   {
    if(s1.length()!=s2.length())
    return false;
    for(int i=0;i<s1.length();i++)
    {
     if(s1.charAt(i)!=s2.charAt(i))
     return false;
    }
    return true;
   }
   //write a method to compare two string for spelling purposes.
   // upper case and lower case can be treated same.
   
   //not the case sensitive
   
   public static boolean speletan(String s1,String s2)
   {
    //convert s1 to lowercase
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    if(s1.length()!=s2.length())
    return false;
    for(int i=0;i<s1.length();i++)
    {
     if(s1.charAt(i)!=s2.charAt(i))
     return false;

    }
     return true;

   }
}