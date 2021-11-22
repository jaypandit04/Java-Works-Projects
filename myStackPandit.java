/*
Jay Pandit
11/29/2020(mm/dd/yyyy)
student ID: 301691780
*/

/*
Objectives
Practice Stack, infix, postfix evaluation.
Problem
Write a program that converts an infix expression to a postfix expression and then evaluates the postfix expression. 
Requirements
•This program must be implemented based on the given requirements and must include all the methods. Solutions off the internet will get zero points. 
•Java pre-written Stack class cannot be used or else zero points will be assigned. 
•All the required classes must be implemented.
•Your program must work with the given main method. I will use the main method to run your program and you will be graded based on the correctness of running the given main method
•Must submit one file containing all the classes
•All the methods header must be exactly as given. Feel free to change the code inside the method but not method header
•NO pre-written classes such as Stack, Queue, collection classes can be used or else zero points will be assigned. 
You must implement the following classes and interface
1.MyStack interface, the methods are provided in the given java file
2.Class Stack implements myStack.

*/

import java.util.*;
public interface myStackPandit
{
   public void push(String s);
   public String peek();
   public boolean isEmpty();
   public String pop();
}
class Stack implements myStackPandit   //must implement the myStack interface
{
   ArrayList<String> s  = new ArrayList<String>();
    
   public void push(String token)
   {
      s.add(token);
   }
     
   public String peek()
   {
      if(s.size()==0)
         return null;
      
      return s.get(s.size()-1);     
       
   }
     
   public boolean isEmpty()
   {
      if(s.size() == 0)
         return true;
      else
         return false;
      
   }
    
   public String pop()
   {
      if(s.size()==0)
         return null;
      
      return s.remove(s.size()-1);  
   }

   public String toString()
   {
      ArrayList<Object> list =  new ArrayList<Object>();
      String s =" "; //s name of variable type String
     
      while(!isEmpty())
      {
         Object o = pop();
         s = s + " "+o;
         list.add(o);
       
      }
     
      int i=list.size()-1;
    
      while(i>=0)
      {
         Object o = list.remove(i);
         String p = (String)o;
       
         System.out.println(o);
         push(p);
         i--;
      }
     
      return s;
   }
     
}

class Expression
{
   private String exp;  // instance variable
   
   public Expression(String s)
   {
      exp = s;
   }
   
   public String getPostfix()
   {
      String p = "";//p is variable name of type String
      
      Stack m = new Stack();
            
      StringTokenizer st = new StringTokenizer(exp," ");
      
      while(st.hasMoreTokens())
      {
         String token = st.nextToken();
        
         if(token.equals("+") || token.equals("-")||token.equals("/")||token.equals("*")) 
         {
            int var = precedence(token);
           
            if(var == 3) 
            {
               while(!(m.isEmpty()) && precedence(m.peek()) == 3) //the token is * or /
               {
                  String k = m.pop();  
                  p = p + " "+ k;
                                 //p and k is variable name of type String

               }
            }
                     
            else if(var == 2) // meaning the token is + or -
            {
               while(!m.isEmpty() && (precedence(m.peek()) == 2 || precedence(m.peek()) == 3))
               {
                     
                  String k = m.pop();  
                  p = p + " "+ k; //p and k is variable name of type String


                     
                 
               } 
            }
            m.push(token);
         }
         else
         {    
            p = p + " "+ token;
         }
      }// end of while
     
      while(!(m.isEmpty()))     
      {
         String k =  m.pop();  
         p = p +  " "+k;//p and k is variable name of type String


      }//end while
                   
      return p;
   }
   
   private static int precedence(String opr)
   {
     
      if(opr.equals("*")|| opr.equals("/")) 
         return 3;
     
      if (opr.equals("+")|| opr.equals("-")) 
         return 2; 
      
      //(values 2 and 3 are just numbers that I selected)
      return 0;
   }
   
   public int evalPostfix()
   {
      String post = this.getPostfix();
      Stack stack = new Stack();
      
      int result = 0;
      
      StringTokenizer st = new StringTokenizer(post, " ");
      while (st.hasMoreTokens())
      { 
         String token = st.nextToken();
         //If the token is not * / + -
      
         if(!token.equals("+") && !token.equals("-") && !token.equals("/") && !token.equals("*")) 
         {
            stack.push(token);
         }
         else
         {
            String n1 = stack.pop();
            String n2 = stack.pop();
            int num1 = Integer.parseInt(n1); //convert string numbers to int. “12”  12
            int num2 = Integer.parseInt(n2);
                 
                 
            result = calculate(num1,num2,token);
            String r =  Integer.toString(result);
                  
                 //Push the result from the calculate method to the stack.
            stack.push(r);
         }     
                 //(Since the calculate method returns an int and the stack is of type string you must concatenate the result with “” before pushing it to the stack. )
         
      }//end while
   
      String n = stack.pop();
      
      int value = Integer.parseInt(n);
      return value ;       
   }
    
     
  
   private int calculate(int num1, int num2, String opr)
   {
      if(opr.equals("*"))
         return num1 * num2;
    
      if(opr.equals("/"))
         return num2 / num1;
     
      if(opr.equals("+"))
         return num1 + num2;
     
      if(opr.equals("-"))
         return num2 - num1;
   
      return 0;
   }
}
class ExpDrive
{
   public static void main(String[] args)
   {
     
    // String s = "5 - 2";
      ArrayList <String> expList = new ArrayList<String>();
      expList.add("2 + 3 + 7 * 4 - 2 / 3");
      expList.add("3 - 4 / 2 + 6 * 3");
      expList.add("5 * 6 - 8 + 2 * 10");
      expList.add("4 + 8 * 3 - 2 / 34");
      expList.add("6 - 3 + 6 / 2 * 4 - 8");
      for(int i = 0; i < expList.size(); i++)
      {
      
         Expression e1 = new Expression(expList.get(i));
         String post = e1.getPostfix();
         //System.out.println("Infix: "+ exp.get(i) + ",  postfix: " + post);
         int result = e1.evalPostfix();
         System.out.println("Infix: "+ expList.get(i) + ",  postfix: " + post + " = " + result);
      }
   
   }
}

/*
                                      Stack
-ArrayList<String> s    //represents the stack
+ Stack ()  // instantiate the ArrayList s
+ void push (String token)// push the token to the top of the Stack 
+String pop ();//pops and returns the element at the top of the stack
+String peek ();//returns the element at the top of the stack without popping it 
+Boolean isEmpty();// returns true if the stack is empty, returns false otherwise
+String toString();//returns a string representing the elements in the stack 

                                      Expression
-String exp;
+Expression (String e); // assigns e to exp
-int static precedence (String opr) ; 
-int static calculate (int num1, int num2, String operation)  //see below
+String getPostfix();// returns postfix of exp, see below
+int evalPostfix(); //evaluates the postfix expression, see below

Expression class Methods implementation
Private int static precedence (String opr): This is a private method since it will be only called in the Expression class. 
if the opr is * or / this method should return 3, if the opr is + or – this method should return 2. (values 2 and 3 are just numbers that I selected)
************************************************
Private int static calculate (int num1, int num2, String operation): This method is private since it will only be called in the Expression class. this method uses switch or if statements to calculate the expression. For example one of the if statement would be:
if(operation.equals(“*”))
     return num * num2
you need to have conditional statements for the operations + , -, /
***************************************
public String getPostfix():   This method does not get any parameter

Here is the pseudocode 

declare a string to hold the postfix expression
create an object of the Stack class you just created
use the stringTokenizer class to tokenize the exp instance variable declared in the Expression class: StringTokenizer st = new StringTokenizer(exp," ");
while(st.hasMoreTokens())
{
      String token = st.nextToken();
      If the token is any of the operations +, -, /, *
      {
           Get the precedence of the token by calling the method precedence
           If the precedence is 3 
           {
                 while the stack is not empty and the precedence of the top of the stack is 3//the token is * or /
                 {
                        Pop the element at the top of the stack
                        Concatenate it to the postfix expression
                }//end while
           }
          else if the precedence of the token is 2 // meaning the token is + or -
          {
                 While the stack is not empty and the precedence of the top of the stack is 2 or 3
                 {
                        Pop the element at the top of the stack
                        Concatenate it to the postfix expression
                 }  //end while   
          }
          Push the token to the stack
      }
else  // token is a number and must be concatenated to the postfix
{    
     concatenate the token to the postfix expression
}
}// end of while
While the stack is not empty
{
  Pop the stack 
Concatenate it to the postfix
}//end while

return postfix
//end of the method
******************************************************************* 
int evalPostfix() : this method does not get any parameter

Here is the pseudocode 
String post = this.getPostfix()    //cretes the postfix expression
Declare a Stack of the stack class that you created
int result = 0;
StringTokenizer st = new StringTokenizer(post," ");
while (st.hasMoreTokens()) { 
   String token = st.nextToken();
         If the token is not * / + -
               Push the token to the stack
        else
         {
                 String n1 = Pop the stack
                 String n2 = pop the stack
                 Int num1 = Integer.parseInt(n1) //convert string numbers to int. “12”  12
                 Int num2 = Integer.parseInt(n2);
                 Call the method calculate with num1, num2, and token
                 Push the result from the calculate method to the stack. (Since the calculate method returns an int and the stack is of type string you must concatenate the result with “” before pushing it to the stack. )
      } 
}//end while
Pop the stack and convert it to an integer and return the result
//end of the method
*****************************************************************
           
4.	Driver class
Complete driver class is provided.    

Sample output: 
Infix: 2 + 3 + 7 * 4 - 2 / 3, postfix: 2 3 + 7 4 * + 2 3 / - = 33
Infix: 3 - 4 / 2 + 6 * 3, postfix: 3 4 2 / - 6 3 * + = 19
Infix: 5 * 6 - 8 + 2 * 10, postfix: 5 6 * 8 - 2 10 * + = 42
Infix: 4 + 8 * 3 - 2 / 34, postfix: 4 8 3 * + 2 34 / - = 28
Infix: 6 - 3 + 6 / 2 * 4 - 8, postfix: 6 3 - 6 2 / 4 * + 8 - = 7        




*/