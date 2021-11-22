/*
Jay Pandit
09/19/2020(mm/dd/yyyy)
student ID: 301691780
*/

/*
Problem
You have a store that you sell different items.  
In this pandemic you are interested to extend your services to people who shop online. 
Since you have learned Object Oriented Programming you want to develop an app for yourself.  
In implement your app you need the following two classes
•Item class
•onLineItem class( extends the Item class)

*/

import java.util.*;
public class ItemPandit
{
   private String barCode;
   private double price;
   private String name;
   private int quantity;
   private boolean shipment;
   
   //Argument Constructor,  gets the arguments barcode, price, name, quantity and ship as its parameters. 
   //Set the instance variables to the given arguments. 
   public ItemPandit(String barcode, double price, String nameP, int quantity, Boolean shipment)
   {
      setBarcode(barcode);
      setPrice(price);
      name = nameP;
      setQuantity(quantity);
      setShipment(shipment);
   }
   
   //no -argument constructor sets the instance variables to the default values 
   public ItemPandit()
   {
      barCode = null;
      price = 0;
      quantity =0;
      shipment = false;
   }
   
   
   //returns the barCode of the item 
   public String getBarcode()
   {
      return barCode;
   }
   
   //returns the price of the item
   public double getPrice()
   {
      return price;
   }
   
   //returns the quantity of the item
   public int getQuantity()
   {
      return quantity;
   }
   
   //returns the shipment of the item
   public boolean getShipment()
   {
      if(shipment==true)
         return true;
      else
         return false;
   }
   
  //sets the instance variable barCode to bar
   public void setBarcode(String bar) 
   {
      barCode = bar;
   }
   
   //sets the price to p
   public void setPrice(double p)
   {
      price = p;
   } 
   
   //sets the quantity to q
   public void setQuantity(int q) 
   {
      quantity = q;
   }
   
   //sets ship to s
   public void setShipment(boolean s) 
   {
      shipment = s;
   }

   //compares the barcode of the item other with the barcode of the this item. 
   //the code for this method is : return this.barcode.equals(other.barcode)
   public boolean equals(ItemPandit other)
   {
      if(this.barCode==other.barCode)
         return true;
      else
         return false;
   }
   
   //this methods returns a string representing the object attributes.   
   public String toString()
   {
      double cost = getCost();//stores cost value
     
      String output = "";//string formate bill
      output = output + name+","; //stores name
      output = output +"quantity= "+quantity+", "; //stores quantity
      output = output +"price = "+price+", "; //stores price
      //answer to shipment
      if(shipment==true)
         output = output +"This item can be shipped\n";
      else
         output = output +"This item cannot be shipped\n";
     
      
      output = output + "cost: "+ cost +"\n";
       
      return output;  //returns string
   }
   
   //This methods returns the total cost of the items purchased by multiplying the price by the quantity. 
   //Price * quantity and returns it
   public double getCost()
   {
      return price * quantity;
   }  
}

//this class extends the ItemPandit class since an OnlineItemPandit is an Item.
//Concept of Inheritance
class OnLineItem extends ItemPandit
{

//Declare public static final int SHIP_RATE = 3 // rate per pound at the very top before declaring 
//the instance variables  
   public static final int SHIP_RATE = 3;
   private double weight;
  

  //the first line of this constructor must be a call to the Item class constructor. 
  //This should be the first line of this constructor. super(barcode, price,name,quantity,ship) 
   public OnLineItem(String barcode, double price, String name, int quantity, Boolean shipment, double Weight)
   {
      super(barcode,price,name,quantity,shipment); //calling constructor from parent class
      setWeight(Weight);
   }
  
  //no argument constructor sets the weigth to zero. 
  //The first line of this constructor must be a call to the no argument constructor in the item class. 
  //The call is super ()
   public OnLineItem()
   {
      super();
      weight = 0;
   }
  
  //return the weight of the item
   public double getWeight()
   {
      return weight;
   }
  
  //sets the weight to w
   public void setWeight(double w)
   {
      weight = w;
   }
  
  // this method calls the equals method from the item class(super class). 
  //The code for this method should be return this.super.equals(other)
   public boolean equals(OnLineItem other)
   {
      return super.equals(other);  
      
   }
  
  //(): this method returns a string representing the onLineItem object. 
  //This method must call the toString method from the super class.  
  //To call the toString method from the Item class use this code: String s = super.toString();
  
   public String toString()
   {
      double shipmentcost = getShippingCost(); //variable stores shipment cost
      double totalcost = getTotalCost(); //var stores total cost
      String s = super.toString(); //string to formate output or bill
    
      s = s + "shipping cost: " +shipmentcost+"\n";
      s = s + "Total cost: " + totalcost + "\n";
      
      return s; //return string
   }
  
  /*
     this method calculates the shipping cost based on the quantity purchased, weigh and the rate. 
     Pay attention that the quantity is declared private in the item class. 
     To have access to it you must call the method getQuantity() in this method. 
     The code should be: double shippingCost = weight * SHIP_RATE * getQuantity() and then return 
     the shipping cost
  */
   
   public double getShippingCost()
   {
      double shipping = weight * SHIP_RATE * super.getQuantity();
      return  shipping;
   }
  
  //this method returns the total cost including the shipping cost. This method 
//1.calls the method getCost() from the super class to get the cost of the purchase. 
//2.Call the method getShippingCost() that you wrote in this class 
//3.Add the result from the step 1 and step 2 to get the total cost. Then return it

   public double getTotalCost()
   {
      return super.getCost() + getShippingCost(); //addition to total cost
   }
   
}

//Driver class
class ItemPanditDriver
{
  public static void main(String[]args)
  {
  
  //Method 1
    Scanner kb = new Scanner(System.in); //scanner class
    System.out.println("welcome to my online shopping store\n");
    System.out.println("Please enter number of item you want to enter");
    
    
    double total=0; //variable stores total cost in bill or final total cost
    int items = kb.nextInt(); //items variable is number of things user wants to purchase
    double[] cancel=new double[items+1];//stores just cost of items and helps to remove from total cost
    
    System.out.println();
    
    String[] bill = new String[items+1]; //array to formate list of items user wants to purchase
    

    
    for(int i=0;i<items;i++)
    {
    
      System.out.println("Please enter name of item"+(i+1));
      String nam = kb.next(); //var stores name of item
      
      System.out.println("Please enter quantity of item"+(i+1));
      int quant = kb.nextInt(); // var stores quantity
      
      System.out.println("Please enter price of item"+(i+1));
      double pr = kb.nextDouble(); //var stores price
      
      System.out.println("Please enter weight of item"+(i+1));
      double weight = kb.nextDouble();  //var stores weight

      
      System.out.println("Please enter barcode of item"+(i+1));
      String bar = kb.next(); //var stores barcode
       
      System.out.println("Do you want to get shipment, enter true or false");
      boolean ship = kb.nextBoolean(); //var stores true or false value of shipment
      //is shipment possible? conditon is required but as assignment has not mentioned
      // Contioned is not used
      
      
     
     
     OnLineItem f = new OnLineItem(bar,pr,nam,quant,ship,weight); //just a single object that can stores value in array
     
     cancel[i+1]= f.getTotalCost();
     bill[i+1] = f.toString(); //use of tostring method
     total = total + f.getTotalCost();     //adding total cost of each item
    }
    
    //prompts, does user wants to remove item from list?
    System.out.println("do you want to remove any item?,enter yes or no");
    String ans = kb.next();
    if(ans.equalsIgnoreCase("yes"))
    {
      int remove=0;
       do{
          System.out.println("please enter item number you want to remove item");
          remove = kb.nextInt();
          }while(remove>items);
      
      //if yes than it removes from list
       if(remove<=items)
       {
          
          total =  total - cancel[remove];
           
          bill[remove]= "item is removed\n";
          
       }
    
    }
    
    //printing the bill
    for(int j=1;j<bill.length;j++)
    { 
     System.out.println(bill[j]);
    }
    
    System.out.println("Total Cost of all items: "+total);
    
    System.out.println();
    System.out.println();
    System.out.println();
    
    //Method 2
    
    
    OnLineItem a = new OnLineItem("36361",5.0,"Soap",3,true,1);
    OnLineItem b = new OnLineItem("36362",5.0,"NoteBook",2,false,0);
    OnLineItem c = new OnLineItem("36363",2.0,"lamp",2,true,3);

    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(c.toString());
    
    System.out.println("Cost: "+a.getCost());
    System.out.println("Cost: "+b.getCost());
    System.out.println("Cost: "+c.getCost());
    
    System.out.println("shipment cost: "+a.getShippingCost());
    System.out.println("shipment cost: "+b.getShippingCost());
    System.out.println("shipment cost: "+c.getShippingCost());
    
    System.out.println(a.getTotalCost());
    
    total =0;
    total = total + a.getTotalCost() + b.getTotalCost()+c.getTotalCost();
    System.out.println("Total Cost of all items: "+total);
    System.out.println("Item notebook is remove");
    total = total + a.getTotalCost()+c.getTotalCost();
    System.out.println("Total Cost of all items: "+total);
    
  }
}
/*
Part 1
Create a class called Item.  Make sure to implement one method at a time, compile, move on to the next method. This class should be your public class and any other class you create should not have the keyword public. 
Instance Variables (State of the object , must be declared private)
•barCode holds the bar code for the item and its data type is String
•price holds the price of the item of type double
•name holds the name of the item of type String
• quantity holds the quantity purchased of type integer
•Ship holds true or false indicating if an item can be shipped or not

Methods(behavior)
constructors
public Item(String barcode, double price, String name, int quantity, Boolean ship):  Argument Constructor,  gets the arguments barcode, price, name, quantity and ship as its parameters. Set the instance variables to the given arguments. 
Public Item() : no -argument constructor sets the instance variables to the default values of: 
•Barcode = null
•Price = 0
•Quantity =0
•Ship = false

Getter methods
public String getBarcode(): returns the barCode of the item
public double getPrice(): returns the price of the item
public int getQuantity(): returns the quantity purchased
public boolean getShip(): returns weather the object can be shipped or not.true/false 

Setter methods(mutators)
public void setBarcode(String bar): sets the instance variable barCode to bar
public void setPrice(double p): sets the price to p
public void setQuantity(int q): sets the quantity to q)
public void setShip(boolean s): sets ship to s

equals method
public boolean equals (Item other): compares the barcode of the item other with the barcode of the this item. the code for this method is : return this.barcode.equals(other.barcode)

toString method
public String toString(): this methods returns a string representing the object attributes. Refer to the sample output to learn about the format. 

Behavior(other methods)
public double getCost():  This methods returns the total cost of the items purchased by multiplying the price by the quantity. Price * quantity and returns it
Compile the Item class. You cannot run this class since there is no main method. 
Part 2 
Create a class called OnlineItem with the following attributes. This class extends the Item class since an OnlineItem is an Item. therefore you need to write public class onLineItem extends Item
Static variable
Declare public static final int SHIP_RATE = 3 // rate per pound at the very top before declaring the instance variables
Attributes (instance variables, must be declared private)
•weight:  of type double holds the weight of the item


Constructors
public OnLineItem( String barcode, double price, String name, int quantity, Boolean ship, double weight): the first line of this constructor must be a call to the Item class constructor. This should be the first line of this constructor. super(barcode, price,name,quantity,ship)
public onLineItem(): no argument constructor sets the weigth to zero. The first line of this constructor must be a call to the no argument constructor in the item class. The call is super ()
Getter methods
Public double getWeigth(): return the weight of the item
Setter methods
public void setWeight(double w): sets the weight to w
equals method
public boolean equals (OnLineItem other): this method calls the equals method from the item class(super class). The code for this method should be return this.super.equals(other)
toString method
public String toString(): this method returns a string representing the onLineItem object. This method must call the toString method from the super class.  To call the toString method from the Item class use this code: String s = super.toString(); you need to add more code
Behavior

public double getShippingCost() : this method calculates the shipping cost based on the quantity purchased, weigh and the rate. Pay attention that the quantity is declared private in the item class. To have access to it you must call the method getQuantity() in this method. The code should be: double shippingCost = weight * SHIP_RATE * getQuantity() and then return the shipping cost
public double getTotalCost() : this method returns the total cost including the shipping cost. This method 
1.calls the method getCost() from the super class to get the cost of the purchase. 
2Call the method getShippingCost() that you wrote in this class 
3.Add the result from the step 1 and step 2 to get the total cost. Then return it
 
Part 4
Create a driver class and do the following. The following are to be done by calling methods form the OnlineItem class.   You are going to turn this part in. 
1. Create three objects of the onLineItem
2.Display each of the item on the screen by calling the toString method
3.Display the cost for each item, by calling the method getCost()
4.Display the shipping cost for each item, by calling the method getShippingCost
5.Display the total cost of the item including the shipping by calling the method getCost() 

*/