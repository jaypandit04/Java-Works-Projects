public class TryStrings
{
 public static void main(String[]args)
 {
  method2();
 }
  public static void method2()
  {
      method3();
      method3();
      method3();
      method3();
      method4();
      method4();

  }
   public static void method3()
   {
    method4();
    method4();
    method4();
    method4();
    method4();
   }
   public static void method4()
   {
    String s="Farewell,\ngoodbye,\nau revoir,";
    String s1="take care!\nIt's time, to go,\nand I'll be out of sight!\n";
    String s2="take care!\nI'll say, goodbye,\nthat's neither here nor there!\n";
    String s3="see you later!\nI hope, you think,\nI'm a lover, not a hater!\n";
    
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s);
    System.out.println(s2);
    System.out.println(s);
    System.out.println(s3);

   }
}