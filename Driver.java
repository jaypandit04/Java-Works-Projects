public class Driver
{
   public static void main(String[] rgas)
   {
      System.out.println(isPrime(11, 2));
      System.out.println(isPrime(18, 2));
      System.out.println(isPrime(13, 2));
   }
   public static boolean isPrime(int num, int fact)
   {
          
      if(num%fact==0  && fact<13 && num!=fact)
         return false;
       
      else if(num%fact!=0  && fact<13 && num!=fact)
         return isPrime(num,fact+1);
         
      return true;
       
       
   }
}

//P-1
class Test {    
   public static void main(String[] args) {       
      try {
         Object o = new Object();        
         String d = (String)o;
      }
      catch(ClassCastException e)
      {
         System.out.println("Class Cast Exception.");
      }
   }
}

//P-2

class Test2 {               
   public static void main(String[] args) {                
      try {
         Object o = null;                
         System.out.println(o.toString());  
      } 
      catch(NullPointerException e) 
      { 
         System.out.println("NullPointerException."); 
      }  
   } 
}

class Test3
{ 
   public static void main(String[] args)  
   {
     
      method();
        
   }  
   public static void method() 
   {
      try {
         Object o = new Object();        
         String d = (String)o;
      }
      catch(ClassCastException e)
      {
         System.out.println("Class Cast Exception.");
      }
      catch(Exception e)
      {
  
        System.out.println(e);
      }
   } 
}

// Problem 4
class Driver2
{     
    public static void main(String[] args)
     {
        int year = 1;       
        int total = 0;       
        int tuition = 1000;   // per semester       
        calculatetuition(tuition, year, total);     
        
    }     
    
    public static void calculatetuition (double tuition, int year, double total)    
    {    
        if(year<=5) 
        {
            double fees = tuition*2;
            //variable fees will Store then amount of every year
            System.out.println("Year "+ year +" tuition: "+ fees);
            
            //variable total adds the tution fees of every year to increase it.
            total = total+ fees;
            
            //in the formula the tuition is the amount of that year, so before passing in method
            //it is important to increment at the required rate
            tuition = tuition + (tuition*0.025);
            
            calculatetuition(tuition,year+1,total);
        } 
        else 
        {
            System.out.println("Total tuition for 5 years is: " + total);
        }
    }    
}