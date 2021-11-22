/*
Jay Pandit
09/19/2020(mm/dd/yyyy)
student ID: 301691780
*/

/*
Objective
Practice polymorphism, array of objects, Object class and interfaces
Problem
Amtrak has asked us to create an application to help them keep track of the list of their passengers in a given train. They also want to be able to do the following to list of the passengers
•Display the information of all the passengers in the train 
•Delete a passenger from the list in a train
•Add a passenger to the list of the train
•Count the number of the passengers in the train
•Search the list of the passengers to find a particular person in the train
A passenger has the following attributes in a train
•Name
•Last name
•contact
•Seat number 
•Class (first class, coach class, business class)

*/
import java.util.*;
public class PersonPandit
{
   private String firstname;
   private String lastname;
   private String contact;
  
  //Argument Constructor,  gets the arguments name,last,number
  //Set the instance variables to the given arguments. 

   public PersonPandit(String name, String last, String number)
   {
      this.firstname=name;
      this.lastname=last;
      this.contact=number;
   }
  
  //no -argument constructor sets the instance variables to the default values 

   public PersonPandit()
   {
      firstname = null;
      lastname = null;
      contact = null;
   }
  
  //returns first name
   public String getname()
   {
      return firstname;
   }
  //return last name
   public String getlast()
   {
      return lastname;
   }
  
  //return contact
   public String getcontact()
   {
      return contact;
   }

//sets first name to name
   public void setFirstname(String name)
   {
      firstname = name;
   }
  //sets last name to name
   public void setLastname(String last)
   {
      lastname = last;
   }
  //sets contact to number
   public void setContact(String number)
   {
      contact = number;
   }

  //compares the last name of the person to other with the name of the the person.
   public boolean equals(Object o)
   {
      if(o instanceof PersonPandit)
      {
         PersonPandit f = (PersonPandit)o;
         return f.lastname.equalsIgnoreCase(this.lastname);
      }
      else
         return false;
   }
   
   //output of name,last name, contact
   @Override
   public String toString()
   {
     
      String s="";
     
      s = s + "Name: "+firstname+"\n";
      s = s + "Last: "+lastname+"\n";
      s = s + "contact: "+contact+"\n";
     
      return s;
   }
}

//concept of inheritance, inherits personpandit to passengers
class Passenger extends PersonPandit
{
   private int seatNum;
   private String classType;
  
  //Argument Constructor,  gets the arguments name,last,number,seat,type
  //Set the instance variables to the given arguments. 
   public Passenger(String name, String last, String number,int seat, String type)
   {
      super(name,last,number);
      setSeatNum(seat);
      setClassType(type);
   }
  
  //no -argument constructor sets the instance variables to the default values 
   public Passenger()
   {
      seatNum=0;
      classType=null;
   }
  
   //returns seat number
   public int getSeatNum()
   {
      return seatNum;
   }
 
 //returns class type(coach,etc)
   public String getclassType()
   {
      return classType;
   }
  //sets seat num to seat
   public void setSeatNum(int seat)
   {
      seatNum=seat;
   }
  //sets class tupe to type
   public void setClassType(String type)
   {
      classType=type;
   }
   
   //output of program
   @Override
   public String toString()
   {
      String s = super.toString();
      s = s + "Seat number: "+ seatNum+"\n";
      s = s + "Class: "+ classType+"\n";
   
      return s;
   }
}

//concept of interfaces
interface list
{
   public boolean add(Object o); 
   public Object search(Object o);
   public boolean delete(Object o);
   public void printLast();

}
//concept of polymorphism and Has-a relation with personpandit and passengers
class Train implements list
{
   Passenger[] train;
  
   private static int count = 0; // number of the passengers in the train   
  
   public Train()   
   {       
      train = new Passenger[5];  
   } 
   
   //stores number of passengers  
   public static int getCount()
   {
      return count;
   }
   
   //output of program
   public String toString()
   {
      String s="";
      if(train.length>0)
      {
         for(int i=0;i<count;i++) 
         {
            if(train[i]!=null)
            {
               s = s+ train[i].toString() + "\n";
            }
         }
      }
      return s; 
    
   }
   //adds the passengers to train
   @Override
   public boolean add(Object o)
   {
      if(o instanceof Passenger)
      {
         Passenger p1 = (Passenger)o;
         train[count] = p1;
         count++;
         return true;
      }
      else
         return false;
   
  
   } 
   
   //search your name, Are you on train?
   @Override
   public Object search(Object o)
   {
   
      boolean b1 = o instanceof String; 
     
      if(!b1) 
         return null;
     
      String name = (String)o; 
    
      for(int i = 0; i< count; i++)
      {
         if(train[i].getlast().equalsIgnoreCase(name))
            return train[i];    
      }
     
      return null;
   
   }
   
   //Do you want to cancel reservation? The method cancels your name
   
   @Override
   public boolean delete(Object o)
   {
      boolean b1 = o instanceof String; 
      int a=0;//stores number to delete from list
      
      if(!b1) 
         return false;    
      
      String names = (String)o; 
    
      for(int i=0;i< count;i++)
      {
         if(train[i].getlast().equalsIgnoreCase(names))
         {
            a=i;    
         }     
      }
      //delete from list
      if(a==0 || a!=0)
      {
         train[a]= null;
         count--;
         return true;
      }
     
       
      return false;
   }
   //print last name of all passengers
   @Override
   public void printLast()
   {
      for (int j=0;j<count;j++) 
      {
       
        System.out.println(train[j].getlast());
         
      }
   
   }

   
}

class Driver
{   
   public static void main(String[] args)  
   { 
      Scanner kb = new Scanner(System.in);
     
      Train myTrain = new Train();
      
      Passenger p1 = new Passenger("Alex", "Mano","123-456-7893", 12, "First class");
      Passenger p2 = new Passenger("Mary", "Trump","123-456-4894", 23, "Coach class");
      Passenger p3 = new Passenger("Ali", "Busta","123-456-7890", 34, "Business class");
      Passenger p4 = new Passenger("Drew", "Brin","123-564-7893", 42, "Second class");
      Passenger p5 = new Passenger("Peter", "Sayason","123-456-7893", 52, "Second class");
        
        //adds passengers         
      myTrain.add(p1);
      myTrain.add(p2);
      myTrain.add(p3);
      myTrain.add(p4);
      myTrain.add(p5);
      
      System.out.println(" Last name ");
      myTrain.printLast();

      System.out.println();
      System.out.println();
      
      System.out.println(myTrain.toString());
      //counts number of passengers
      System.out.println("This train has " + Train.getCount() + " passengers\n");
      
      System.out.println("Testing the search method.");
      System.out.println("Enter the last name of the passenger: \n");
      String answer = kb.nextLine(); 
      
      System.out.println(myTrain.search(answer));
                
      System.out.println("\nTesting the delete method.\n");
      System.out.println("Enter the last name of the passenger: \n");
      answer = kb.nextLine(); 
     
      if(myTrain.delete(answer))
      {
         System.out.println("Passenger "+ answer + " has been removed from the list");
      }
      else 
      {
         System.out.println("Passenger "+ answer + " is NOT present in the train");
              
      }
      
      System.out.println(" the Updated list: ");
      System.out.println(myTrain.toString());
      
            
   }
}
/*
Design
In order to apply the OOP, we will need to create the following classes
1.Person class with the attributes, name, last, and contact.  This class will have the constructor, getter methods, setter methods, equals method and toString method. The method header for the equals method must be: public boolean equals (Object o). In this method you must use instanceof keyword to make sure that the parameter o passed to this method is of type Person, then type cast it to the Person class.  Then compare the last names of the two objects. 

2.Passenger class extends the person class and has the following attributes.  (is-a relationship), Seat number, Class (first, coach, business). This class will have constructor, getter methods, setter methods, toString method, remember to call the toString methods from the parent class in the toString method for this class. . There is no need to override the equals method from the Person class.  
3.Train class has a list of the passengers (has -a relationship). 
a.Therefore, the attribute for this class is an array of passengers (Passenger [] train). 
b.This class should have a class variable to count the number of the passengers in the train. 
c.This class must have a constructor to instantiate the array of passengers (train = new Passenger [10]).  
d.Implement the toString method by using a for loop traversing the list(array) of the passengers, call the tostring method on each element of the array(train[i].toString()). 
e.This class implements the List interface providing the body for the methods add, search, delete, and printLast. 
public boolean add(Object o): This method gets the Object o as its parameter. This method must check the class type of the Object o by using the keyword instanceof. if the type is of type Passenger, type cast it to the Passenger class then add it to the array. Every time a Passenger is added to the list, the class variable count must be incremented. 
public Object search (Object o): this method gets the Object o as its parameter. However, the Object o represents the passenger’s last name therefore using the keyword instanceof we check the class of the Object o to see if it is string type. ,if it is then type cast o to String class. Then search the array using the last name. Here is the code for this method;
public Object search(Object o)
{ 
 boolean b = o instanceof String; 
 if(!b) return null;
 String name = (String)o; 
 for(int i = 0; i < count; i++)
 {
  if(train[i].getLast().equals(name))
  { 
return train[i]; } }
return null;
}
public boolean delete(Object o): this method is very similar to the search method. Once you find the passenger in the list, delete it from the list by setting it to null.

public void printLast(): this method uses a for loop to display the last name of the passengers in the train. Method getLast from the person class must be called. (train[i].getLast())

4.	List interface that will be implemented by the Train class. The purpose for this interface is to make sure that the Train class implements the behaviors such as: 
public boolean add(Object o) 
public Object search(Object o);
public boolean delete(Object o);
public void printLast();
5.Driver class: in this class do the following
a.Instantiate an object of the Train class: Train myTrain = new Train()
b.Create 5 objects of type passengers: Passenger p1 = new Passenger ("Alex", "Mano","123-456-7893", 12, "First class");
c.Add the passengers to myTrain by calling the add method: mytrain.add(p1) 
d.Display the last name of all the passengers (myTrain.printLast())
e. Prompt the user for a last name to search the list of the passengers. If the passenger found in the list display their info(myTrain.serach(“Mano”))
f.Prompt the user for a last name to delete it from the list of the passengers.  myTrain.delete(“Mano”)  
g.Call the toString method to display the updated list (System.out.println(myTrain)) 

*/