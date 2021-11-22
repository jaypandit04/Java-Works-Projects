class ArrayPractice
{
//not the otput its total matrice digits
   public static void main(String[]args)
   {
      int a[]={1,1,2,2,1};
      int s=-1;
      boolean t;
      
      for(int i=0;i<=a.length;i++)
      {
         if(t=true)
         {
            for(int j=i+1;j<a.length;j++)
            {
               if(a[i]==a[j])
               {
                  s=a[j];
                  t=false;
                  break;
                  
               }
               t=false;
            }
         
         }      }      System.out.print(s);
   }
}