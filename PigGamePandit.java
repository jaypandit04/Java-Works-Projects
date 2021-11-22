/*
Jay Pandit
09/19/2020(mm/dd/yyyy)
student ID: 301691780
*/

/*
Objective
Practice while loop, String class, Random class, conditional statements. 
Problem:
Write a program to play the dice game “Pig.” Pig is a two-player game. Player plays against the computer. 
*/

import java.util.*;
class PigGamePandit
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      Random rand = new Random();
     
      String player = description(kb);
      gameplay(kb,rand,player);
     
   }
   /*This method displays the instructions to play the game and return name of player.*/
   public static String description(Scanner kb)
   {
      System.out.print("Welcome to\n");
      System.out.println("PIG GAME");
     
      System.out.println("Please Enter your name");
      String name = kb.nextLine();
      System.out.println("Hi "+name);
      System.out.println("Please read the instructions carefully");
     
     
      System.out.println("1)Pig game is Human vs Computer game");
      System.out.println("2)Both players start off with zero points.");
      System.out.println("Computer roll the dice three times in a row, the sum of the dice will be players point");
     
      System.out.println("\nFinally!\n4)now Its your turn to play");
     
      System.out.println();
      System.out.println();
      
      return name;
     
   }
   
   public static void gameplay(Scanner kb, Random rand, String name)
   {
      boolean exit = true;
      int computerscore = 0;    //computer total score
      int score = 0;           // player total score
      int computertoss = 0;   //holds the sum of the three dice rolled
      int toss = 0;          //hold the value of the rolled dice for the player
      int playerRound = 0;  //number of the round player won
      int computerRound = 0;   //number of the round computer won
      String answer="";
      
     
      while(exit)
      {
       //reset all the variables to zero for a new round of the game
      
         computerscore = 0;
         score = 0;
         computertoss = 0;
         toss = 0;
         
       //loop until either the computer wins or the palyer wins
         while(!(computerscore >= 30 || score >= 30))
         {
         // generate three random numbers 1-6
                            
              //add the random numbers to the computer total points
                       
            //roll the dice by generating a randpm number between 1-6, store it in player toss
              
            for(int i=0;i<3;i++)
            {
               computertoss = rand.nextInt(6)+1;
               computerscore = computerscore + computertoss;
            }
         
            System.out.println();
            
                   
            toss = rand.nextInt(6)+1; 
            System.out.println("you got: "+toss);
                                 
            while(toss!=1)
            {
            
               score = score + toss;  //add the playerToss to the playerScore
               System.out.println("your current score: "+score); //display the player score
            
               System.out.println();
            
            
               System.out.println(name+", Enter any key to take your turn");
               //prompt the player to enter a key or enter end
               
            
               System.out.println("Or enter "+"end"+" to stop the game");
               System.out.println();
               System.out.println();
            
               answer = kb.next();
               
               //if the player enters "end" break ot of the loop
            
               if(answer.equalsIgnoreCase("end"))
                  break;
               
               //else roll the dice, by generating a random number 1-6
               else  
                  toss = rand.nextInt(6)+1; 
                          
               
               System.out.println("you got: "+toss); //display the number on the dice
            
               System.out.println();  
            
            }
         
            if(toss==1)
            {
               System.out.println(name+" you got a 1, and your turn is over ");
               score=0; // as player toss is equal to 1, points got reset
               System.out.println();
               System.out.println();
            }
            
             //reset the playerToss to zero
         
            toss=0;
         
         //check to see if the playerScore is gretaer than 30, if so  break out of the loop
            if(score>=30)
               break;
         
         }
        
        //check to see who was the winner 
      
         if(computerscore > score)
         {
            System.out.println("Computer is the winner!");
            System.out.println("computer score: "+computerscore+" -----"+" your score: "+score);
            System.out.println();
            computerRound++;
         }
         else
         {
            System.out.println(name+" is the winner!");
            System.out.println("computer score: "+computerscore+" -----"+" your score: "+score);
            System.out.println();
         
            playerRound++;
         }
         //ask if player wants to play another round
         System.out.println("Do you want to play another round?\nEnter any key to play or no to exit");
         answer = kb.next();
         if(answer.equalsIgnoreCase("no"))
            exit = false;
            
      }
      //display the final score
      System.out.println();
      System.out.println("-------------------- Final Score --------------------");
      System.out.println("Computer:  " + computerRound + "   "+ name +":  " + playerRound);
        
   }
   
   
   
}

/*
Problem
Write a program to play the dice game “Pig.” Pig is a two-player game. 
Player plays against the computer. Here is the algorithm to play the game:
1.Computer takes turn. Roll the dice three times and the sum of the dices will be added to the computer total points.
2.Player takes turn, 
   a.The player will be prompted to either enter a key or enter “end”
         i.If the player enters “end”, their turn is over. Goes back to step 1
         ii.If the player enters a key then a dice will be rolled, 
         If the dice is a one, the player losses all the points and computer turns start (go to step 1). 
         iii.If the dice is not a one, the dice will be added to the player’s total points, 
         the player will keep playing (go to step 2)
3.Whoever has 30 or more points will win the game
4.Player will be prompted for another round of game
         a.If the answer is yes start at step 1
         b.If the answer if no, end the game. 

*/