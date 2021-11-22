import java.util.*;
class BankAccount
{
   double balance;
   double rate;
  
   public BankAccount(double balance, double rate)  throws Exception 
   {
      if(balance < 0)
         throw new Exception("Balance cannot be negative");
      if(rate < 0)
         throw new Exception("Interest rate cannot be negative");
      this.balance = balance;
      this.rate = rate;
   }
   //if the withdraw amount is less than the balance throw an exception
   
   public double getBalance()throws Exception
   {
     
     if(balance == 0)
      throw new Exception("balance is Empty");
     
     else 
       return balance;
   }
   
   public double getRate()throws Exception
   {
     if(rate==0)
      throw new Exception("Rate is Empty");
     
     else 
       return rate;
   }
   
   public void setBalance(double newbalance)throws Exception
   {
     if(balance < 0)
         throw new Exception("Balance cannot be negative");
     else
       balance = newbalance;
   }
   public void setRate(double newrate)throws Exception
   {
      if(rate < 0)
         throw new Exception("Interest rate cannot be negative");
     
      else
        rate = newrate;
   }
   
   public void withdraw(double amount) throws Exception
   {
      if(amount > balance)
         throw new Exception("Not enough fund to withdraw");
      if(amount < 0)
         throw new Exception("Amount to withdraw cannot be negative");
      balance = balance - amount;
   }
   
   public void deposit(double amount) throws Exception
   {
      if (amount < 0)
         throw new Exception("deposit amount cannot be negative");
      balance = balance + amount;
   }
}
class AccountDriver
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      boolean b = false;
      while(!b)
      {
         try
         {
            System.out.println("Enter the balance: ");
            double balance = kb.nextDouble();
            System.out.println("Enter the interest rate: ");
            double rate = kb.nextDouble();
            BankAccount c = new BankAccount(balance,rate);
            //System.out.println(c.getBalance());
            c.withdraw(300);
            b = true;
         }
         catch(Exception e)
         {
            System.out.println(e.getMessage());
         }
      } 
   }
}