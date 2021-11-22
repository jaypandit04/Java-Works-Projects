/*
Jay Pandit
11/15/2020(mm/dd/yyyy)
student ID: 301691780
*/

/*
-Problem
Contact class
-ArrayList<Person> contacts
+Contact() //instantiates the arraylist contact +addContact(String name, String last, String phone) : boolean
Contact App
Create an app to keep track of the contact information of your friends. You are to implement your sort method to sort the contacts info based on the last name. Do not use any pre written sort methods from java classes. You must use the sorting and searching methods learned. No linear search can be used. The user of your app should be able to do the followings:
• Add contact
• Delete contact
• Search contact
• Update contact
• List contacts
*/

import java.util.*;
import java.io.*;

public class PersonP implements Comparable <PersonP> 
{   
   
   // Declare first, last and phone
   private String first;   
   private String last;   
   private String phone;   
  
  
   //Argument Constructor,  gets the arguments first name, last name, phone. 
   //Set the instance variables to the given arguments. 
 
   public PersonP(String fst, String lst, String phn) {          
      first = fst;      
      last = lst;      
      phone = phn;        
   }   
   
   // Set Phone number to n
   public void setPhone(String n) 
   {     
      phone = n;   
   }   
   
   // Set Method, First name to f
   public void setFirst(String f) 
   {     
      first = f;   
   }   
   
   // Sets last name to l
   public void setLast(String l) 
   {      
      last = l;   
   }   
   
   // return last name
   public String getLast() 
   {      
      return last;   
   }   
   
   // return first name
   public String getFirst() 
   {     
      return first;   
   }   
   
   //compare two persons first name. 
   //returns the value
   //concept of Interface
   public int compareTo(PersonP o) 
   {      
      int i = this.last.compareTo(o.getLast());
      if(i==0)
         return this.last.compareTo(o.getFirst());
      else
         return i; 
   }   
   
   // toString method formats output
   public String toString() 
   {   
   
      String s="";
      s = s + first+" ";
      s = s + last+" ";
      s = s + phone;   
      return s;   
   }   
   
   // Get Method, returns phone number
   public String getPhone() 
   {     
      return phone;   
   }   
   
   // Equals method compares the last name of person in arrayList
   public boolean equals(PersonP p) 
   {   
      return this.last.equalsIgnoreCase(p.last) && this.first.equalsIgnoreCase(p.first);   
   }
}

/*
 child class of Person.
 class creates  list of all the contacts.
*/

class Contact 
{   
   // Create an ArrayList 
   ArrayList<PersonP> contacts;
   
   private String first;   
   private String last;   
   private String phone; 
   
   //  method for adding contacts
   public Contact() 
   {   
      contacts = new ArrayList<PersonP>();
   }   
   
   // method adds the person's first, last name and contact number
   public boolean addContact(String first, String last, String phone) 
   {   
      PersonP P = new PersonP(first,last,phone);
       // use for loop compare the objects
      for(PersonP p:contacts) 
      {
         // If statment to compare the phonenumber, 
         // if the phonenumber is same it will return false.    
         if(p.getPhone().equalsIgnoreCase(phone)) 
         {
            return false;
         }
      }
      contacts.add(P);
      return true; 
   }   
   
   /*
   Use sequential search to find the contact in the list
   and delete it. method should return true 
   if the contact is found and deleted, 
   returning false otherwise 
   */
   public boolean deleteContact(String firstName) 
   {
      for(PersonP p: contacts) 
      {
           // If statment to compare the firstName of the person's name
         if(p.getFirst().equals(firstName)) 
         {
               // If it matches with the condition then it will return the true.
            contacts.remove(p);
            return true;
         }
      }
      return false;   
   }   
   
   //Method to search contacts information
   
   public String searchContact(String lastName) 
   {      
   
      for(PersonP p: contacts) 
      {
         // If statement to compare the last name of the person and return contact number           
         if(p.getLast().equals(lastName)) 
         {
            return p.getPhone();
         }
      }
      return null;             
   }  
   
   // GetList method, returns contact information
   public ArrayList<PersonP> getList() 
   {  
      return contacts;  
   }  
   
   
   //method formates output of program
   
   public String toString()  
   {    
      String t = "";
      for (int i = 0; i < contacts.size(); i++) 
      {
         t = t + contacts.get(i).getFirst() + " "; 
         t=  t + contacts.get(i).getLast() + " ";
         t = t + contacts.get(i).getPhone() + "\n";
      }
      return t;   
   }

 
   public void add(String name, String last, String phone)
   {
      PersonP p = new PersonP(first, last, phone);
      contacts.add(p); 
   }
   
   public void selectionSort()
   {
     //scan through the list many times      
       
      
      for(int i = 0; i < contacts.size(); i++)     
      {         
         String min = contacts.get(i).getLast();         
         int index = 0;         
         boolean swap = false;         
         
         //find the smallest element in the list         
         for(int j =  i + 1; j <contacts.size(); j++)         
         {            
            if(contacts.get(j).getLast().compareTo(min) < 0)            
            {              
               min = contacts.get(j).getLast();               
               index = j;               
               swap = true;           
            }         
         }         
           //swap         
         if(swap)         
         {            
            PersonP temp = contacts.get(i);           
            contacts.set(i,contacts.get(index));            
            contacts.set(index, temp);        
         }        
      }
     
   }
   
   public void insertionSort()
   {
      for(int i=0; i<contacts.size()-1; i++)
      {
         int j = i+1;
         PersonP s = contacts.get(j);
         while(j>0 && s.compareTo(contacts.get(j-1))< 0)
         {
            contacts.set(j,contacts.get(j-1));
            j--;
         }
        
         contacts.set(j,s);
      }
   }
   
   public void bubbleSort()
   {
      for(int i= 0; i < contacts.size(); i++)      
      {         
         for(int j = 0; j < contacts.size() - i - 1; j++)
         {           
          //swapping           
            if( contacts.get(j+1).compareTo(contacts.get(j)) < -1)          
            {              
               PersonP temp = contacts.get(j); 
               contacts.set(j,contacts.get(j+1));
               contacts.set(j+1,temp);           
                      
            }         
         }   
      }   
   }
      
  
   public int binarySearch(PersonP p)
   {
      
      int first = 0;     
      int last = contacts.size() - 1;    
      int mid = (first + last)/2;     
      while(first<=last )     
      {       
         if(contacts.get(mid).equals(p.getLast())) 
         {               
            return mid;
         }
         
         if(contacts.get(mid).equals(p.getLast()) && contacts.get(mid).equals(p.getFirst()) )
            first = mid + 1;
         else
            last = mid - 1;
         
         mid = (first + last ) /2;       
      }      
      return -1;   
   }         
}
           
//driver class
class ContactDriver {   
   
   public static void main(String[] args) throws FileNotFoundException  
   {  
       
      System.out.println("Your contact information");
      System.out.println("");
       
       // Create an object of type Directory
      Contact contactlist = new Contact();
      
      //adding contacts to list
      contactlist.addContact("Ana","Baily","568-345-9999");
      
      contactlist.addContact("Mary","Busta","111-222-3333");
      
      contactlist.addContact("Alex","Rodrigues","987-567-3333");
      
      contactlist.addContact("Sarah","Schulz","555-666-7777");
      
      contactlist.addContact("Richard","Smith","123-123-4567");
      
      //System.out.print(contactlist.toString());
      
      System.out.println();
       
       // sorts the peron's information from the list
      contactlist.selectionSort();
      
      System.out.print(contactlist.toString());
      
      System.out.println();

      
      contactlist.addContact("Zack", "Lambard","345-777-8989");
      
      contactlist.addContact("Alex","Cook","111-222-3333");
      
      contactlist.addContact("Roy","Trump","333-555-6666");
      
      contactlist.insertionSort();
      
      System.out.print(contactlist.toString());
      
      System.out.println();

      
      contactlist.addContact("Sarah", "Lee","888-999-9008");
      
      contactlist.addContact("AShly", "Lu","123-444-0780");
      
      contactlist.addContact("Jose","Brwon","111-999-6556");

      contactlist.bubbleSort();
      
      System.out.print(contactlist.toString());
      
      System.out.println();
      
      
            
 
    }
}

/*
Classes
You are required to implement the following classes in the given order
1. Person class
2. Directory class
3. Driver class
Person class
Here is the UML diagram for the Person class. Person class must implement the comparable interface. The methods in this class are pretty straight forward
Person
 -String first -String last -String phone
+Person(String first, String last, String phone) +getFirst() : String
+getLast(): String
+getPhone(): String
+setFirst(String n): void
+setLast(String l) : void
+toString() : String
+setPhone(String p)
+equals(Person other): Boolean
+compareTo(Person other) : int //compare two persons based on the last name.

Contact class
Directory
 1. Public Contact () : This constructor instantiates the ArrayList
2. Public boolean addContact(String name, String last, String phone): This method gets the
information for a person, creates a person object and adds it to the proper location in the list to keep the state of the list sorted. Don’t add it to the end of the list. Refer to the sample program posted on Canvas (PlayList). This method should return a boolean. Returning true means the contact was added, returning false means the contact is already in the list
3. Public boolean deleteContact(String last) : Use sequential search to find the contact in the list and delete it. The last name of the contact should be passed to this method. This method should return true if the contact is found and deleted, returning false otherwise
4. Public String searchContact(String last): This method gets the contact’s last name and returns the phone number of the given person. Search the list based on the last name. return type for this method is String. If the contact’s last name is not in the list return null.
5. public String toString(): returns a string representing all the contacts in the list
Driver class
This class should contain the following methods
1. main method: calls the run method
2. run method:
a. Create an object of type Directory: Directory myContact = new Contact ()
b. Populate myContact with the following contact information (call the addContact
method from the Directory class.
i. Ana Baily 568-345-9999 //myContact.addContact(new(“Ana”,”Baily”,” 568-345-
9999”));
ii. Mary Busta 111-222-3333
iii. Smith Richard 123-123-4567
iv. Alex Rodrigues 987-567-3333
v. Sarah Schulz 555-666-7777
c. Display the contact (call the toString method)
d. Remove Ana Baily from the contact
e. Display the contact to see if the person was removed
f. Search the contact for Smith Richard to get his phone number
g. Add a new contact of your choice to the contact ("Mary", "Brown","999-
100-1244")
h. Display the contact list to check if it was added.
Sample output
Your contact information


Ana Baily 568-345-9999 
Mary Busta 111-222-3333 
Alex Rodrigues 987-567-3333 
Sarah Schulz 555-666-7777 
Richard Smith 123-123-4567 

Removing Ana Baily from the contact

List of contact after removing Ana Baily 
Mary Busta 111-222-3333 
Alex Rodrigues 987-567-3333 
Sarah Schulz 555-666-7777 
Richard Smith 123-123-4567 
Searching the contact for Smith 
123-123-4567

Adding a new contact

Mary Brown 999-100-1244
Mary Busta 111-222-3333
Alex Rodrigues 987-567-3333
Sarah Schulz 555-666-7777
Richard Smith 123-123-4567

search for Dobeck that is not in the list 
Contact info not found
*/