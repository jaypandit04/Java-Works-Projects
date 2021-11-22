public class Class7Factorial
{
 public static void main(String[]args)
 {
  int num = 10;
  fact(num);
 }
  public static void fact(int a)
  {
   for(int j=1;j<=5;j++)
   {
   
     int result = 1;
     String s=""+a;
  
     for(int i=a-1; i>=1; i--)
   {
     result = result * i;
     s = s+"*"+i;
   }
   if(a==0)
   {
    result=1;
    s=1+"";
   }
   System.out.println(a+"!="+s+"="+result);
  }
 }
}