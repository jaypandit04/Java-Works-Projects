/* Author : Jay Pandit
  School : Sac state */
  
import java.util.*;
public class FractionPandit
{
   private int numerator;
   private int denominator;
  
  // no-argument constructor initialize denominator to zero and numerator to one.
   public FractionPandit()
   {
      denominator = 1;
      numerator = 0;  
   }
   //explicit-value constructor initializes the denominator and numerator. 
   //This constructor uses the setDenominator method to initialize the denominator.

   public FractionPandit(int numerator, int denominator)
   {
      setDenominator(denominator);
      setNumerator(numerator);
   } 
   //setDenominator method will validate the newDenominator 
   
   public void setDenominator(int newDenominator)
   {
      if(newDenominator>0)
         denominator = newDenominator;
      else
         denominator = 1;
   }
   
   //setNumerator method sets the numerator to newNumerator.
   public void setNumerator(int newNumerator)
   {
      numerator = newNumerator;
   }
   
   //getDenominator method returns the denominator.
   public int getDenominator()
   {
      return denominator;
   }
   
   //getNumerator method returns the numerator.
   public int getNumerator()
   {
      return numerator;
   }
   
   //getDoubleFraction method returns the fraction(numerator/denominator) value as a double
   public double getDoubleFraction()
   {
      double fraction = (double)numerator/denominator;
      return  Math.round(fraction*100.00)/100.00;
   }
   
   //getSubtraction method returns a Fraction resulting from subtracting two fractions.
   
   public FractionPandit getSubtraction(FractionPandit f)
   {
     //multiplying the numerator of 1st fraction to denominator of 2nd and vice versa
     //while subtracting the multiplied numbers to get numerator
      int num = this.numerator*f.denominator-this.denominator*f.numerator;
    //multiplying the denominator to get lcm
      int deno = this.denominator*f.denominator;
      return new FractionPandit(num,deno);
   }

   //getMultipication method returns a Fraction resulting from multiplying two fractions. 
   public FractionPandit getMultiplication(FractionPandit f)
   {
   //multiplication of fraction 1st and 2nd
   // numerator to numerator and denominator to denominator
      int num = this.numerator*f.numerator;
      int deno = this.denominator*f.denominator;
      return new FractionPandit(num,deno);
   }
   
   //getAddition method returns a Fraction resulting from adding two fractions.
   public FractionPandit getAddition(FractionPandit f)
   {
     
      int num = this.numerator*f.denominator+this.denominator*f.numerator;
      int deno = this.denominator*f.denominator;
      return new FractionPandit(num,deno);
   }
   
   //getReducedFraction method returns reduced fraction as a string.  
   public String getReducedFraction()
   {
      int num=1;
      int deno=1;
      String s ="";
      int d; 
      gcd(); //using the concept of gcd = greatest common divisor
     //to find the given fraction in reduced form
      d = gcd();  
   
      num = numerator / d;  
      deno = denominator / d;  
   
      s = num + "/" + deno;
      return s;
   }
   
   //gcd method returns the greatest common denominator
   public int gcd()
   {
      int num = getNumerator();
      int deno = getDenominator();
    //loop till the numerator gets equal to denominator
      while(num!=deno)
      {
         if(num>deno)
            num = num - deno;
         else
            deno = deno - num;
      } 
     //it makes denominator equal to numerator without using recurssive
     // as gcd is a greatest number which is commonly divisible by both number
      return deno;
   }
  
  //equals method compare two different object of type fraction 
   public boolean equals(FractionPandit f)
   {
      if(this.numerator==f.numerator && this.denominator==f.denominator)
         return true;
      else
         return false; 
   }
   
   //toString method return a String as formate required
   public String toString()
   {
      double fraction=getDoubleFraction();
      String reduce = getReducedFraction();
      String s = "";
      s = s + "numerator=" + numerator +"\n";
      s = s + "denominator=" + denominator+"\n";
      s = s + "fraction=" + fraction+"\n";
      s = s + "fraction=" + numerator +"/"+denominator+"\n";
   
      s = s + "Reduced fraction is:" + reduce+"\n";
      return s;
   }

    
}

/*
Write a class encapsulating the concept of fraction, assuming a fraction has the following attributes: • An integer representing the numerator
• An integer representing the denominator
Include the following methods:
• Constructors (two)
• accessor methods
• mutator methods
• toString method
• equals method
• Method returning the double value of numerator divided by denominator.
• Method outputting the value of the fraction reduced to its lowest term to the console. For example
instead of outputting 20/60 the method should output 1/3. This will require finding the greatest
common divisor for the numerator and denominator then dividing both by that number.
• method returning the greatest common divisor for the denominator and the numerator

 The no-argument constructor should initialize denominator to zero and numerator to one.
 The explicit-value constructor (the second one in the UML diagram) initializes the denominator and
numerator. This constructor should use the setDenominator method to initialize the denominator.
 The setDenominator method will validate the newDenominator and set the denominator to newDenominator if newDenominator > 0, otherwise it will set the denominator to 1.
 The setNumerator method sets the numerator to newNumerator.
 The getDenominator method returns the denominator.
 The getNumerator method returns the numerator.
 The getDoubleFraction method returns the fraction(numerator/denominator) value as a double
 The getReducedFraction method returns reduced fraction as a string.
 The gcd method returns the greatest common denominator. This method is called by the getReducedFraction method.
 The getSubtraction method returns a Fraction resulting from subtracting two fractions.
 The getMultipication method returns a Fraction resulting from multiplying two fractions.
 The getAddition method returns a Fraction resulting from adding two fractions.
 The equals method compare two different object of type fraction and returns true if they are equal
otherwise returns false.
 The toString method should return a String that is in the format shown in the example below.
*/