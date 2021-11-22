/* Author : Jay Pandit
  School : Sac state */

import java.util.*; 
public class WordGamePandit
{
   public static void main(String[] args) 
   {
      String[] correct = new String[20]; //index size=20
      String[] incorrect = new String[20]; //index size=20
      description(); // this is a method call displays the
       //rules of the game
      fillArray(correct,incorrect);
      play(correct,incorrect);
   
   } 
   public static void description()
   {
   //game description
      System.out.println("Welcome to Word Game");
      System.out.println("Game Rules :");
      System.out.println("1) It is a multiplayer game");
      System.out.println("2)Player one will enter 20 correct and 20 incorrect spelled words");
      System.out.println("3)Player two will get 20 chances to identify the words");
      System.out.println("4)Note 1 : player will get 1 point for correct answers");
      System.out.println("5)Note 2 : for each incorrect answer -1 will be deducted from the score");
      System.out.println("Lets Play");
   }
/*this method fills in the arrays either by asking the user or by reading from a file*/
   public static void fillArray(String[] correct, String[] incorrect)
   {
      Scanner kb = new Scanner(System.in);
      //as no list, so multiplayer game, 20 correct inputs
      System.out.println("Please enter 20 correct spelled words");
      for(int i=0;i<correct.length;i++)
      {
         correct[i]= kb.nextLine();
      }
      //20 incorrect inputs
      System.out.println("Please enter 20 incorrect spelled words");
      for(int j=0;j<incorrect.length;j++)
      {
         incorrect[j]=kb.nextLine();
      }
   
     
   }
/*this method should the player to play maximum 20 times, then ask if anyone else wants to play the game*/
   public static void play(String[] correct, String[] incorrect)
   {
      Scanner kb = new Scanner(System.in);
       
      int counter=0; //it will count number of times player played and restrict them, player can play maximum 20 times
      String ans=""; // stores the users ans in game
      boolean repeat = true; 
      int score = 0; // counts the players score
      boolean morePeople = true; 
      int stop=0; //stops the loop if player want to end game before playing 20 times
      
      while(morePeople)
      {
         while(repeat && counter<20 && stop==0)
         {
            Random rand = new Random(); //it will generate two numbers, futhure to choose list either from correct or incorrect words 
            int num = rand.nextInt(2);
            System.out.println();
           
           
            if(num==0)
            {          
               int numright = rand.nextInt(10);
             //any number between 0(inclusive) and 10(exclusive) will generate and
             // help to pick the words from the selected list
             
               System.out.println(correct[numright]);
             
               System.out.println("Is it spelled correctly ?");
               System.out.println("enter y for correct and n for incorrect");
               ans = kb.nextLine();
               if(ans.equals("y"))
                  score++;
               else if(ans.equals("n"))
                  score--;                          
            }
           
            if(num==1)
            {
               int numwrong = rand.nextInt(4);
               System.out.println(incorrect[numwrong]);
             
               System.out.println("Is it spelled correctly ?");
               System.out.println("enter y for correct and n for incorrect");
               ans = kb.nextLine();
               if(ans.equals("n"))
                  score++;
               else if(ans.equals("y"))
                  score--;
            }
           //any player can end the game in between
            System.out.println("Do you want to continue playing\ntype yes or no\n");
            ans = kb.nextLine();
            if(ans.equals("no"))
            {
               System.out.println("your score : "+score);
               stop = 1;
               repeat = false;
            }
            else if(ans.equals("yes"))
               counter++; 
            repeat = true;
         
         
         
         //generate a random number to select between the two arrays of words
         //generate another random number to select the specific element in one of the arrays
         //display the word to the user
         //ask the user if it is spelled correct or incorrect 
         //if the user is correct add one to the score, else 
         //reduce one from the score
         //ask the user if she/he wants to continue
         //if no display the score, and set repeat to false
         } 
         //final last score will be displayed in order, the game is ended
         System.out.println("last score : "+score);  
         score = 0;
         counter = 0;
         System.out.println("anyone else wants to play\nenter yes or no");
         ans = kb.nextLine();
         if(ans.equals("no"))
         {
            System.out.println("Thank you for playing the Word Game");
            morePeople = false;
         }
         else if(ans.equals("yes"))
            morePeople = true;
          
         
      //ask if anyone else wants to play, if not set morePeople to false
      }
   }
}
/*
Problem: you are to write a java program allowing the user to play a word game. 
There should be two different lists of words: a set of misspelled words and a set of words spelled correctly. 
Here are the steps to play the game:
1. Your program randomly selects a word from the 
list (it could be a word that is misspelled or a word that is spelled correctly. 
Use the Random class to generate random numbers:
Random r = new Random(); //creates an object of the Random class
int a = r.nextInt(10) //generates a random number between 0 (inclusive) and 10(exclusive)
2. The word will be displayed to the user
3. User needs to decide if the word is spelled correctly or not
4. If the user’s answer is correct then he/she will gain one point otherwise he/she will lose a point
5. Ask the user if he/she wants to play again
6. If the answer is no, display the score
7. If the answer is yes go to the step 1.


Requirements:
1. Write a method for displaying the description of your program
2. Write a method for filling in the array from the user or (files for extra credit) 3. Write a method called play
4. Write the algorithm for this program before start coding
5. Provide a description of your program
6. You must use methods in your program.
7. Appropriate identifier naming
8. Comments
9. Proper indentation
10. Follow the naming conventions
*/