import java.util.*;
public class Payroll
{
  double hours;
  double rate;
  String name;
  
  public Payroll(double hours, double rate,String name)throws Exception
  {
     if(hours < 0)
     {
        if(hours > 56)
         throw new Exception("hours cannot be greater than 56");
        
        else
         throw new Exception("hours cannot be negative");
      }
       
     if(rate < 0)
        throw new Exception("Hourly rate cannot be negative");
        
     if(name == null || name.isEmpty())
        throw new Exception("name cannot be null");
     
     this.hours = hours;
     this.rate = rate;
     this.name = name;
     
  }
  
  public double getHours()throws Exception
  {
    if(hours<0)
     throw new Exception("Hours Cannot be negative");
     
    else
      return hours;
  }
  
  public double getRate()throws Exception
  {
     if(rate<0)
      throw new Exception("Hourly rate cannot be negative");
      
     else
       return rate;
  }
  
  public String getName()throws Exception
  {
     if(name==null || name.isEmpty())
      throw new Exception("name cannot be null");
      
     else
      return name;
  }
  
  public void setHours(double newhours)throws Exception
  {
     if(hours<0)
     throw new Exception("Hours Cannot be negative");
     
    else
       hours = newhours;
  }
  
  public void setRate(double newhourlyrate)throws Exception
  {
     if(rate<0)
      throw new Exception("Hourly rate cannot be negative");
      
     else
       rate = newhourlyrate;
  }
  
  public void setName(String newname)throws Exception
  {
    if(name==null || name.isEmpty())
      throw new Exception("name cannot be null");
      
     else
       name = newname;
  }
  
  public void payment(double hours, double rate)throws Exception
  {
    double total=0;
    
    if(rate<0)
     throw new Exception("Raise cannot be negative");
    
    if(hours<0)
      throw new Exception("Hours Cannot be negative");
    
    else
      total = hours*rate;
     System.out.println("Your pay is: "+total);
    
  }
}
class Driver
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
     String name ="";
     double hours=0;
     double rate=0;
     boolean flag=true;
     boolean newflag=true;
     
   while(flag)
   {
    try{
     System.out.println("Enter your name");
     //name = kb.next();
     System.out.println();
     System.out.println("Enter the hours");
     hours = kb.nextDouble();
     System.out.println();
     System.out.println("Enter the rate");
     rate = kb.nextDouble();
     
     Payroll p = new Payroll(hours,rate,name);
     p.payment(hours,rate);
     
          
     flag = false;
     }
     
     catch(Exception e)
     {
      System.out.println(e);
      System.out.println("We have to start all over again");
      flag=true;
     }
     
    }
  }
}