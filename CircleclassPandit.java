/*
Jay Pandit
09/02/2020(mm/dd/yyyy)
student ID: 301691780

Problem
Write a class encapsulating the concept of a circle, assuming a circle has the following attributes:  two doubles representing the x and y coordinates of the center of the circle
 a double representing the radius of the circle
Include the following methods:  two constructors
 accessor methods
 mutator methods
 toString and equals
 methods returning the perimeter (2 * Β * radius) and area (Β * radius2) of the circle
*/


import java.util.*;
public class CircleclassPandit
{
   private double centerX;
   private double centerY;
   private double radius;
   
   //the varaible Radius will only store the input 
   //value and used to evalute correct value for radius
   private double Radius;
  

 //The no-argument constructor should initialize the circle 
 //to be a unit circle with center at the origin.

   public CircleclassPandit()
   {
      centerX = 0;
      centerY = 0; 
      radius = 1;
     
   }
  //The explicit-value constructor ( the second one in the UML diagram ) should use the setRadius
  //method to initialize the radius.
  
   public CircleclassPandit(double initCenterX,double initCenterY, double initRadius) 
   {
      setCenterX(initCenterX);
      setCenterY(initCenterY);
      setRadius(initRadius);
   
   }
  //getCenterX will return centerX  
   public double getCenterX()
   {
      return centerX;
   }
  //getCenterY will return centerY 
   public double getCenterY()
   {
      return centerY;
   }
  //getRadius will return radius
   public double getRadius()
   {
     
      return radius;
   }
   
  //getperimeter will return perimeter 
   public double getPerimeter()
   {
      return Math.round((2*Math.PI*radius)*100)/100;
   }
  
  //getarea will return Area 
   public double getArea()
   {
      return Math.round((Math.PI*Math.pow(radius,2))*100)/100;
   }
  
  //setCenterx method will set centerx to newcenterx
   public void setCenterX(double newCenterX)
   {
      centerX = newCenterX;
   }
  
  //setCentery method will set centery to newcentery
   public void setCenterY(double newCenterY)
   {
      centerY = newCenterY;
   }
  
  /*The setRadius method will validate the newRadius and set the radius of the circle to 
  newRadius if newRadius >= 0, othersies it will set the radius of the circle to 0.*/
  
   public void setRadius(double newRadius)
   {
      Radius = newRadius;
    
      if(newRadius>=0)
         radius = newRadius;
      else
         radius = 0;
   }

   //equals method compare two different object of type circle
   
   public boolean equals(CircleclassPandit otherCircle)
   {
      if(this.radius==otherCircle.radius)
         return true;
      else
         return false;
   }
 
   //The toString method should return a String that is in the format
   public String toString()
   {
     
      double perimeter = getPerimeter();
      double area = getArea();
      String s ="";
      s = s + "For a circle with center at("+centerX+","+centerY+") a radius of "+Radius+" is: \n";
      s = s + "Center: ("+centerX+","+centerY+") Radius: "+radius;
    
    
     
      return s;   
   }
}

//Driver class

class CircleclassDriver
{
   public static void main(String[]args)
   {
     //tostring format
      CircleclassPandit p1 = new CircleclassPandit(0,0,1);
      System.out.println(p1.toString());
   
   //TESTING CONSTRUCTORS:
      CircleclassPandit f1 = new CircleclassPandit(15,25,50);
      System.out.println(f1.toString());
      System.out.println();
      double f = f1.getPerimeter();
      System.out.println("perimeter is: "+f);
      double g = f1.getArea();
      System.out.println("Area is: "+g);
      
      //TESTING MUTATOR METHODS:
      System.out.println();
      CircleclassPandit f2 = new CircleclassPandit(15,25,-5);
      System.out.println(f2.toString());
      
      f1.setCenterX(1);
      f1.setCenterY(2);
      f1.setRadius(10);
      System.out.println(f1.toString());
      double t = -15;
      f1.setRadius(t);
      System.out.println();
      System.out.println("after changing the radius "+t);
      System.out.println();
      System.out.println(f1.toString());
      System.out.println();
      
      //TESTING EQUALS METHOD:
      CircleclassPandit circle1 = new CircleclassPandit(1,1,1);
      CircleclassPandit circle2 = new CircleclassPandit(2,2,2);
      CircleclassPandit circle3 = new CircleclassPandit(1,2,1);
      CircleclassPandit circle4 = new CircleclassPandit(2,2,2);
      
      if(circle1.equals(circle2))
         System.out.println("circle1 is equal to circle2");
      else
         System.out.println("circle1 is not equal to circle2");
   
      if(circle1.equals(circle3))
         System.out.println("circle1 is equal to circle3");
      else
         System.out.println("circle1 is not equal to circle3");
     
      if(circle2.equals(circle4))
         System.out.println("circle2 is equal to circle4");
      else
         System.out.println("circle2 is not equal to circle4");
         
      
         
   
   }
 
}

/*
Write a client class to test all the methods in your class (See sample output from the test program on the next page.).
UML diagram for the Circle class:
Circle
 - centerX: double - centerY: double - radius: double
+ Circle( )
+ Circle( initCenterX: double, initCenterY: double, initRadius: double ) + getCenterX( ): double
+ getCenterY( ): double
+ getRadius( ): double
+ getPerimeter( ): double
+ getArea( ): double
+ setCenterX( newCenterX: double )
+ setCenterY( newCenterY : double )
+ setRadius( newRadius: double )
+ equals( otherCircle: Circle ): boolean
+ toString( ): String
 The no-argument constructor should initialize the circle to be a unit circle with center at the origin.
 The explicit-value constructor ( the second one in the UML diagram ) should use the setRadius
method to initialize the radius.
 The setRadius method will validate the newRadius and set the radius of the circle to newRadius if newRadius >= 0, othersies it will set the radius of the circle to 0.
 The toString method should return a String that is in the format shown in the example below.
*/