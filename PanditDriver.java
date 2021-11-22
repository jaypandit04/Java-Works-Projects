/*
Jay Pandit
December 6th
ID: 301691780
*/

/*
Objective
Practice recursive programming
problem
In this assignment you will be writing recursive methods with the given signatures. 
You should not change the method paraments or the method return type. 
Non-recursive solutions will get zero points. 
A shell for your program is provided. 
Do not change the main method. 
Your program must work with the given main method. 
*/

import java.util.*;
public class PanditDriver
{
   public static void main(String[] args)
   {
      // For Testing the palindrom method
      System.out.println("testing the palindrom method");
      int[] a = {5,6,4,5,8,5,4,6,5,12};
      System.out.print(Arrays.toString(a) + " is palindrome?  ");
      System.out.println(palindrome(a,0));
      
      int[] b = {1,2,3,4,3,2,1};
      System.out.print(Arrays.toString(b) + " is palindrome?  ");
      System.out.println(palindrome(b,0));
      
      // Testing sum of the digits
      System.out.println("\ntesting sum of the digits");
      int num = 12345; 
      System.out.println("The sum of the digits in " + num + " is "+ sum(12345,0));
      
      // Testing longest string in an array of string
      System.out.println("\ntesting longest string in an array of string");
      String[] s = {"Hello","Bye","Said","song","Building"};
      System.out.println("The longest string is the array " + Arrays.toString(s) + " is " + longest(s,1,s[0]));
      
      //Tesing the equals method on the strings
      System.out.println("\ntesing the equals method on the strings");
      String s1 = "hello";
      String s2 = "helloo";
      System.out.println("are the strings " + s1 + " and " + s2 +" equal? "  +equals(s1,s2,0));
       
      s1 = "tomorrow";
      s2 = "tomorrow";
      System.out.println("are the strings " + s1 + " and " + s2 +" equal? "  +equals(s1,s2,0));
   
      //Testing the sum of the integers in a link list
      System.out.println("\ntesting the sum of the integers in a link list");
      LinkedList<Integer> newlist = new LinkedList<Integer>();
      newlist.add(5);
      newlist.add(7);
      newlist.add(8);
      newlist.add(12);
      System.out.println("The sum of the numbers in the linklist " + newlist + " is " + listSum(newlist,0,0));
   }


   public static boolean palindrome(int[] a, int index)
   {
       //Returns true if the array is palindrome, returns false otherwise
      if (index == a.length / 2)
         return true;
      if (a[index] != a[a.length - 1 - index])
         return false;
      return true && palindrome(a,index+1);
   }

//this  recursive method that accepts an integer as its parameter and 
//returns the sum of the digits in the give integer. 
   private static int sum(int num, int sum) 
   {
      // it will return the sum with the mod 10 and add the num in that sum.     
      if (num == 0) 
         return sum;
      sum = sum+ num % 10;
      
      // retun sum(num / 10, sum)
      return sum(num / 10, sum);
   }

//write a method that accepts an array of String and returns the string with the longest length
   public static String longest(String[] s, int index, String longest)
   {
      if (index == s.length)
         return longest;
      if(s[index].length() > longest.length())
         longest = s[index];
      return longest(s, index + 1, longest);       
   }

//write a recursive method that accepts two string paramters, 
// returns tru if the strings are the same, false otherwise
   public static boolean equals(String s1, String s2, int index)
   {
      if (index == s1.length() && index == s2.length())
         return true;
      if (s1.length() != s2.length())
         return false;
      if (s1.charAt(index) != s2.charAt(index))
         return false; 
      return true && equals (s1,s2,index+1);
               
   }

//write a method that accepts a linklist of integers and finds 
// the sum of all the numbers in the list
// this recursive method returns the sum of all the numbers in the linklist.
   public static int listSum(LinkedList<Integer> list,int  index, int sum)
   { 
      
      if(list.size() == index)
         return sum;
        
      sum = sum + list.get(index);
      return listSum(list, index + 1,sum);
   
        
   }
}
/*
Objective
Practice recursive programming
problem
In this assignment you will be writing recursive methods with the given signatures. You should not change the method paraments or the method return type. Non-recursive solutions will get zero points. 
A shell for your program is provided. Do not change the main method. Your program must work with the given main method. 
Methods
1.public static boolean palindrome(int[] a, int index): This method accepts an array of integers and an index.  Returns true if the array is palindrome, returns false otherwise.  Refer to the palindrome method for String objects provided during the lecture. In order to sole the problem, think about the base case meaning under what condition the recursive call will stop.  Array {1,2,3,4,3,2,1} is a palindrome array, and the array{1,2,3,4,5,3,2,1} is not a palindrome array.
2.public static int sum(int n): this  recursive method that accepts an integer as its parameter and returns the sum of the digits in the give integer. For example sum(3456) should return 18.  You need to use % and /. What is the base case?
3.Public static String longest(String[] s, int index, String longest): this recursive method finds the longest string in an array of String. Refer to the method getMin that finds the minimum value in an array of integers. 
4.Public static Boolean equals (String s1, String s2, int index): this recursive method returns true if the two string are exactly the same, and returns false otherwise. Refer to the equals method provided for the array of integers during the lecture. 
5.Public static int listSum(LinkedList<Integer> list, int index): this recursive method returns the sum of all the numbers in the linklist. Use the method get from the java LinkedList class. 

Main method
Your must run your program with the following main method. 

Sample output
testing the palindrome method
[5, 6, 4, 5, 8, 5, 4, 6, 5, 12] is palindrome?  false
[1, 2, 3, 4, 3, 2, 1] is palindrome?  true

testing sum of the digits
The sum of the digits in 12345 is 15

testing longest string in an array of string
The longest string is the array [Hello, Bye, Said, song, Building] is Building

testing the equals method on the strings
are the strings hello and helloo equal? false
are the strings tomorrow and tomorrow equal? true

testing the sum of the integers in a link list
The sum of the numbers in the link list [5, 7, 8, 12] is 32
*/