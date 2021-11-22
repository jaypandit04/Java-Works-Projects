public class Class14Point
{
   //instance variable p1(3,4) , p2(4,6)
   private double x;
   private double y;
   //constructor
   //this constructor gets the x and y the point and initializes the instance variables
   
   public Class14Point(double x, double y)
   {
    //left side refers to the instance variable and 
    //right isde refers to the parameters
      this.x = x;   //x = X; 
      this.y = y;   //y = Y;
   }
   //create default objects of type points
   public Class14Point()
   {
      this.x = 1;
      y = 1;
   }
   //create a constructor to create points with integer data type
   public Class14Point(int x,int y)
   {
      this.x = x;
      this.y = y;
   }
   //toString method formate(x,y)
   public String toString()
   {
     return"("+x+","+y+")";
   }
   //accessor methods
   public double getx()
   {
     return x;
   }
   public double gety()
   {
     return y;
   }
   /*public void setz(double newx,double newy)
   {
    x = newx;
    y = newy;
   }*/
   public void setx(double newx)
   {
    x = newx;
   }
   public void sety(double newy)
   {
    y = newy;
   }
   public int getQuad()
   {
    if(x>0 && y>0)
      return 1;
    if(x<0 && y>0)
      return 2;
    if(x<0 && y<0)
       return 3;
    if(x>0 && y<0)
       return 4;
    return 0;
   }
   //what is the distance between two points
   public double getDistance(Class14Point p)
   {
     double d1 = this.x - p.x;
     double d2 = this.y - p.y;
     d1 = Math.pow(d1,2);
     d2 = Math.pow(d2,2);
     return Math.sqrt(d1 + d2);
   }
   public Class14Point midPoint(Class14Point p)
   {
    double x1 = (this.x + p.x)/2;
    double y1 = (this.y + p.y)/2;
    
    Class14Point mid = new Class14Point(x1,y1);
    return mid;
   }
   public double slope(Class14Point p)
   {
    return (this.y - p.y)/(this.x - p.x);   
   }
   //return the mirror of the point over x axis
   public Class14Point mirrorX()
   {
     return new Class14Point(x,-y);
   }
   public Class14Point mirrorY()
   {
     return new Class14Point(-x,y);
   }
   
   public boolean equals(Class14Point p)
   {
     return this.getDistance(p) == 0;
     //return this.X == p.x && this.y == p.y
   }
   public boolean isSymmetrical(Class14Point p)
   {
    return this.x != p.x && this.y == p.y;
   }
   
   
}