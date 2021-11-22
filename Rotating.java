public class Rotating
{
   public static void main(String[]args)
   {
      int m=4;
   
      String s[][] = new String[m][m];
      s[0][0] = "1";
      s[0][1] = "2";
      s[0][2] = "3";
      s[0][3] = "4";
      
      s[1][0] = "5";
      s[1][1] = "6";
      s[1][2] = "7";
      s[1][3] = "8";
    
      s[2][0] = "a";
      s[2][1] = "b";
      s[2][2] = "c";
      s[2][3] = "d";
      
      s[3][0] = "e";
      s[3][1] = "f";
      s[3][2] = "g";
      s[3][3] = "h";
    
      for(int i=0; i<s.length;i++)
      {
         for(int j =0; j<s.length;j++)
         {
            System.out.print(s[i][j]);
         }
         System.out.println();
      
      }
    
      System.out.println();
      System.out.println();
      rotate(s);
   
    
   }
  
   public static void rotate(String[][]matrix)
   {
      int o = matrix.length;
      int p = matrix.length-1;
      
     
      String k[][] = new String[o][o];
      //String z[][] =  new String[o][o];
     
      for(int i=0;i<matrix.length;i++)
      {
         for(int j =0; j<matrix.length;j++)
         {
            k[i][j] = matrix[p][i];
          
            p--;  
         }
       
         p = matrix.length-1;
      }
     
          
     
      for(int a=0; a<k.length;a++)
      {
         for(int b =0; b<k.length;b++)
         {
            System.out.print(k[a][b]);
         }
         System.out.println();
      
      }
   
     
   }
}

 
