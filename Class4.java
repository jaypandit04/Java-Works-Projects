public class Class4
{
 public static void main(String[]args)
 {
   String s = "Building java program";
   //char charAT(int index)
   char c = s.charAt(9); // to give index 8 string first need to specify, which string index ?
   System.out.println(c);
   
   //converts all the letters to uppercase
   s = s.toUpperCase();
   System.out.println(s);
   s = s.toLowerCase();
   System.out.println(s);
   
   // find the length of the string
   int length = s.length();
   System.out.println(length);
   
   //int indexOf(String str)
   int index = s.indexOf("p");
   System.out.println(index);
   
   //pulling a substring
   int j = s.indexOf("j");
   int end = s.length();
   String sub = s.substring(j,end);
   System.out.println(sub);
   System.out.print(s.substring(0,8));
   
   /*twodecimal();
   Scanner kb = new Scanner(System.in);
   String name = methodtype(kb); */
 }
  /*public static void twodecimal()
  {
   String name = "Mary";
   String d = String.format("%10.2f%10s",12.564654, name);
   System.out.println(d);
  }
  public static String methodtype(Scanner kb)//paramenter is scanner kb as its description.
   {
    System.out.print("Name");
    String name = kb.nextLine();
    return name;
   }*/
 
}