public class PointDriver
{
  public static void main(String[]args)
  {
   //create three Point objects using the 3 constructor that we created
   //p1, p2, p3
   Class14Point p1 = new Class14Point(2.4,2.3);
   Class14Point p2 = new Class14Point(3,4);
   Class14Point p3 = new Class14Point();
   
   System.out.println(p1.toString());
   String s1 = "hello";
   System.out.println(p2.toString());
   //calling the accesssor methods
   double x = p1.getx();
   double y = p1.gety();
   System.out.println(x);
   System.out.println(y);
   //mutator methods modifies the instance varaibale after you create
   //p1.setz(45,22);
   p1.setx(45);
   p1.sety(22);
   
   int quad = p1.getQuad();
   System.out.println(quad);
   
   double distance = p1.getDistance(p2);
   System.out.println(distance);
   
   Class14Point mid = p1.midPoint(p2);
   System.out.println(mid);
   
   double Slope = p1.slope(p2);
   System.out.println(Slope);
   
   Class14Point mirror = p1.mirrorX();
   System.out.println(mirror);

   Class14Point Mirror = p1.mirrorY();
   System.out.println(Mirror);

  }
}