/*
Jay Pandit
11/01/2020(mm/dd/yyyy)
student ID: 301691780
*/

/*
Objectives
Practice Link list, List node, compareTo, user defined data type, interfaces

Movie List
Create a link list of the movies along with the rating, number of the people who watched the movie and the genre of the movie.

*/

import java.util.*;
public class MoviePandit implements Comparable <MoviePandit>
{
   private String name;
   private String genre;
   private double rating;
   private int people;
   
   //Argument Constructor,  gets the arguments name, genre, rating, and people as its parameters. 
   //Set the instance variables to the given arguments. 
   public MoviePandit(String Name, String Genre, double Rating, int audiences) 
   {          
      name = Name;      
      genre = Genre;      
      rating = Rating; 
      people = audiences;      
   }  

   //returns the name of the movie
   public String getName() 
   {      
      return name;   
   }  
   
   //sets name of the movie to Name
   public void setname(String Name) 
   {      
      name = Name;   
   }
   
   //returns the genre of the movie
   public String getGenre() 
   {      
      return genre;   
   } 
   
   //sets the genre of the movie to Genre
   public void setgenre(String Genre) 
   {      
      genre = Genre;   
   }
   
  //returns the rating of the movie 
   public double getRating() 
   {
      return rating;
   }
   
   //sets the rating of the movie
   public void setrating(double rate) 
   {
      rating = rate;
   }
   
   //returns the number of people have seen the movie
   public int getNumPeople() {
      return people;
   }
   
   //sets the number of people seen the movie to audience
   public void setnumpeople (int audience) 
   {
      people = audience;
   }
   
   //this methods returns a string representing the object attributes. 
   public String toString() 
   {      
      String s=""; //s refers to output of program
      s = s +"\n"+ name + ", ";
      s = s + genre + ", ";
      s = s + rating + ", ";
      s = s + people+"\n";
      
      return s;   
   }  
   
   //compares the name of the movie other with the name of the this movie. 
   //the code for this method is : return this.barcode.equals(other.barcode)

   public int compareTo(MoviePandit object) 
   {      
      return this.name.compareTo(object.getName());   
   } 
   
   //the code for this method is : return this.genre.equals(other.genre)

   public boolean equals(MoviePandit object) 
   {   
      return this.genre.equalsIgnoreCase(object.genre);   
   }
 
}

//ListNode class
//Attributes: each node has two attributes
//1.Private Movie m;
//2.Private ListNode next

class ListNode 
{
   private MoviePandit movie;	
   private ListNode next;
   
   
   //Constructor
   public ListNode(Object o)    
   {     
      if (o instanceof MoviePandit)      
      {        
         MoviePandit m = (MoviePandit)o;         
         this.movie  =  m;      
      }      
   } 
   //Constructor   
   public ListNode(Object o, ListNode next)    
   {     
      if(o instanceof MoviePandit)     
      {         
         MoviePandit m = (MoviePandit)o;
         movie = m;      
         this.next = next;     
      }   
   }
   
   //setsNext method   
   public void setNext(ListNode n)    
   {      
      this.next = n;   
   }
    
    //getMovie method   
   public MoviePandit getMovie()    
   {      
      return movie;   
   }
   //getNext method   
   public ListNode getNext()   
   {      
      return next;  
   }  
}

//implementing concept of interface
interface list 
{
   
   public void add(String name, String genre, int star, int people);  
   public void add(int index, String name, String genre, int star, int people);  
   public int indexOf(String movieName); 
   public void remove(String movieName); 
   public int size(); 
   public String toString();
   public MoviePandit get(int position); 
}


class MovieList implements list 
{
   
   private ListNode front; 
   public static int size = 0; 
   
   //constructor 
   public MovieList()
   {
      front = null;
   } 
   
   public MovieList(MoviePandit m)
   {
      front = new ListNode(m);
   }

   //add the movie to the end of the list 
   public void add(String name, String genre, int star, int people)
   {
           
      MoviePandit m = new MoviePandit(name,genre,star,people);
     
      ListNode curr = front;
     
      if(front == null)
      {
         front = new ListNode(m);        
         size++;        
         return;
      }
      
       
      
      ListNode n = new ListNode(m);
      while (curr.getNext()!= null) 
      {
         curr = curr.getNext();
      } 
      
      size++;
      curr.setNext(n);
         
      
   } 

   //adds the movie at the given index 
   public void add(int index, String name, String genre, int star, int people)
   {
      MoviePandit m = new MoviePandit(name,genre,star,people);      
      
      if(index > size)
      // if the index does not exist in the list        
         return;        
      //adding it to the begining of the list      
      if(index == 0)      
      {        
         ListNode n = new ListNode(m);         
         n.setNext(front);         
         front = n;         
         size++;         
         return;      
      }       
      //make a copy of the front node     
      ListNode curr = front;     
      int i = 0;     
      //find the proper index      
      while(curr.getNext() != null && i < index-1)     
      {       
         curr = curr.getNext();       
         i++;     
      }       
      //create a new node    
      ListNode n = new ListNode(m);     
      //n needs to point to current.next     
      n.setNext(curr.getNext());     
      //current needs to point to n     
      curr.setNext(n);     
      size++;   
   } 

   //returns the movie at the given index 
   public int indexOf(String movieName)
   {
      //if the list is empty        
      if(front == null)           
         return -1;        
      if(movieName.equals(front.getMovie().getName()))        
      {           
        //front = front.getNext();          
         return 0;
      }         
      //node is somewhere in the list          
      ListNode curr = front;        
      int index = 0;      
      
      while(curr!= null && index < size)      
      {         
         if(curr.getMovie().getName().equals(movieName))             
            return index;          
         curr = curr.getNext();          
         index++;          
      }          
      return -1;
   } 

   //removes the movie from the list
   
   public void remove(String movieName)
   {  
      //if the list is empty     
      if(front == null)          
         return;      
         
      
      
      //check to see if we need to remove the first element     
      if(front.getMovie().getName().equals(movieName))      
      {          
         front = front.getNext();            
         return;      
      }       
            
      ListNode curr = front; 
      ListNode pre = front;         
      while(curr!= null && !(curr.getMovie().getName().equals(movieName)) ) 
      {
         pre = curr;         
         curr = curr.getNext();                       
      }
      if(curr!=null)      
         pre.setNext(curr.getNext());       
      size--;      
           
   } 

   //returns the size of the list 
   public int size() 
   {
      return size+1;
   } 
   
   //create a string from all the movies in the list 
   public String toString()
   {
      if(front == null)       
         return "";     
      
      ListNode curr = front;     
      String s = " ";    
      
      while(curr != null)     
      {        
         s = s + curr.getMovie().toString() + " ";      
         curr = curr.getNext();    
      }        
     
      return s + " ";   
   } 

   //returns the movie at the given index 
   public MoviePandit get(int pos)
   {
      if(front == null)       
         return null;     
      
      if (pos > size)
         return null;        
         //make a copy of the front of the list     
      
      ListNode curr = front;     
      int index = 0;     
      
      while(curr!= null && pos != index)     
      {       
         index++;       
         curr = curr.getNext();        
      }     
      
      if(curr == null)          
         return null;    
      return curr.getMovie();    
   }  

   //returns the list of the movie with the give star
   public String getMovie(int star)
   {
      ListNode curr = front;
      String highrating = "";
      
      
      while(curr.getMovie().getRating() >= star) 
      {
          
         if(curr.getMovie().getRating() == star)
         {
           highrating = highrating + curr.getMovie().getName()+" "; 
           highrating = highrating + curr.getMovie().getGenre()+" ";
           highrating = highrating + curr.getMovie().getRating()+" ";
           highrating = highrating + curr.getMovie().getNumPeople()+"\n";
         }
         curr = curr.getNext();
      }
      
      
      return highrating;
   } 

   //return the movie with the max number of peopel watched. 
   public MoviePandit mostWatched()
   {
      int mostwatched = 0;
      
      ListNode current = front;
      while (current != null) 
      {  
         mostwatched = current.getMovie().getNumPeople();               
         current = current.getNext();
                              
         if(current.getMovie().getNumPeople()>mostwatched)
            return current.getMovie();
                
        
      }
      return current.getMovie();
   } 
}

//driver class of MoviePandit

class Driver
{
   public static void main (String [] args)
   {
      MovieList list = new MovieList();
      
      list.add("Reservoir Dogs", "drama",5, 20000);
      list.add("Airplane", "Funny", 3, 1200);
      list.add("Doctor Zhivago","comedy", 4,23000);
      list.add("The Deer Hunter", "Family", 3, 2345);
      
      System.out.println("Here is the list of the movies\n");
      
      System.out.println(list);
      
      
      System.out.println("\nhere is the the movie that was most watched\n");
      
      System.out.println(list.mostWatched());
      
      System.out.println("Here is the list of 5 stars ratings");
      
      System.out.println(list.getMovie(5));
      System.out.println();
      
      System.out.println("removing Reservoir movie");
      System.out.println();
      
      list.remove("Reservoir Dogs");
      
      System.out.println(list);
      System.out.println();
      
      System.out.println("Displaying the second movie in the list");
      System.out.println();
      
      System.out.println(list.get(1));
      System.out.println();
      
      System.out.println("adding a movie at position 2");
      System.out.println();
      
      list.add(2, "Up", "Carton",3,4500);
      
      System.out.println(list);
      
      int i = list.indexOf("Up"); 
      
      System.out.println("The movie up is in the position " + i); 
   }
} 
/*
Required classes
•Movie class
•ListNode class
•MovieList class
•List interface
•Driver class
Movie class implements Comparable
Attributes: movie’s name, genre, rating, number of people watched
Methods: constructor, getter, setter, equals, compreTo, toString
ListNode class
Attributes: each node has two attributes
1.Private Movie m;
2.Private ListNode next
Methods: 
Constructors 
 public ListNode(Movie m): initializes the instance variable m
 public ListNode() : empty body 
public ListNode(Movie m, ListNode next): initializes the  instance variables m and next
getter methods
public Movie getMovie()
public ListNode getNext()

setter methods
 public void setNext(ListNode next)

List interface
public void add(String name, String ganra, int star, int people);  
public void add(int index, String name, String genre, int star, int people);  public int indexOf(String movieName); 
public void remove(String movieName); 
public int size(); 
public String toString();
public Movie get(int position); 

MovieList implements List : 
all the methods in this class must use link list concept
public class MovieList implements List
{ 
private ListNode front; 
public static int size = 0; 
//constructor 
public MovieList(){} 
//add the movie to the end of the list 
public void add(String name, String ganra, int star, int people){} 
//adds the movie at the given index 
public void add(int index, String name, String ganra, int star, int people){} 
//returns the movie at the given index 
public int indexOf(String movieName){} 
//removes the movie from the list 
public void remove(String movieName){} 
//returns the size of the list 
public int size(){} 
//create a string from all the movies in the list 
public String toString(){} 
//returns the movie at the given index 
public Movie get (int pos){} //returns the list of the movie with the give star 
public String getMovie(int star){} 
//return the movie with the max number of peopel watched. 
public Movie mostWatched(){} 

Driver class
Make sure that your code works with the following driver. Copy and paste this class to your file. 
class Driver
{
public static void main (String [] args)
 {
MovieList list = new MovieList();
list.add("Reservoir Dogs", "drama",5, 20000); 
list.add("Airplane", "Funny", 3, 1200);
list.add("Doctor Zhivago","comedy", 4,23000);
list.add("The Deer Hunter", "Family", 3, 2345);
System.out.println("Here is the list of the movies\n");
System.out.println(list);
System.out.println("\nhere is the the movie that was most watched");
System.out.println(list.mostWatched());
System.out.println("Here is the list of 5 stars ratings");
System.out.println(list.getMovie(5));
System.out.println("removing Reservoir movie");
list.remove("Reservior Dogs");
System.out.println(list);
System.out.println("Displaying the second movie in the list");
System.out.println(list.get(1));
System.out.println("adding a movie at position 2");
list.add(2, "Up", "Carton",3,4500);
System.out.println(list);
int i = list.indexOf("Up"); 
System.out.println("The movie up is in the position " + i); 
}
} 
Sample output
Here is the list of the movies

Reservoir Dogs, drama, *****, 20000
Airplane, Funny, ***, 1200
Doctor Zhivago, comedy, ****, 23000
The Deer Hunter, Family, ***, 2345


here is the the movie that was most watched
Doctor Zhivago, comedy, ****, 23000

Here is the list of 5 stars ratings
Reservior Dogs, drama, *****, 20000


removing Reservoir movie
Airplane, Funny, ***, 1200
Doctor Zhivago, comedy, ****, 23000
The Deer Hunter, Family, ***, 2345

Displaying the second movie in the list
Doctor Zhivago, comedy, ****, 23000

adding a movie at position 2
Airplane, Funny, ***, 1200
Doctor Zhivago, comedy, ****, 23000
Up, Carton, ***, 4500
The Deer Hunter, Family, ***, 2345

The movie up is in the position 2


*/