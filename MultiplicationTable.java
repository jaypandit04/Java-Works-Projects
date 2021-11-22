class MultiplicationTable
{
   public static void main(String[]args)
   {
      table(10,10);
   }
   public static void table(int row,int col)
   {
      for(int i=1;i<=row;i++)
      {
         for(int j=1;j<=col;j++)
         {
            System.out.printf("%4d",i*j);
         }
         System.out.println();
      }
   }
}