public class point
    {
       private int x;
       private int y;
       
       public point(int x, int y)
       {
          this.x = x;
         this. y = y;
       }
       public point()
       {
          x = 1; 
          y = 1;
       }
       public String toString()
       {
         return "(" + x + "," + y + ")";
       }
       public boolean equals(point p)
   {
          return x == p.x && y == p.y;
   }
       }