/* Author : Jay Pandit
  School : Sac state
*/

import java.util.*; 
public class PasswordPandit
{ 
  public static void main(String[]args)
  {
    Scanner kb = new Scanner(System.in);
    run(kb);
  }
  public static void run(Scanner kb) 
  { 
    for(int i = 1; i <= 100; i++)
    { 
         description();
         System.out.println("*********************************************"); 
         String s = createPassword(kb); 
         System.out.println("Your password was created sucssefully!!!");
         System.out.println("\nHit enter to login to your account"); 
         kb.nextLine();
         login(s,kb);
         System.out.println("\nHit enter key to create a password for your account ");
         kb.nextLine();
     }
   } 
   public static String createPassword(Scanner kb) 
   {
    System.out.println("Enter a valid password of your choice");
       String password = getInput(kb);     
      for(int j=1;j<=100;j++)
      {
       
        if(validate(password))
        {
         break; //break over will make code run directly to validate password
        }
        else
        {
         System.out.println("Enter a valid password ");
         password = getInput(kb);  
        }
      }
       return password;
   } 
   public static void description()
   {
   //the requirements that are needed to make a bank password.
    System.out.println("Password requirements :");
    System.out.println("• 10 or more characters");
    System.out.println("• 2 or more uppercase letters");
    System.out.println("• 2 or more lower case letters");
    System.out.println("• One more numbers 0-9");
    System.out.println("• No space");
    System.out.println("• All of special characters *, _, %");
    System.out.println("• Any other letter");

   }
   public static String getInput(Scanner kb)
   {
    
     String password = kb.nextLine();
     return password;
   }
/*must use a for loop to validate the password.
no contains methods can be used or any other methods from
java can be used
this method includes a lot of if statements
this method displays the reason of why the password is
invalid*/

   public static boolean validate(String s) 
   {
    
    int upper = 0;
    int lower = 0;
    int per = 0; //for percentage (%) character
    int star = 0; // for * character
    int usco = 0; // variable used for underscore (_)
    int digit = 0; // for making count of digits used in password
    int space = 0; // space is not allowed so its necessary to check
    int totalchar = s.length(); // total length of characters or password
    String errorMsg = "";
    
    for(int i=0;i<s.length();i++)
    {
    char c = s.charAt(i);
    // if statement to check for upper case
    if(c>='A' && c<='Z')
    upper++;
    // if statement to check for lower case
    if(c>='a'&&c<='z')
    lower++;
    // if statement to check for percentage character used
    if(c=='%')
    per++;
    // if statement to check for star character
    if(c=='*')
    star++;
    // if statement to check for underscore character
    if(c=='_')
    usco++;
    // if statement to check for digits used
    if(Character.isDigit(c))
    digit++;
    // if statement to check for space user used by mistake 
    if(c==' ')
    space++;
    
    }
    
    //string appending to generate the error, for correct reason
    if(upper<2)
    {
      errorMsg = errorMsg +"Must include two uppercase letters\n";
    }
    if(lower<2)
    {
     errorMsg = errorMsg +"Must include two lowercase letters\n";
    }
    if(totalchar<10)
    {
     errorMsg = errorMsg +"Password must contain minimum 10 characters\n";
    }
    if(per<1)
    {
    errorMsg = errorMsg +"Must include a %\n";
    }
    if(star<1)
    {
    errorMsg = errorMsg +"Must include a star\n";
    }
    if(usco<1)
    {
    errorMsg = errorMsg +"Must include an _\n";
    }
    if(digit<1)
    {
     errorMsg = errorMsg +"Must include at least one number\n";
    }
    if(space>=1)
    {
     errorMsg = errorMsg +"Cannot include space\n";
    }
    //every error possible will generate on identifying the mistakes.
    if(errorMsg == "")
    {
     return upper >=2 && lower>=2 && totalchar>=10 && per>=1 && star>=1 && usco>=1 && digit>=1;
    }
    else
    {
     System.out.println(errorMsg);
     return false;
    }  
   }
   
   public static void login(String password, Scanner kb) 
   {
    System.out.println("Welcome to Meli Bank");
    System.out.println("You can only have 5 tries to login in\nafter that you will be locked out");
    for(int k=1;k<=5;k++)
    {
    //comparing the two strings, or passwords.
     System.out.println("Enter your password to login: ");
     String getpwd = kb.nextLine();
     if(getpwd.equals(password))
     {
      System.out.println("You are successfully logged in");
      break;
     }
     else 
     {
      System.out.println("Invalid password");
     }
    }
   }
}
/*
Password creation
Objective: in this assignment you will be practicing conditional statements and for loops
Problem
A banking system has asked you to create an app so that their customers can create an account by creating a valid password. Once they create a valid password they can login to the system.

Implementaion requirements
To get the full credit you must implement the following methods
1. The code for the main method and the run method is provided and your program must work with the provided code. You are not allowed to change the given codes.
2. main method: create a Scanner object and passes to the run method. Code for this method is given
3. run method: gets the Scanner object, calls the method createPassword to get the valid password, then call the method login to let the user to login to the system. A for loop must be used to let different people to create a password. Code for this method is given
4. createPassWord: this method gets a Scanner object as a parameter and returns a valid password. This method calls the getInput method to get the user’s input. This method passes the user’s input to the method validate to see if it is valid or not. If the validate method returns false, it means that user must enter another password. As soon as the validate methods returns true that means the user has entered a valid password. A for loop is required in this method to keep asking for a valid password. The for loop should repeat 100 times. As soon as you get a valid password, use the break statement to get out of the loop. In the loop you call the method getInput and validate method followed by a conditional statement. Once a valid password is entered by the user, this method returns the valid password.
5. getInput: This method asks the user to enter a password and returns the password. No validation is being done in this method
6. Description: This method does not have any parameters and does not return anything. This method displays the password requirements to the user so that they can follow the rules while creating the password.
7. Validate: This method accepts a String representing the password the user entered. This method checks the length and if the length is less than 10 returns false. Then uses a for loop to keep track of the requirements. Outside the loop either return true or false based on the information you collected in the for loop. The only methods that you can use from the String class is length and charAt. NO OTHER METHODs FROM THE STRING CLASS CAN BE USED. No arrays can be used. No contains method or any pre-written method from java can be use
8. Login: this method gets the created password by the user as its parameter. This method asks the user to enter the password to login. User’s input must be compared against the password created at the time the account was created. If it is a match the person will be logged in. If the password does not match the person will get total of 5 tries and after that the user will be locked out of the system. A for loop is needed.

*/